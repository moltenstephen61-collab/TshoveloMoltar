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
        String name = request.getParameter("name");
        //
        if(name != null && name.matches("^[A-Za-z]+$")){
           //
           request.getSession().setAttribute("name", name);
        }else{
            //
            throw new IllegalArgumentException("Name You Entered Is Invalid. A Name Must not contain numbers or space(s). Also it must never be null.");
        }
        //
        request.getRequestDispatcher("main_menu.jsp").forward(request, response);
    }

}
