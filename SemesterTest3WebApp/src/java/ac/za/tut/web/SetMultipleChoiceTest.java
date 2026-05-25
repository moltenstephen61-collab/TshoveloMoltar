/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.MultipleChoiceQuestionFacadeLocal;
import ac.za.tut.model.entity.MultipleChoiceQuestion;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class SetMultipleChoiceTest extends HttpServlet {
    @EJB
    private MultipleChoiceQuestionFacadeLocal mcqfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Question 1: Algebra
    MultipleChoiceQuestion q1 = new MultipleChoiceQuestion();
    q1.setQuestion("What is the value of x in the equation 2x + 10 = 20?");
    q1.setOptionA("2");
    q1.setOptionB("5");
    q1.setOptionC("10");
    q1.setOptionD("15");
    q1.setAnswer("5");
    mcqfl.create(q1); // Saving to DB via EJB

    // Question 2: Geometry
    MultipleChoiceQuestion q2 = new MultipleChoiceQuestion();
    q2.setQuestion("What is the area of a circle with a radius of 7 units? (Use π = 22/7)");
    q2.setOptionA("44 sq units");
    q2.setOptionB("49 sq units");
    q2.setOptionC("154 sq units");
    q2.setOptionD("308 sq units");
    q2.setAnswer("154 sq units");
    mcqfl.create(q2);

    // Question 3: Arithmetic
    MultipleChoiceQuestion q3 = new MultipleChoiceQuestion();
    q3.setQuestion("Calculate: 12% of 500.");
    q3.setOptionA("50");
    q3.setOptionB("60");
    q3.setOptionC("70");
    q3.setOptionD("120");
    q3.setAnswer("60");
    mcqfl.create(q3);
     //
      RequestDispatcher disp = request.getRequestDispatcher("set_test_outcome.jsp");
      disp.forward(request, response);
    }

}
