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
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class StartSession extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession(true);
        // name id 
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        //
        session.setAttribute("name", name);
        session.setAttribute("id", id);
        //
        request.getRequestDispatcher("main_menu.jsp").forward(request, response);
    }

}
