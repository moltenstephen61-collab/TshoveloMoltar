package ac.za.tut.entity;

import ac.za.tut.entity.Company;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-22T10:53:40")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Company> company;
    public static volatile SingularAttribute<Project, Long> id;
    public static volatile SingularAttribute<Project, String> title;

}