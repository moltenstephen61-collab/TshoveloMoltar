/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.AccountFacadeLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class DisplayTotalNumberOfAccounts extends HttpServlet {
    
    @EJB
    private AccountFacadeLocal afl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //
          int total_num_accounts = afl.findAll().size();
         //
         request.setAttribute("total_num_accounts", total_num_accounts);
         //
         request.getRequestDispatcher("get_total_number_of_accounts.jsp").forward(request, response);
         
    }


}
