package ac.za.tut.entity;

import ac.za.tut.entity.Question;
import ac.za.tut.entity.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-20T18:44:52")
@StaticMetamodel(Stats.class)
public class Stats_ { 

    public static volatile SingularAttribute<Stats, Question> question;
    public static volatile SingularAttribute<Stats, Student> student;
    public static volatile SingularAttribute<Stats, Long> id;

}