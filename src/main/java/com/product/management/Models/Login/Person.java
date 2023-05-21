package com.product.management.Models.Login;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private    Integer id;
    private    String First;
    private    String Last;
    private   String Username;
    private String Password;
    private Date born;
    private Boolean RS;
    private String ncs;

    public Person(String first, String last, String username, String password, Date born, Boolean RS, String ncs) {
        First = first;
        Last = last;
        Username = username;
        Password = password;
        this.born = born;
        this.RS = RS;
        this.ncs = ncs;
    }

    public Integer getId() {
        return id;
    }

    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        Last = last;
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
