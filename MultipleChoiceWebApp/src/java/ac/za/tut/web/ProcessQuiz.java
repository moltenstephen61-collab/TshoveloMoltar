package ac.za.tut.web;

import ac.za.tut.model.bl.MultiplechoiceManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.Question;

/**
 * @author TSHOVELO MOLTAR
 */
public class ProcessQuiz extends HttpServlet {
    private MultiplechoiceManager mcm = new MultiplechoiceManager(); 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        List<Question> questions = (List<Question>) session.getAttribute("mutiple_choice");
        List<String> evaluateAnswers = mcm.evaluateAnswers(request, questions);
        
        // FIX: Match the actual string format coming from your Manager class
        int correctCount = 0;
        for (String res : evaluateAnswers) {
            if (res.endsWith(": Correct")) { 
                correctCount++;
            }
        }
        
        int totalQuestions = questions.size();
        double percentage = ((double) correctCount / totalQuestions) * 100;

        // Store data in session for summary page
        session.setAttribute("questions", questions);
        session.setAttribute("evaluateAnswers", evaluateAnswers);
        session.setAttribute("correctCount", correctCount);
        session.setAttribute("totalQuestions", totalQuestions);
        session.setAttribute("percentage", percentage);

        request.getRequestDispatcher("summary_report.jsp").forward(request, response);
    }
}