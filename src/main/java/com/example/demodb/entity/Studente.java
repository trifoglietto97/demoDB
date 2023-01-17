package com.example.demodb.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Studente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studenteId;

    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<Abbonamenti> abbonamentiList = new ArrayList();
}
