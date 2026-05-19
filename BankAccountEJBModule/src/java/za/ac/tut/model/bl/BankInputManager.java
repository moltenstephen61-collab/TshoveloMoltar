/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class BankInputManager implements BankInputManagerLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public boolean isValidString(String input) {
     //
     return input != null && input.matches("^[A-Za-z]+$");
    }

    @Override
    public boolean isValidAccountNumber(String accountNumber) {
        return accountNumber != null && accountNumber.matches("\\d{10}");
    }

    @Override
    public boolean isValidBalance(String balanceString) {
       return balanceString != null && balanceString.matches("\\d+(\\.\\d{1,2})?"); 
    }
}
