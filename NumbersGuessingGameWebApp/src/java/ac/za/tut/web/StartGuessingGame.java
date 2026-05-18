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
public class StartGuessingGame extends HttpServlet {
    private RandomNumbersManager rnm = new RandomNumbersManager();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        int generatedNum = rnm.createRandomNumber();
        int totalQuestions = 0;
        int correct = 0;
        //
        request.getSession().setAttribute("generatedNum", generatedNum);
        request.getSession().setAttribute("correct", correct);
        request.getSession().setAttribute("totalQuestions", totalQuestions);
        
        //
        request.getRequestDispatcher("guessing_game.jsp").forward(request, response);
    }

}
