/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.model.entity.Account;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Local
public interface AccountFacadeLocal {

    void create(Account account);

    void edit(Account account);

    void remove(Account account);

    Account find(Object id);

    List<Account> findAll();

    List<Account> findRange(int[] range);

    int count();
    //
    Account findByAccountNumber(String accountNumber);
    //
    void updateAccountCustom(String accNum, String accType, Double balance, String name, String surname, String gender, java.time.LocalDate dob, boolean married);
    //     
}
