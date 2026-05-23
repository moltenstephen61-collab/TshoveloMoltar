/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.MessageValidaterLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class AnalyzeMessage extends HttpServlet {
    @EJB
    private MessageValidaterLocal mvl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        String message = request.getParameter("message");
        int total_vowels;
        int total_consants;
        int messageLength;
        // 
        List<String> uniqueWords = new ArrayList<>();
        List<String> repeatingWords = new ArrayList<>();
        
        // FIX 1: Don't create a new ArrayList here, just declare the variable.
        List<String> messages; 
        
        String unique_words;
        String repeating_words;
        //
        if(mvl.validateMessage(message)){
            total_vowels = mvl.calculateTotalNumberofVowels(message);
            total_consants = mvl.calculateTotalNumberofConsonants(message);
            messageLength = mvl.lengthOfMessage(message);
            //
            request.setAttribute("message", message);
            request.setAttribute("total_vowels", total_vowels);
            request.setAttribute("total_consants", total_consants);
            request.setAttribute("messageLength", messageLength);
            //
            uniqueWords = mvl.findUniqueWords(message);
            unique_words = String.join(" , " , uniqueWords);
            repeatingWords = mvl.findRepeatingWords(message);
            repeating_words = String.join(" , " , repeatingWords);
            //
            request.setAttribute("unique_words", unique_words);
            request.setAttribute("repeating_words", repeating_words);
            //
            
            // FIX 2: Try to pull the cumulative list out of the session first
            messages = (List<String>) request.getSession().getAttribute("messages");
            
            // FIX 3: If the session doesn't have a list yet (first request), create it
            if (messages == null) {
                messages = new ArrayList<>();
            }
            
            messages.add(message);
            request.getSession().setAttribute("messages", messages);
            //
            request.getRequestDispatcher("analyze_message.jsp").forward(request, response);
        }else {
            throw new IllegalArgumentException("A Message Must Contain Only Letters and just spaces in between. Please try again");
        }
    }

}