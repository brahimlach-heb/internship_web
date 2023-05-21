package com.product.management.Models.Profiles;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private List<String> list_lang;

    public Languages(List<String> list_lang) {
        this.list_lang = list_lang;
    }

    public List<String> getList_lang() {
        return list_lang;
    }

    public void setList_lang(List<String> list_lang) {
        this.list_lang = list_lang;
    }
}
