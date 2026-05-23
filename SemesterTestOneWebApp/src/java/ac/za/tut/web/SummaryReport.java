/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class SummaryReport extends HttpServlet {
    
    // FIX 1: Support GET requests so users can click links/buttons to view the report
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        List<String> messages = (List<String>)request.getSession().getAttribute("messages");
        
        // FIX 2: Handle the scenario where no messages exist yet to prevent a NullPointerException
        if (messages == null) {
            messages = new ArrayList<>();
        }
        
        // Now this is completely safe to call
        int total_messages = messages.size();
        //
        request.setAttribute("messages", messages);
        request.setAttribute("total_messages", total_messages);
        //
        request.getRequestDispatcher("summary_report_outcome.jsp").forward(request, response);
    }
}