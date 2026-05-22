/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.model.bl.CompanyFacadeLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class AddCompaniesAndProjects extends HttpServlet {
     
    @EJB
    private CompanyFacadeLocal companyFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Capture the raw string parameters directly from the request form
        String rawCompanyId = request.getParameter("comp_id");
        String company_name = request.getParameter("comp_name");
        
        String project_title = request.getParameter("project_title");
        String project_description = request.getParameter("project_descrp");
        
        String project_title_1 = request.getParameter("project_title_1");
        String project_description_1 = request.getParameter("project_descrp_1");
        
        String project_title_2 = request.getParameter("project_title_2");
        String project_description_2 = request.getParameter("project_descrp_2");
        
        try {
            // 2. Delegate validation, parsing, and persistence to the EJB layer
            companyFacade.processAndSaveCompanyWithProjects(
                    rawCompanyId, company_name, 
                    project_title, project_description, 
                    project_title_1, project_description_1, 
                    project_title_2, project_description_2
            );
            
            // 3. If everything succeeds, forward to the outcome page
            request.getRequestDispatcher("add_company_project_outcome.jsp").forward(request, response);
            
        } catch (IllegalArgumentException e) {
            // 4. Catch validation failures safely, bind the error message, and bounce back to the input form
            request.setAttribute("error", e.getMessage());
            
            // Adjust the string literal below to match the name of your original input JSP page
            request.getRequestDispatcher("add_companies_project.html").forward(request, response);
        }
    }
}