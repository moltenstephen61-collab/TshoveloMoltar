/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.entity.Company;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface CompanyFacadeLocal {

    void create(Company company);

    void edit(Company company);

    void remove(Company company);

    Company find(Object id);

    List<Company> findAll();

    List<Company> findRange(int[] range);

    int count();
    //
    void processAndSaveCompanyWithProjects(
            String rawCompId, String compName,
            String title0, String descr0,
            String title1, String descr1,
            String title2, String descr2);
    
}
