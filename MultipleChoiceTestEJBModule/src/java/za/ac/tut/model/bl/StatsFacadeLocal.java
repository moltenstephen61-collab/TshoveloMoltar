/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import ac.za.tut.entity.Stats;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface StatsFacadeLocal {

    void create(Stats stats);

    void edit(Stats stats);

    void remove(Stats stats);

    Stats find(Object id);

    List<Stats> findAll();

    List<Stats> findRange(int[] range);

    int count();
    
}
