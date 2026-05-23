/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Entity
public class ShortMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shortMessage;
    private int total_vowels;
    private int total_consonants;
    private int message_length;
    private String uniqueWords;
    private String repeatingWords;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    //

    public ShortMessage() {
    }

    public ShortMessage(Long id, String shortMessage, int total_vowels, int total_consonants, int message_length, String uniqueWords, String repeatingWords, Date creationDate) {
        this.id = id;
        this.shortMessage = shortMessage;
        this.total_vowels = total_vowels;
        this.total_consonants = total_consonants;
        this.message_length = message_length;
        this.uniqueWords = uniqueWords;
        this.repeatingWords = repeatingWords;
        this.creationDate = creationDate;
    }
    public String getShortMessage() {    
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public int getTotal_vowels() {
        return total_vowels;
    }

    public void setTotal_vowels(int total_vowels) {
        this.total_vowels = total_vowels;
    }

    public int getTotal_consonants() {
        return total_consonants;
    }

    public void setTotal_consonants(int total_consonants) {
        this.total_consonants = total_consonants;
    }

    public int getMessage_length() {
        return message_length;
    }

    public void setMessage_length(int message_length) {
        this.message_length = message_length;
    }

    public String getUniqueWords() {
        return uniqueWords;
    }

    public void setUniqueWords(String uniqueWords) {
        this.uniqueWords = uniqueWords;
    }

    public String getRepeatingWords() {
        return repeatingWords;
    }

    public void setRepeatingWords(String repeatingWords) {
        this.repeatingWords = repeatingWords;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    //
    public void setCreationDate(Date creationDate) {    
        this.creationDate = creationDate;
    }

    //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShortMessage)) {
            return false;
        }
        ShortMessage other = (ShortMessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.model.entity.ShortMessage[ id=" + id + " ]";
    }
    
}
