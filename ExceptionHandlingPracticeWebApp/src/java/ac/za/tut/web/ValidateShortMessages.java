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
public class ValidateShortMessages extends HttpServlet {
     @EJB
     private InputHandlerManagementLocal ihml;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String message = request.getParameter("message");
        //
        if(ihml.validateMessage(message)){
            //
            request.setAttribute("message", message);
        }else {
            throw new IllegalArgumentException("Your Message Is Invalid. A Message have spaces , comma and fullstops.");
        }
        //
        RequestDispatcher disp = request.getRequestDispatcher("validate_message_outcome.jsp");
        disp.forward(request, response);
    }

 
}
