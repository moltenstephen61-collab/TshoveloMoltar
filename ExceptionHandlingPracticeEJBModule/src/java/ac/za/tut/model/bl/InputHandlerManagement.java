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
public class InputHandlerManagement implements InputHandlerManagementLocal {

    @Override
    public boolean validateNameAndSurname(String name, String surname) {
     //
     boolean isValid = false;
     //
     if(name != null && surname != null && name.matches("[A-Za-z]+") && surname.matches("[A-Za-z]+")){
         //
         isValid = true;
     }
     //
     return isValid;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean validateIDandStudentNumber(String id, String studentNumber) {
      //
      boolean isValid = false;
      //
      if(id != null && studentNumber != null && id.matches("\\d{13}") && studentNumber.matches("\\d{9}")){
          isValid =  true;
      }
      return isValid;
    }

    @Override
    public boolean validateMessage(String message) {
     //
     String message_lowercased = message.toLowerCase();
     //
     boolean isValid = false;
     //
     if(message_lowercased != null && message_lowercased.matches("[a-z\\s,.]+")){
         isValid = true;
     }
     return isValid;
    }

    @Override
    public boolean validateNumbers(String num1, String num2) {
     //
     boolean isValid = false;
     //
     int num_1 , num_2;
     //
     if(num1 != null && num2 != null && num1.matches("\\d+") && num2.matches("\\d+") && Integer.parseInt(num1) > 0 && Integer.parseInt(num2) > 0){
         isValid = true;
     }
     //
     return isValid;
    }
}
