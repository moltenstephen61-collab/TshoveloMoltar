/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.EvaluationManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class CheckTemperature extends HttpServlet {
    // 
    private EvaluationManager em = new EvaluationManager(); 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession();
        // temperature
        double temp = Double.valueOf(request.getParameter("temperature"));
        //
        String access = em.checkTemperature(temp);
        //
        session.setAttribute("access", access);
        session.setAttribute("temp", temp);
        //
        if(access.equalsIgnoreCase("granted")){
            //
            request.getRequestDispatcher("access_granted.jsp").forward(request, response);    
        } else {
           //
           request.getRequestDispatcher("access_denied.jsp").forward(request, response); 
        }
           
    }


}
