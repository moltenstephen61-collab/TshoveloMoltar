/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Entity
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String name; 
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateContributed; 

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Project> projects;
    //

    public Company() {
    }

    public Company(Long id, String name, Date dateContributed, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.dateContributed = dateContributed;
        this.projects = projects;
    }
    public String getName() {    
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateContributed() {
        return dateContributed;
    }

    public void setDateContributed(Date dateContributed) {
        this.dateContributed = dateContributed;
    }

    public List<Project> getProjects() {
        return projects;
    }

    //
    public void setProjects(List<Project> projects) {    
        this.projects = projects;
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
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.entity.Company[ id=" + id + " ]";
    }
    
}
