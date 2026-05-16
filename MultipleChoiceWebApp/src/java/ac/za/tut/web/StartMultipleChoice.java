/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.MultiplechoiceManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.Question;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class StartMultipleChoice extends HttpServlet {
    private MultiplechoiceManager mcm = new MultiplechoiceManager(); 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession();
        // get questions 
        List<Question> mutiple_choice = mcm.multiple_choice();
        //
        session.setAttribute("mutiple_choice", mutiple_choice);
        //
        request.getRequestDispatcher("multiple_choice.jsp").forward(request, response);
    }

}
