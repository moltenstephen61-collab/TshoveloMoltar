/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class CalculateAge extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String dobStr = request.getParameter("dob");  //  2000-04-22
        LocalDate dob = LocalDate.parse(dobStr);
        LocalDate now = LocalDate.now();
        //
        int years = Period.between(dob, now).getYears();
        //
        request.setAttribute("years", years);
        //
        request.getRequestDispatcher("determine_age_outcome.jsp").forward(request, response);
    }

}
