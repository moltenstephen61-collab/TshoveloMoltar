/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.InputHandlerManagementLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class ValiditeNumbers extends HttpServlet {
    @EJB
     private InputHandlerManagementLocal ihml;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String numbstr = request.getParameter("num_1");
        String numbstr2 = request.getParameter("num_2");
        int num , num2;
        //
        if(ihml.validateNumbers(numbstr, numbstr2)){
            //
            num = Integer.parseInt(numbstr);
            num2 = Integer.parseInt(numbstr2);
            //
            request.setAttribute("num", num);
            request.setAttribute("num2", num2);
        }else{
            throw new IllegalArgumentException("Your Numbers Are Invalid. A Number Must not be a String or negative.");
        }
        //
        RequestDispatcher disp = request.getRequestDispatcher("validate_numbers_outcome.jsp");
        disp.forward(request, response);
    }

}
