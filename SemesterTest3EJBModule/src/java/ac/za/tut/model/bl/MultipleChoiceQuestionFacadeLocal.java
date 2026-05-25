/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.MultipleChoiceQuestion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface MultipleChoiceQuestionFacadeLocal {

    void create(MultipleChoiceQuestion multipleChoiceQuestion);

    void edit(MultipleChoiceQuestion multipleChoiceQuestion);

    void remove(MultipleChoiceQuestion multipleChoiceQuestion);

    MultipleChoiceQuestion find(Object id);

    List<MultipleChoiceQuestion> findAll();

    List<MultipleChoiceQuestion> findRange(int[] range);

    int count();
    
}
