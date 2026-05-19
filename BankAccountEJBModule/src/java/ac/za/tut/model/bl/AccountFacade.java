/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "BankAccountEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }
    
    @Override
  public Account findByAccountNumber(String accountNumber) {
    try {
        return em.createQuery("SELECT a FROM Account a WHERE a.accountNumber = :accNum", Account.class)
                 .setParameter("accNum", accountNumber)
                 .getSingleResult();
    } catch (javax.persistence.NoResultException e) {
        return null; 
    }
  }
  public void updateAccountCustom(String accNum, String accType, Double balance, String name, String surname, String gender, java.time.LocalDate dob, boolean married) {
    
    // 1. Update the Account Holder details first by locating them via the Account Number
    em.createQuery("UPDATE AccountHolder ah SET ah.name = :name, ah.surname = :surname, "
                 + "ah.gender = :gender, ah.dateOfBirth = :dob, ah.married = :married "
                 + "WHERE ah.id = (SELECT a.accountHolder.id FROM Account a WHERE a.accountNumber = :accNum)")
      .setParameter("name", name)
      .setParameter("surname", surname)
      .setParameter("gender", gender)
      .setParameter("dob", dob)
      .setParameter("married", married)
      .setParameter("accNum", accNum)
      .executeUpdate();

    // 2. Update the Account details
    em.createQuery("UPDATE Account a SET a.accountType = :accType, a.balance = :balance WHERE a.accountNumber = :accNum")
      .setParameter("accType", accType)
      .setParameter("balance", balance)
      .setParameter("accNum", accNum)
      .executeUpdate();
}  
}
