package ac.za.tut.web;

import ac.za.tut.model.bl.MultipleChoiceQuestionFacadeLocal;
import ac.za.tut.model.bl.StudentFacadeLocal;
import ac.za.tut.model.entity.MultipleChoiceQuestion;
import ac.za.tut.model.entity.Student;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author TSHOVELO MOLTAR
 */
public class CalculateMarks extends HttpServlet {

    @EJB
    private MultipleChoiceQuestionFacadeLocal mcqfl; 
    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        List<MultipleChoiceQuestion> questions = mcqfl.findAll();
        int count = 0;

        // Loop through all questions retrieved from the DB
        for (int i = 0; i < questions.size(); i++) {
            // Get the user's selected answer from the JSP
            String userAnswer = request.getParameter("user_Answer_" + i);
            String correctAnswer = questions.get(i).getAnswer();

            // LOGGING: This helps you see why the score might be zero in the Output window
            System.out.println("Q" + (i+1) + ": User chose [" + userAnswer + "], Correct is [" + correctAnswer + "]");

            // Check for equality (using trim() to remove hidden spaces)
            if (userAnswer != null && !userAnswer.isEmpty()) {
                if (userAnswer.trim().equalsIgnoreCase(correctAnswer.trim())) {
                    count++;
                }
            }
        }

        // Calculate statistics
        int totalQuestions = questions.size();
        double percentage = 0.0;
        
        if (totalQuestions > 0) {
            percentage = ((double) count / totalQuestions) * 100;
        }

        // Retrieve user info from session
        String name = (String) session.getAttribute("name");
        if (name == null) { name = "Unknown Student"; }

        // Persist the student performance to the database
        Student student = new Student();
        student.setName(name);
        student.setMarks(percentage);
        sfl.create(student);

        // Store results in request scope for Quiz_Results.jsp
        request.setAttribute("count", count);
        request.setAttribute("total", totalQuestions);
        request.setAttribute("percentage", percentage);

        // Forward to the results page
        request.getRequestDispatcher("Quiz_Results.jsp").forward(request, response);
    }
}