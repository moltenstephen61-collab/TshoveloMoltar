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
public class ValideStudentAndIDNumber extends HttpServlet {
     @EJB
     private InputHandlerManagementLocal ihml;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String student_number = request.getParameter("student_number");
        String id_number = request.getParameter("id");
        //
        if(ihml.validateIDandStudentNumber(id_number, student_number)){
            //
            request.setAttribute("student_number", student_number);
            request.setAttribute("id_number", id_number);
        }else{
            throw new IllegalArgumentException("Student Number or ID Number Is In Valid. An ID has 13 digits and Student Number has 9 digits. "); 
        }
        RequestDispatcher disp = request.getRequestDispatcher("validate_studentand_id_number_outcome.jsp");
        disp.forward(request, response);
    }

}
