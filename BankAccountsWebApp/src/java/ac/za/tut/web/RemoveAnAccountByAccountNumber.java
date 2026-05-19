/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.AccountFacadeLocal;
import ac.za.tut.model.entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
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
public class RemoveAnAccountByAccountNumber extends HttpServlet {
    @EJB
    private BankInputManagerLocal biml;
    @EJB
    private AccountFacadeLocal afl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String account_number = request.getParameter("acc_number");
        //
        if(biml.isValidAccountNumber(account_number)){
         //
         request.setAttribute("account_number", account_number);
         Account account = afl.findByAccountNumber(account_number);
         afl.remove(account);
        }else {
            throw new IllegalArgumentException("Account Number Is Invalid. An Account number must have 10 Digits Exactly. Not More, Not Less.");
        }
        //
        request.getRequestDispatcher("account_removal_outcome.jsp").forward(request, response);
    }

}
