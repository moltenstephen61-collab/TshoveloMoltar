/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class MessageValidater implements MessageValidaterLocal {

    @Override
    public boolean validateMessage( String message)  {
        //
        String message_1 = message.toLowerCase();
        //
     return message_1.matches("[a-z\\s,.]+");
    }
    //
    @Override
    public int calculateTotalNumberofVowels(String message){
        //
        int total_vowels;
        //
        String new_String = message.replaceAll("[aeiou]", "");
        //
        return total_vowels = message.length() - new_String.length();
    }
    //
    @Override
    public int calculateTotalNumberofConsonants(String message){
        //
        int total_vowels;
        //
        String new_String = message.replaceAll("[aeiou]", "");
        //
        return total_vowels = new_String.length();
    }
    //
    @Override
    public List<String> findUniqueWords(String message) {
    if (message == null || message.trim().isEmpty()) {
        return new ArrayList<>();
    }

    String[] new_String = message.toLowerCase().split(" ");
    List<String> uniqueWords = new ArrayList<>();

    for (int i = 0; i < new_String.length; i++) {
        boolean isUnique = true;

        for (int j = 0; j < new_String.length; j++) {
            if (i == j) {
                continue; 
            }

            if (new_String[i].equalsIgnoreCase(new_String[j])) {
                isUnique = false;
                break; 
            }
        }

        if (isUnique) {
            uniqueWords.add(new_String[i]);
        }
    }

    return uniqueWords;
}
    //
    @Override
    public List<String> findRepeatingWords(String message) {
     //
     String[] new_String = message.toLowerCase().split(" ");
     List<String> repeatingWords = new ArrayList<>();
     //
    for(int i = 0 ; i < new_String.length ; i++){
    for(int j = i+1 ; j < new_String.length ; j++ ){
        if(new_String[i].equalsIgnoreCase(new_String[j])){
            repeatingWords.add(new_String[i]);
        }
      }
    }

     //
     return repeatingWords;
    }
    //

    @Override
    public int lengthOfMessage(String message) {
      //
      int messageLength = message.length();
      //
      return messageLength;
    }
}
