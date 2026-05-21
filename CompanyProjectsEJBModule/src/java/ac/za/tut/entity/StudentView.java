/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.entity;

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
public class StudentView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentNumber; // Your identifier for unique views
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date viewDate;
    //

    public StudentView() {
    }

    public StudentView(Long id, String studentNumber, Date viewDate) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.viewDate = viewDate;
    }
    public String getStudentNumber() {    
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Date getViewDate() {
        return viewDate;
    }

    //
    public void setViewDate(Date viewDate) {    
        this.viewDate = viewDate;
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
        if (!(object instanceof StudentView)) {
            return false;
        }
        StudentView other = (StudentView) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.entity.StudentView[ id=" + id + " ]";
    }
    
}
