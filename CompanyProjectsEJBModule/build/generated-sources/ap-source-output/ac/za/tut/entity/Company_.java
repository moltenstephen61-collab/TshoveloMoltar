package ac.za.tut.entity;

import ac.za.tut.entity.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-21T20:02:33")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile ListAttribute<Company, Project> projects;
    public static volatile SingularAttribute<Company, String> name;
    public static volatile SingularAttribute<Company, Long> id;
    public static volatile SingularAttribute<Company, Date> dateContributed;

}