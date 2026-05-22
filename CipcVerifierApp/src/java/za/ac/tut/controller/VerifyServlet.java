package za.ac.tut.controller;

import za.ac.tut.model.CipcBean;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerifyServlet")
public class VerifyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Inject our Stateless EJB container resource
    @EJB
    private CipcBean cipcBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Get the parameter parameter from index.html
        String regNum = request.getParameter("regNum");
        
        // 2. Interact with the EJB model to validate
        boolean isValid = cipcBean.validateFormat(regNum);
        
        if (isValid) {
            // Get company type translation from EJB
            String companyType = cipcBean.determineCompanyType(regNum);
            
            // 3. Set request attributes for successful validation state
            request.setAttribute("isValid", true);
            request.setAttribute("companyType", companyType);
            request.setAttribute("checkedNumber", regNum);
        } else {
            // Set request attributes for failed validation state
            request.setAttribute("isValid", false);
            request.setAttribute("errorReason", "Format pattern must strictly be YYYY/NNNNNN/NN");
        }
        
        // 4. Forward execution directly back over to our result view layout
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}