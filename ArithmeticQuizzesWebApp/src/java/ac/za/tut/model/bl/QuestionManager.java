/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author TSHOVELO MOLTAR
 */
interface QuestionManager {
    String generateQuestion(String operation);
    int gotCorrect(List<Integer> userAnswers, List<Integer> correctAnswers);
    List<Integer> userAnswers(HttpServletRequest request);
    int getCorrectAnswer();
    
}
