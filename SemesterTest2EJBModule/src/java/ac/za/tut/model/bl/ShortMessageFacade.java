package ac.za.tut.model.bl;

import ac.za.tut.model.entity.ShortMessage;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class ShortMessageFacade extends AbstractFacade<ShortMessage> implements ShortMessageFacadeLocal {

    @PersistenceContext(unitName = "SemesterTest2EJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShortMessageFacade() {
        super(ShortMessage.class);
    }

    @Override
    public boolean validateShortMessage(String message) {
        // Fix: Check for null BEFORE doing any string manipulation
        if (message == null) {
            return false;
        }
        String new_message = message.toLowerCase();
        return new_message.matches("[a-z\\s,.]+");
    }

    @Override
    public int countVowels(String message) {
        if (message == null) return 0;
        String new_message = message.toLowerCase().replaceAll("[^a-z]", "");
        return new_message.length() - new_message.replaceAll("[aeiou]", "").length(); 
    }

    @Override
    public int countConsonats(String message) {
        if (message == null) return 0;
        String new_message = message.toLowerCase().replaceAll("[^a-z]", "");
        return new_message.replaceAll("[aeiou]", "").length(); 
    }

    @Override
    public int lengthOfMessage(String message) {
        if (message == null) return 0;
        return message.length();
    }

    @Override
    public String uniqueWords(String message) {
        if (message == null || message.trim().isEmpty()) return "";
        
        // Split by spaces, but strip out commas/periods so words match cleanly
        String[] words = message.replaceAll("[,.]", "").split("\\s+");
        List<String> uniqueWords = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            boolean hasDuplicate = false;
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].equalsIgnoreCase(words[i])) {
                    hasDuplicate = true;
                    break;
                }
            }
            // Fix: Check and add ONLY after the inner loop finishes checking all words
            if (!hasDuplicate) {
                uniqueWords.add(words[i]);
            }
        }
        return String.join(", ", uniqueWords);
    }

    @Override
    public String repeatingWords(String message) {
        if (message == null || message.trim().isEmpty()) return "";
        
        String[] words = message.replaceAll("[,.]", "").split("\\s+");
        List<String> repeatingWords = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            // Fix: Reset the flag to false for EVERY new word we inspect
            boolean hasDuplicate = false; 
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].equalsIgnoreCase(words[i])) {
                    hasDuplicate = true;
                    break;
                }
            }
            
            // Fix: Keep lowercase formatting or uniform matching to ensure no duplicates in your output list
            String wordLower = words[i].toLowerCase();
            if (hasDuplicate && !repeatingWords.contains(wordLower)) {
                repeatingWords.add(wordLower);
            }
        }
        return String.join(", ", repeatingWords);
    }
}