/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String accountNumber;
    @Column(nullable = false)
    private String accountType;
    private Double balance;
    @Column(nullable = false)
    private LocalDate creationDate = LocalDate.now();
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "holder_id", referencedColumnName = "id")
    private AccountHolder accountHolder;
    //
    public Account() {
    }

    public Account(Long id, String accountNumber, String accountType, Double balance, LocalDate creationDate, AccountHolder accountHolder) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.creationDate = creationDate;
        this.accountHolder = accountHolder;
    }
    //

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate() {
        this.creationDate = LocalDate.now();
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ac.za.tut.model.entity.Account[ id=" + id + " ]";
    }
    
}
