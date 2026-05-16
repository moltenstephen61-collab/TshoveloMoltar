/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import za.ac.tut.model.Question;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public interface MultipleChoiceInterface {
    //
    List<Question> multiple_choice(); 
    List<String> evaluateAnswers(HttpServletRequest request, List<Question> questions);
    
}
