package com.example.demodb.entity;

import jakarta.persistence.*;

@Entity
public class Abbonamenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abbonamentiId;

    private String abbonamento;

}
