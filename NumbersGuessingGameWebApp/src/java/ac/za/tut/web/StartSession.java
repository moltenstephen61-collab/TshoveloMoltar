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
public class StartSession extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String name = request.getParameter("user");
        // check if string doesn't have digits and is not null 
        if(name != null && !name.matches(".*\\d.*")){
            //
            request.getSession().setAttribute("name", name);
            //
            request.getRequestDispatcher("main_menu.jsp").forward(request, response);
           // return;
        }else{
            throw new IllegalArgumentException("String must not be null or contain any digits");
            //
        }
        
    }

}
