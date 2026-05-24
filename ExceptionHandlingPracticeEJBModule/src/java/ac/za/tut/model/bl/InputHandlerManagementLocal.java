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
public interface InputHandlerManagementLocal {
    //
    boolean validateNameAndSurname(String name , String surname);
    //
    boolean validateIDandStudentNumber(String id , String studentNumber);
    //
    boolean validateMessage(String message);
    //
    boolean validateNumbers(String num1 , String num2);
}
