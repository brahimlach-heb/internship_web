package com.product.management.Models.Login;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected   Integer id;
    protected   String Username;
    protected String Password;
    protected Date born;
    protected Boolean RS;
    protected String ncs;

    public Person( String username, String password, Date born, Boolean RS, String ncs) {
        Username = username;
        Password = password;
        this.born = born;
        this.RS = RS;
        this.ncs = ncs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Boolean getRS() {
        return RS;
    }

    public void setRS(Boolean RS) {
        this.RS = RS;
    }

    public String getNcs() {
        return ncs;
    }

    public void setNcs(String ncs) {
        this.ncs = ncs;
    }
}
