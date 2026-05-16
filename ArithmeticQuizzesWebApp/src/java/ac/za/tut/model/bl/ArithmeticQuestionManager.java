package ac.za.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ArithmeticQuestionManager implements QuestionManager {
    private int a;
    private int b;
    private int correctAnswer;
    private Random rand = new Random();

    @Override
    public String generateQuestion(String operation) {
        a = rand.nextInt(10) + 1;
        b = rand.nextInt(10) + 1;

        switch (operation) {
            case "add":
                correctAnswer = a + b;
                return a + " + " + b;
            case "sub":
                correctAnswer = a - b;
                return a + " - " + b;
            case "mul":
                correctAnswer = a * b;
                return a + " * " + b;
            case "div":
                b = rand.nextInt(9) + 1;
                a = b * (rand.nextInt(10) + 1);
                correctAnswer = a / b;
                return a + " / " + b;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }

    @Override
    public int gotCorrect(List<Integer> userAnswers, List<Integer> answers) {
        int correctCount = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (i >= userAnswers.size()) break; // Prevent IndexOutOfBounds
            
            Integer userAns = userAnswers.get(i);
            Integer correctAns = answers.get(i);

            if (userAns != null && userAns.equals(correctAns)) {
                correctCount++;
            }
        }
        return correctCount;
    }

    @Override
    public List<Integer> userAnswers(HttpServletRequest request) {
        List<Integer> userAnswers = new ArrayList<>();
        HttpSession session = request.getSession();
        List<String> questions = (List<String>) session.getAttribute("questions");
        
        // Dynamically get answer count based on session question size, default to 0 if null
        int totalQuestions = (questions != null) ? questions.size() : 0;

        for (int i = 0; i < totalQuestions; i++) {
            // Fixed the string compilation typo here from '{' to '['
            String answerStr = request.getParameter("user_answers[" + i + "]");
            if (answerStr != null && !answerStr.trim().isEmpty()) {
                userAnswers.add(Integer.parseInt(answerStr.trim()));
            } else {
                userAnswers.add(null); 
            }
        }
        return userAnswers;
    }

    @Override
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}