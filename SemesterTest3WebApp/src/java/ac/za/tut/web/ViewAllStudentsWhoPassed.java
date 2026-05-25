/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.StudentFacadeLocal;
import ac.za.tut.model.entity.Student;
import java.io.IOException;
import java.util.List;
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
public class ViewAllStudentsWhoPassed extends HttpServlet {
     @EJB
     private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        List<Student> studentsWhoPassed = sfl.getStudentWhoPassed();
        //
        request.setAttribute("studentsWhoPassed", studentsWhoPassed);
        //
        RequestDispatcher disp = request.getRequestDispatcher("get_passed_students_outcome.jsp");
        disp.forward(request, response);
    }

}
