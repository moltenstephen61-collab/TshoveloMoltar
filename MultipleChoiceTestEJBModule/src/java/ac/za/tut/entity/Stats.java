/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Entity
public class Stats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // Relationship with Student using StudentNumber
    @ManyToOne
    @JoinColumn(name = "student_num_fk")
    private Student student;

    // Relationship with Question
    @ManyToOne
    @JoinColumn(name = "question_id_fk")
    private Question question;
    public Long getId() {
        return id;
    }
    //

    public Stats() {
    }

    public Stats(Long id, Student student, Question question) {
        this.id = id;
        this.student = student;
        this.question = question;
    }
    public Student getStudent() {    
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Question getQuestion() {
        return question;
    }

    //
    public void setQuestion(Question question) {    
        this.question = question;
    }

    //
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
        if (!(object instanceof Stats)) {
            return false;
        }
        Stats other = (Stats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.entity.Stats[ id=" + id + " ]";
    }
    
}
