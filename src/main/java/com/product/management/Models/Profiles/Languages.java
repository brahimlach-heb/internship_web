package com.product.management.Models.Profiles;

import jakarta.persistence.*;

@Entity
@Table
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
}
