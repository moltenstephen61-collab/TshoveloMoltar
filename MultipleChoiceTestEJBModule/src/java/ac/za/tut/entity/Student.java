/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "STUD_NUM") // Using student number as the primary key
    private String studentNumber;
    private String name;
    private String surname;
    private double marks; // Stores the overall percentage mark
    //

    public Student() {
    }

    public Student(String studentNumber, String name, String surname, double marks) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }
    
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMarks() {
        return marks;
    }

    //
    public void setMarks(double marks) {
        this.marks = marks;
    }

    //
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNumber != null ? studentNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentNumber == null && other.studentNumber != null) || (this.studentNumber != null && !this.studentNumber.equals(other.studentNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.entity.Student[ id=" + studentNumber + " ]";
    }
    
}
