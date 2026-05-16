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
public class SummaryServelet extends HttpServlet {
    private ArithmeticQuestionManager aqm = new ArithmeticQuestionManager();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession();
        List<Integer> user_answers = aqm.userAnswers(request);
        List<Integer> correct_answers = (List<Integer>) session.getAttribute("answers");

        int totalQuestions = correct_answers.size();
        int got_right = aqm.gotCorrect(user_answers, correct_answers);
        int got_wrong = totalQuestions - got_right;
        double percentage;
            if (got_right == totalQuestions) {
                percentage = 100.0; // full marks
          } else {
         percentage = ((double) got_right / totalQuestions) * 100;
          }

        session.setAttribute("got_right", got_right);
        session.setAttribute("got_wrong", got_wrong);
        session.setAttribute("percentage", percentage);
        session.setAttribute("totalQuestions", totalQuestions);

        request.getRequestDispatcher("summaryReport.jsp").forward(request, response);
    }

}
