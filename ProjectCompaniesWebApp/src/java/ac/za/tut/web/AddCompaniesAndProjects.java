/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.web;

import ac.za.tut.entity.Company;
import ac.za.tut.entity.Project;
import ac.za.tut.model.bl.CompanyFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
public class AddCompaniesAndProjects extends HttpServlet {
     
    @EJB
    private CompanyFacadeLocal companyFacade;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // comp_id comp_name project_title project_descrp
        Long company_id = Long.parseLong(request.getParameter("comp_id"));
        String company_name = request.getParameter("comp_name");
        String project_title = request.getParameter("project_title");
        String project_description = request.getParameter("project_descrp");
        String project_title_1 = request.getParameter("project_title_1");
        String project_description_1 = request.getParameter("project_descrp_1");
        String project_title_2 = request.getParameter("project_title_2");
        String project_description_2 = request.getParameter("project_descrp_2");
        //
        Company company = new Company();
        company.setId(company_id);
        company.setName(company_name);
        company.setDateContributed(new Date());
        //
        Project p1 = new Project();
        p1.setTitle(project_title);
        p1.setDescription(project_description);
        p1.setCompany(company);
        Project p2 = new Project();
        p2.setTitle(project_title_1);
        p2.setDescription(project_description_1);
        p2.setCompany(company);
        Project p3 = new Project();
        p3.setTitle(project_title_2);
        p3.setDescription(project_description_2);
        p3.setCompany(company);
        List<Project> projects_in_copmany = new ArrayList<>();
        //
        projects_in_copmany.add(p1);
        projects_in_copmany.add(p2);
        projects_in_copmany.add(p3);
        //
        company.setProjects(projects_in_copmany);
        // create company
        companyFacade.create(company);
        //
        request.getRequestDispatcher("add_company_project_outcome.jsp").forward(request, response);
        
    }


}
