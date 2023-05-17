package com.product.management.Models.Profiles;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Certifications {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private  String Name;

    private  String Url;
    private  String organization;
    private LocalDate date_certif;
    private String CredentialId;

    public Certifications() {
    }

    public Certifications( String name, String url, String organization, LocalDate date_certif, String credentialId) {
        this.Name = name;
        this.Url = url;
        this.organization = organization;
        this.date_certif = date_certif;
        this.CredentialId = credentialId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public LocalDate getDate_certif() {
        return date_certif;
    }

    public void setDate_certif(LocalDate date_certif) {
        this.date_certif = date_certif;
    }

    public String getCredentialId() {
        return CredentialId;
    }

    public void setCredentialId(String credentialId) {
        CredentialId = credentialId;
    }
}
