/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.ShortMessage;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface ShortMessageFacadeLocal {

    void create(ShortMessage shortMessage);

    void edit(ShortMessage shortMessage);

    void remove(ShortMessage shortMessage);

    ShortMessage find(Object id);

    List<ShortMessage> findAll();

    List<ShortMessage> findRange(int[] range);

    int count();
    //
    boolean validateShortMessage(String message);
    //
    int lengthOfMessage(String message);
    int countVowels(String message);
    int countConsonats(String message);
    //
    String uniqueWords(String message);
    String repeatingWords(String message);
    //
    ShortMessage getReportOfLongestMessage();
    
}
