/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.AccountFacadeLocal;
import ac.za.tut.model.entity.Account;
import ac.za.tut.model.entity.AccountHolder;
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
public class AddAnAcount extends HttpServlet {
    @EJB
    private BankInputManagerLocal bim; 
    @EJB
    private AccountFacadeLocal afl;
    //
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder();
       // account holder - holder_name , holder_surname , holder_gender , holder_dob , holder_marital_status
       String name = request.getParameter("holder_name");
       String surname = request.getParameter("holder_surname");
       String gender = request.getParameter("holder_gender");
       //
       String dobStr = request.getParameter("holder_dob");
       LocalDate dob = LocalDate.parse(dobStr);
       
       //
       boolean marital_status = Boolean.parseBoolean(request.getParameter("holder_marital_status"));
       //
       if(bim.isValidString(name) && bim.isValidString(surname)){
           //
            accountHolder.setName(name);
            accountHolder.setSurname(surname);
            accountHolder.setGender(gender);
            accountHolder.setMarried(marital_status);
            accountHolder.setDateOfBirth(dob);
       }else{
            throw new IllegalArgumentException("Name or surname is invalid. Must contain only letters.");
       }
       // acc_number acc_type acc_balance
       String account_number = request.getParameter("acc_number") ;
       String account_type = request.getParameter("acc_type");
       String balanceStr = request.getParameter("acc_balance");
       Double balance ;
       //
       if(bim.isValidAccountNumber(account_number) && bim.isValidBalance(balanceStr)){
        //
        balance = Double.parseDouble(balanceStr);
        account.setAccountNumber(account_number);
        account.setAccountType(account_type);
        account.setBalance(balance);
        account.setAccountHolder(accountHolder);
        account.setCreationDate();
        //
        afl.edit(account);
        //
        request.getRequestDispatcher("account_adding_outcome.jsp").forward(request, response);
       }else{
           throw new IllegalArgumentException("account number or balance is invalid. Account number must not contain words. and balance must be like 10.00");
       }
        
    }

}
