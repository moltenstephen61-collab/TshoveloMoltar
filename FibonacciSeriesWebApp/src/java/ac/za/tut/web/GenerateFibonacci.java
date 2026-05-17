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
public class GenerateFibonacci extends HttpServlet {
    private FibonacciManager fm = new FibonacciManager();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    //
    int generatedNumber = fm.createRandom();
    int fibonacciNumber = fm.createFibonacci(generatedNumber);

    request.getSession().setAttribute("generatedNumber", generatedNumber);
    request.getSession().setAttribute("fibonacciNumber", fibonacciNumber);

    // Initialize score if not already set
    if (request.getSession().getAttribute("score") == null) {
        request.getSession().setAttribute("score", 0);
    }

    // Initialize questionsAsked if not already set
    if (request.getSession().getAttribute("questionsAsked") == null) {
        request.getSession().setAttribute("questionsAsked", 0);
    }

    // Retrieve safely as Integer
    Integer questionsAsked = (Integer) request.getSession().getAttribute("questionsAsked");

    // Increment
    questionsAsked = questionsAsked + 1;

    // Store back into session
    request.getSession().setAttribute("questionsAsked", questionsAsked);

    request.getRequestDispatcher("fibonacci_question.jsp").forward(request, response);
 }

}
