/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.entity.Company;
import ac.za.tut.model.bl.CompanyFacadeLocal;
import java.io.IOException;
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
public class ChooseProjectsOfChoice extends HttpServlet {
    @EJB
    private CompanyFacadeLocal companyFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // This assumes your AbstractFacade has a findAll() method
    List<Company> companies = companyFacade.findAll();
    
    // 2. Attach the list to the request object
    request.setAttribute("companies", companies);
    
    // 3. Forward to the outcome JSP to display the table
    request.getRequestDispatcher("view_and_select_projects_page.jsp").forward(request, response);
        
    }

}
