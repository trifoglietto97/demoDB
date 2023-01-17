package com.example.demodb.entity;

import jakarta.persistence.*;

@Entity
public class Abbonamenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long abbonamentiId;

    public Long getAbbonamentiId() {
        return abbonamentiId;
    }

    public void setAbbonamentiId(Long abbonamentiId) {
        this.abbonamentiId = abbonamentiId;
    }



}
