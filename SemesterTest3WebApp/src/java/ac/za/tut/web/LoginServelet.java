/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class LoginServelet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1. Check if the user is even logged in first
    if (request.getUserPrincipal() != null) {
        // 2. Check for a specific role (e.g., "admin")
        if (request.isUserInRole("Lecturer")) {
            // Redirect to admin dashboard
            request.getRequestDispatcher("lecturer_menu.html").forward(request, response);
            
        } else if (request.isUserInRole("Student")) {
            // Redirect to student page
            request.getRequestDispatcher("student_menu.html").forward(request, response);
            
        } 
      }
    
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
