package ac.za.tut.model.entity;

import ac.za.tut.model.entity.AccountHolder;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-19T14:37:32")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, AccountHolder> accountHolder;
    public static volatile SingularAttribute<Account, Double> balance;
    public static volatile SingularAttribute<Account, String> accountType;
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, String> accountNumber;
    public static volatile SingularAttribute<Account, LocalDate> creationDate;

}