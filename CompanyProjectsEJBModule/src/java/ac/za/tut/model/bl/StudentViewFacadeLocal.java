/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.entity.StudentView;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface StudentViewFacadeLocal {

    void create(StudentView studentView);

    void edit(StudentView studentView);

    void remove(StudentView studentView);

    StudentView find(Object id);

    List<StudentView> findAll();

    List<StudentView> findRange(int[] range);

    int count();
    
}
