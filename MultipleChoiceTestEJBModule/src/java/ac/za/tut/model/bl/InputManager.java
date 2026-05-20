/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import javax.ejb.Stateless;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class InputManager implements InputManagerLocal {

    @Override
    public boolean validateInput(String input) {
      //
      return input != null && input.matches("^[0-9]+$");
    }

    @Override
    public boolean isValidGeneralMathQuestion(String input) {
       //
       return input != null && input.matches("^[A-Za-z0-9 +*/=-%]+\\?$");
    }

    @Override
    public boolean isAnswerValid(String input) {
     //
     return input != null && input.matches("^[A-D]$");
    }
    @Override
    public boolean isValidStudentNumber(String accountNumber) {
        return accountNumber != null && accountNumber.matches("\\d{9}");
    }
    @Override
    public boolean validateNameorSurname(String input) {
    // Matches only letters (both uppercase and lowercase)
    return input != null && input.matches("^[A-Za-z]+$");
}
    
}
