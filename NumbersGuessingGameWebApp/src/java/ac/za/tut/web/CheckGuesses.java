/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.RandomNumbersManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class CheckGuesses extends HttpServlet {
    private RandomNumbersManager rnm = new RandomNumbersManager(); 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // user_guess
         int user_guess = Integer.parseInt(request.getParameter("user_guess"));
         request.getSession().setAttribute("user_guess", user_guess);
         //
         int generatedNum = (int)request.getSession().getAttribute("generatedNum");
         int correct = (int)request.getSession().getAttribute("correct");
          if(correct == 0 ) {
                 correct = 0;
                  }
         //
         boolean areTheSame = rnm.compareGuess(generatedNum, user_guess);
         //
         if(areTheSame){
             //
             correct++;
             request.getSession().setAttribute("correct", correct);
         }
         //
         request.getRequestDispatcher("summary_report.jsp").forward(request, response);
    }

}
