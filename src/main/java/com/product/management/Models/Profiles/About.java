package com.product.management.Models.Profiles;

import jakarta.persistence.*;

@Entity
@Table
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Integer id;
    private  String  about;

    public About() {
    }

    public About(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

}
