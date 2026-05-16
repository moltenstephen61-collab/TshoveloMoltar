/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import za.ac.tut.model.Question;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class MultiplechoiceManager implements MultipleChoiceInterface {

    @Override
    public List<Question> multiple_choice() {
        List<Question> multiple_choice = new ArrayList<>();
        //
        multiple_choice.add(new Question("1 + 1 = ?","1","11","2","0","C"));
        multiple_choice.add(new Question("1 * 1 = ?","1","11","2","0","A"));
        multiple_choice.add(new Question("1 / 1 = ?","1","11","2","0","A"));
        multiple_choice.add(new Question("1 - 1 = ?","1","11","2","0","D"));
        multiple_choice.add(new Question("1 % 1 = ?","1","11","2","0","D"));
        multiple_choice.add(new Question("(1+1)*2 = ?","1","2","4","6","C"));
        multiple_choice.add(new Question("(1+1)/2 = ?","1","2","4","6","A"));
        //
        return multiple_choice;
    }
     // New method: evaluate answers
    @Override
    public List<String> evaluateAnswers(HttpServletRequest request, List<Question> questions) {
        List<String> results = new ArrayList<>();

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            String userAnswer = request.getParameter("answer_" + i);
            String correctAnswer = q.getCorrectOption();

            if (userAnswer != null && userAnswer.equalsIgnoreCase(correctAnswer)) {
                results.add("Question " + (i+1) + ": Correct");
            } else {
                results.add("Question " + (i+1) + ": Incorrect (Your answer: " 
                            + userAnswer + ", Correct: " + correctAnswer + ")");
            }
        }
        return results;
    }
     
}
