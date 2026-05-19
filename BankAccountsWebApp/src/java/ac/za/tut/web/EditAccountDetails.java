/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.AccountFacadeLocal;
import java.io.IOException;
import java.time.LocalDate;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.BankInputManagerLocal;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class EditAccountDetails extends HttpServlet {
    @EJB
    private BankInputManagerLocal biml;
    @EJB
    private AccountFacadeLocal afl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Extract all request parameters from the form
        String account_number = request.getParameter("acc_number");
        String account_type = request.getParameter("acc_type");
        String balanceStr = request.getParameter("acc_balance");
        
        String name = request.getParameter("holder_name");
        String surname = request.getParameter("holder_surname");
        String gender = request.getParameter("holder_gender");
        String dobStr = request.getParameter("holder_dob");
        
        // 2. Perform validations using your BankInputManager business logic
        if (!biml.isValidAccountNumber(account_number)) {
            throw new IllegalArgumentException("Account Number Is Invalid. An Account number must have 10 Digits Exactly.");
        }
        
        if (!biml.isValidString(name) || !biml.isValidString(surname)) {
            throw new IllegalArgumentException("Name or surname is invalid. Must contain only letters.");
        }
        
        if (!biml.isValidBalance(balanceStr)) {
            throw new IllegalArgumentException("Balance is invalid. Account balance must be formatted like 10.00");
        }
        
        // 3. Parse data types that require conversion
        Double balance = Double.parseDouble(balanceStr);
        LocalDate dob = LocalDate.parse(dobStr);
        boolean marital_status = Boolean.parseBoolean(request.getParameter("holder_marital_status"));
        
        // 4. Send the data downstream to your custom update method!
        // This bypasses the automatic object merge entirely and issues a safe SQL UPDATE statement.
        afl.updateAccountCustom(
            account_number, 
            account_type, 
            balance, 
            name, 
            surname, 
            gender, 
            dob, 
            marital_status
        );
        
        // 5. Store account number as an attribute for your confirmation page and forward
        request.setAttribute("account_number", account_number);
        request.getRequestDispatcher("edit_account_details_outcome.jsp").forward(request, response);
    }
}


