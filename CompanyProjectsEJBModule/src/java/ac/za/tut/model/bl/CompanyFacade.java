/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.entity.Company;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class CompanyFacade extends AbstractFacade<Company> implements CompanyFacadeLocal {

    @PersistenceContext(unitName = "CompanyProjectsEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompanyFacade() {
        super(Company.class);
    }
    
}
