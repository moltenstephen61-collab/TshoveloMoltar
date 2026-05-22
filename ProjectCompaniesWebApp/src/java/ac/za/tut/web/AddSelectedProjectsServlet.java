package ac.za.tut.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class AddSelectedProjectsServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Retrieve the array of checked project identifiers from the JSP form
        String[] selectedProjects = request.getParameterValues("selectedProjectIds");
        
        // 2. Get or create the user's HTTP Session object
        HttpSession session = request.getSession();
        
        // 3. Look for an existing list of selected projects in the session
        List<String> projectList = (List<String>) session.getAttribute("selectedProjectsList");
        
        // If it doesn't exist yet (first time adding), initialize a new list
        if (projectList == null) {
            projectList = new ArrayList<>();
        }
        
        // 4. If the user actually checked at least one project, add them to our list
        // Check that the array isn't null before checking its length
if (selectedProjects != null && selectedProjects.length > 0) {
    
    for (int i = 0; i < selectedProjects.length; i++) {
        String project = selectedProjects[i]; // Get the element at index i
        
        // Optional check: only add if it's not already in their list
        if (!projectList.contains(project)) {
            projectList.add(project);
        }
    }
}
        
        // 5. Update or save the list back into the session scope
        session.setAttribute("selectedProjectsList", projectList);
        
        // 6. Forward or Redirect the user to a summary/confirmation view page
        // Replace "display_selected_projects.jsp" with your actual target view
        request.getRequestDispatcher("display_selected_projects.jsp").forward(request, response);
    }
}