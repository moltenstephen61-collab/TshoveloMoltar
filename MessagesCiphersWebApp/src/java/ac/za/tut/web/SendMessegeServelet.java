/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.MessageFacadeLocal;
import ac.za.tut.model.entity.Message;
import java.io.IOException;
import java.io.PrintWriter;
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
public class SendMessegeServelet extends HttpServlet {
    @EJB
    private MessageFacadeLocal mfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
        HttpSession session = request.getSession(true);
        //
        String message = request.getParameter("message");
        //
        String name = (String)session.getAttribute("name");
        //
        Long id = (Long)session.getAttribute("id");
        //
        String ciphertext = mfl.encryptMessage(message);
        //
        Integer messageLength = message.length();
        //Creaate a message
        Message messageEncrypted = createEncriptedMessage( ciphertext, name , id , messageLength);
        mfl.create(messageEncrypted);
        //
        RequestDispatcher disp = request.getRequestDispatcher("send_encrypted_message_outcome.jsp");
        disp.forward(request, response);
        
        
    }

    private Message createEncriptedMessage(String ciphertext, String name, Long id, Integer messageLength) {
        //
        Message messageEncrypted = new Message();
        //
        messageEncrypted.setAgentId(name);
        messageEncrypted.setCiphertext(ciphertext);
        messageEncrypted.setId(id);
        messageEncrypted.setSizeInBytes(messageLength);
        //
        return messageEncrypted;
    }

}
