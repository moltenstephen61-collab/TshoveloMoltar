/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.entity.Question;
import ac.za.tut.model.bl.InputManagerLocal;
import java.io.IOException;
import java.util.List;
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
public class StartMultipleChoiceTest extends HttpServlet {
    @EJB
    private QuestionFacadeLocal qfl;
    @EJB
    private InputManagerLocal iml;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String stud_name = request.getParameter("stud_name");
        String stud_surname = request.getParameter("stud_surname");
        String stud_number = request.getParameter("stud_number");
        //
        if(iml.validateNameorSurname(stud_name) && iml.validateNameorSurname(stud_name)){
            //
            request.getSession().setAttribute("stud_name", stud_name);
            request.getSession().setAttribute("stud_surname", stud_surname);
        }else{
            throw new IllegalArgumentException("The Name Or Surname Is Invalid. A Name or Surname Must not contain Numbers or Spaces or Other characters.");
        }
        if(iml.isValidStudentNumber(stud_number)){
            //
            request.getSession().setAttribute("stud_number", stud_number);
        }else{
            throw new IllegalArgumentException("Student Number Is Invalid. A Student Should contain 9 (nine) numbers. No Letters or Spaces in it.");
        }
        //
        List <Question> set_Questions = qfl.findAll();
        //
        request.setAttribute("set_Questions", set_Questions);
        //
        request.getRequestDispatcher("multiple_choice_test.jsp").forward(request, response);
    }

}
