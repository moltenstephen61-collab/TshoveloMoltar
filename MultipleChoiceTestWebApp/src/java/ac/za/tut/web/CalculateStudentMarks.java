/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.entity.Question;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.QuestionFacadeLocal;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class CalculateStudentMarks extends HttpServlet {
    
    @EJB
    private QuestionFacadeLocal qfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        // 1. Re-fetch or get the questions list to know how many answers to expect
        List<Question> questions = qfl.findAll();
        
        int totalQuestions = questions.size();
        int studentMarks = 0;
        
        // 2. Loop through the expected parameter names dynamically
        for (int i = 0; i < totalQuestions; i++) {
            // Reconstruct the name string matching the JSP: "user_answer_0", "user_answer_1"...
            String paramName = "user_answer_" + i;
            String submittedAnswer = request.getParameter(paramName);
            
            // Get the correct answer from the database entity object
            // (Assuming your Question entity has a getAnswer() or getCorrectAnswer() method)
            String correctAnswer = questions.get(i).getCorrect_Answer() ; 
       
            // 3. Compare them safely
            if (submittedAnswer != null && submittedAnswer.equalsIgnoreCase(correctAnswer)) {
                studentMarks++;
            }
        }
        
        // 4. Save results to the session or request
        session.setAttribute("studentMarks", studentMarks);
        session.setAttribute("totalQuestions", totalQuestions);
        
        // 5. Forward to a results or summary page
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
