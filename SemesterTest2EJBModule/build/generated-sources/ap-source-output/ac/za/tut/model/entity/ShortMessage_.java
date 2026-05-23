package ac.za.tut.model.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2026-05-24T00:16:46")
@StaticMetamodel(ShortMessage.class)
public class ShortMessage_ { 

    public static volatile SingularAttribute<ShortMessage, Integer> total_consonants;
    public static volatile SingularAttribute<ShortMessage, String> uniqueWords;
    public static volatile SingularAttribute<ShortMessage, Integer> total_vowels;
    public static volatile SingularAttribute<ShortMessage, Integer> message_length;
    public static volatile SingularAttribute<ShortMessage, String> shortMessage;
    public static volatile SingularAttribute<ShortMessage, String> repeatingWords;
    public static volatile SingularAttribute<ShortMessage, Long> id;
    public static volatile SingularAttribute<ShortMessage, Date> creationDate;

}