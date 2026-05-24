/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.ShortMessageFacadeLocal;
import ac.za.tut.model.entity.ShortMessage;
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
public class ViewAnalysisOfLongestReport extends HttpServlet {
    @EJB
    private ShortMessageFacadeLocal smfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        ShortMessage longest_message_report = smfl.getReportOfLongestMessage();
        //
        request.setAttribute("longest_message_report", longest_message_report);
        //
        RequestDispatcher disp = request.getRequestDispatcher("longest_message_report_outcome.jsp");
        disp.forward(request, response);
    }
}
