/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.ArithmeticQuestionManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class SelectQuestions extends HttpServlet {
    private ArithmeticQuestionManager aqm = new ArithmeticQuestionManager();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          //
          HttpSession session = request.getSession();
          //
          String operation = request.getParameter("operation");
          //
          List<String> questions = new ArrayList<>();
          List<Integer> answers = new ArrayList<>();
          //
          for(int i =0 ; i < 5 ; i++){
             String q = aqm.generateQuestion(operation);
             int correct = aqm.getCorrectAnswer();
             //
             questions.add(q);
             answers.add(correct);
          }
          //
          session.setAttribute("questions", questions);
          session.setAttribute("answers", answers);
         //
         request.getRequestDispatcher("test_outcome.jsp").forward(request, response);
          
    }



}
