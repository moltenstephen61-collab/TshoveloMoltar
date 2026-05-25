/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.MultipleChoiceQuestionFacadeLocal;
import ac.za.tut.model.entity.MultipleChoiceQuestion;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class StartTest extends HttpServlet {
    @EJB
    private MultipleChoiceQuestionFacadeLocal mcqfl; 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession();
        //
        String name = request.getParameter("name");
        if(name != null && name.matches("[A-Za-z]+")){
          //
          session.setAttribute("name", name);
        }else{
            throw new IllegalArgumentException("Your Name Is Invalid. Please Enter a Proper Name.");
        }
        
        //
        List<MultipleChoiceQuestion> questions = mcqfl.findAll();
        //
        request.setAttribute("questions", questions);
        //
        RequestDispatcher disp = request.getRequestDispatcher("Quiz_started.jsp");
        disp.forward(request, response);
    }


}
