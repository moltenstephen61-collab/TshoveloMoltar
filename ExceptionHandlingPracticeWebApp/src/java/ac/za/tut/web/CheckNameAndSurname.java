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
public class CheckNameAndSurname extends HttpServlet {
     @EJB
     private InputHandlerManagementLocal ihml;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        //
        if(ihml.validateNameAndSurname(name, surname)){
         //
         request.setAttribute("name", name);
         request.setAttribute("surname", surname);
        }else {
            throw new IllegalArgumentException("Name Or Surname Is Invalid. Please You Name or Surname Must not have spaces or numbers or characters. ");
        }
        //
        RequestDispatcher disp = request.getRequestDispatcher("validation_of_name_surname_outcome.jsp");
        disp.forward(request, response);
    }


}
