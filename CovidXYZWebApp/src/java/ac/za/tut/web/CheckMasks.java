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
public class CheckMasks extends HttpServlet {
    // 
    private EvaluationManager em = new EvaluationManager(); 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession();
        // check_Masks
        String check_Masks = request.getParameter("check_Masks");
        //
        boolean check = em.checkMasks(check_Masks);
        //
        if(check == true) {
            //
            session.setAttribute("check_Masks", check_Masks);
            request.getRequestDispatcher("temperature_evaluation.jsp").forward(request, response);
        }else {
            //
            request.getRequestDispatcher("no_mask.jsp").forward(request, response);
        }
    }


}
