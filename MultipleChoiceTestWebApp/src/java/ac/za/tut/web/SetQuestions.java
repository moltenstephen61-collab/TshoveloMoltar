/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.entity.Question;
import ac.za.tut.model.bl.InputManagerLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.QuestionFacadeLocal;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class SetQuestions extends HttpServlet {
    @EJB
    private InputManagerLocal iml;
    @EJB
    private QuestionFacadeLocal qfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // question correct_answer option_A option_B option_C option_D
       String question = request.getParameter("question");
       String option_A = request.getParameter("option_A");
       String option_B = request.getParameter("option_B");
       String option_C = request.getParameter("option_C");
       String option_D = request.getParameter("option_D");
       String correct_answer = request.getParameter("correct_answer");
       //
       Question set_question = new Question();
       //
        if(iml.isValidGeneralMathQuestion(question)){
          //
          set_question.setQuestion(question);
        }else{
            throw new IllegalArgumentException("Please Set a question that is maths related. It should have operations like [+-*/] and numbers.");
        }
        //
        if(iml.validateInput(option_A) &&
           iml.validateInput(option_B) && 
           iml.validateInput(option_C) && 
           iml.validateInput(option_D))
        {
        //
         set_question.setOption_A(option_A);
         set_question.setOption_B(option_B);
         set_question.setOption_C(option_C);
         set_question.setOption_D(option_D);
        }else{
            //
            throw new IllegalArgumentException("An option should have at least an answer for the question. Mostly a number.\n"
                    + "                         e.g What's 1 + 1 ? option can be 5 or any other number.");
        }
        //
        if(iml.isAnswerValid(correct_answer)){
            //
            set_question.setCorrect_Answer(correct_answer);
        }else {
            //
            throw new IllegalArgumentException("The Abswer to an Option can Only be one of the Letters A , B , C , D. \n "
                    + "Not A number or Any Other Letter from E to Z.");
        }
        //
        qfl.create(set_question);
        //
        request.getRequestDispatcher("set_multiple_choice_test_outcome.jsp").forward(request, response);
       
    }

}
