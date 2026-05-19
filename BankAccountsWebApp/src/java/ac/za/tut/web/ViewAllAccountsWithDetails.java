/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.AccountFacadeLocal;
import ac.za.tut.model.entity.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class ViewAllAccountsWithDetails extends HttpServlet {
    @EJB
    private AccountFacadeLocal afl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // view all accounts details 
        List<Account> accounts = afl.findAll();
        //
        request.setAttribute("accounts", accounts);
        //
        request.getRequestDispatcher("display_all_accounts_details.jsp").forward(request, response);
        
    }

 

}
