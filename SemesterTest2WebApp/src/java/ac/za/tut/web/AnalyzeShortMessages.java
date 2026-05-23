/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.ShortMessageFacadeLocal;
import ac.za.tut.model.entity.ShortMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class AnalyzeShortMessages extends HttpServlet {
    @EJB
    private ShortMessageFacadeLocal smfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        //HttpSession session = request.getSession(true);
        //
        String short_message = request.getParameter("short_message");
        int total_vowels;
        int total_consonats;
        int message_length;
        //
        String unique_Words;
        String repeating_Words;
        //
        ShortMessage shortMessage = new ShortMessage();  
        if(smfl.validateShortMessage(short_message)){
           //
            total_vowels = smfl.countVowels(short_message);
            total_consonats = smfl.countConsonats(short_message);
            message_length = smfl.lengthOfMessage(short_message);
           //
           unique_Words = smfl.uniqueWords(short_message);
           repeating_Words = smfl.repeatingWords(short_message);
           //
           request.setAttribute("short_message", short_message);
           //
           request.setAttribute("total_vowels", total_vowels);
           //
           request.setAttribute("total_consonats", total_consonats);
           //
           request.setAttribute("message_length", message_length);
           //
           request.setAttribute("unique_Words", unique_Words);
           //
           request.setAttribute("repeating_Words", repeating_Words);
           //
           shortMessage.setShortMessage(short_message);
           shortMessage.setTotal_vowels(total_vowels);
           shortMessage.setTotal_consonants(total_consonats);
           shortMessage.setMessage_length(message_length);
           shortMessage.setUniqueWords(unique_Words);
           shortMessage.setRepeatingWords(repeating_Words);
           shortMessage.setCreationDate(new Date());
           smfl.create(shortMessage);
        }else{
            throw new IllegalArgumentException("Your Short Message is Invalid. Contains Numbers. A Message must not have numbers");
        }
       
        //
        RequestDispatcher disp = request.getRequestDispatcher("anlyse_short_message_outcome.jsp");
        disp.forward(request, response);
        //
    }


}
