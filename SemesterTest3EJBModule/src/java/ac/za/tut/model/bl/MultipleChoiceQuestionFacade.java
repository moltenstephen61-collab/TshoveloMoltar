/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.MultipleChoiceQuestion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class MultipleChoiceQuestionFacade extends AbstractFacade<MultipleChoiceQuestion> implements MultipleChoiceQuestionFacadeLocal {

    @PersistenceContext(unitName = "SemesterTest3EJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MultipleChoiceQuestionFacade() {
        super(MultipleChoiceQuestion.class);
    }
    
}
