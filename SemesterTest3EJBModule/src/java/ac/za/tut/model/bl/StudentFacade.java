/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "SemesterTest3EJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> getStudentWhoPassed() {
      //
      String queryStr = "SELECT s FROM Student s WHERE s.marks > 50";
      Query query = em.createQuery(queryStr);
      //
      List<Student> studentPassed = (List<Student>)query.getResultList();
      //
      return studentPassed;
    }
    
}
