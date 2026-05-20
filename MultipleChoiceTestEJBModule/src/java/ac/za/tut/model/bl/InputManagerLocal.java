/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface InputManagerLocal {
    //
    boolean validateInput(String input);
    //
    boolean isValidGeneralMathQuestion(String input);
    //
    boolean isAnswerValid(String input);
    //
    boolean isValidStudentNumber(String accountNumber);
    //
    boolean validateNameorSurname(String input);
}
