/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface MessageValidaterLocal {
    //
    boolean validateMessage(String message);
    //
    int calculateTotalNumberofVowels(String message);
    //
    int calculateTotalNumberofConsonants(String message);
    //
    List<String> findUniqueWords(String message);
    //
    List<String> findRepeatingWords(String message);
    //
    int lengthOfMessage(String message);
    
}
