package ac.za.tut.model.entity;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-19T19:46:29")
@StaticMetamodel(AccountHolder.class)
public class AccountHolder_ { 

    public static volatile SingularAttribute<AccountHolder, String> gender;
    public static volatile SingularAttribute<AccountHolder, String> surname;
    public static volatile SingularAttribute<AccountHolder, String> name;
    public static volatile SingularAttribute<AccountHolder, LocalDate> dateOfBirth;
    public static volatile SingularAttribute<AccountHolder, Long> id;
    public static volatile SingularAttribute<AccountHolder, Boolean> married;

}