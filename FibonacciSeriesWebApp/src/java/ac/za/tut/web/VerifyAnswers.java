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
import za.ac.tut.model.bl.FibonacciManager;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class VerifyAnswers extends HttpServlet {
    
    private FibonacciManager fm = new FibonacciManager();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        boolean user_answer = Boolean.parseBoolean(request.getParameter("user_answer"));
        //
        int generatedNumber = (int)request.getSession().getAttribute("generatedNumber");
        int fibonacciNumber = (int)request.getSession().getAttribute("fibonacciNumber");
        //
        boolean isFibonacci = fm.checkFibonacci(fibonacciNumber, generatedNumber);
         // Compare player’s answer with actual result
         boolean correct = (user_answer == isFibonacci);
         // Update score if correct
         int score = (int) request.getSession().getAttribute("score");
         if (correct) {
           score++;
          }
        request.getSession().setAttribute("score", score);
        //
        request.getSession().setAttribute("user_answer", user_answer);
        request.getSession().setAttribute("isFibonacci", isFibonacci);
        //
        request.getRequestDispatcher("report_summary.jsp").forward(request, response);
        
    }

}
