package com.example.demodb.entity;

import jakarta.persistence.*;

@Entity
public class Abbonamenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long abbonamentiId;

    @Column(name = "_abbonamento")
    private String abbonamento;

    public Long getAbbonamentiId() {
        return abbonamentiId;
    }

    public void setAbbonamentiId(Long abbonamentiId) {
        this.abbonamentiId = abbonamentiId;
    }

    public String getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(String abbonamento) {
        this.abbonamento = abbonamento;
    }

    @Override
    public String toString() {
        return "Abbonamenti{" +
                "abbonamentiId=" + abbonamentiId +
                ", abbonamento='" + abbonamento + '\'' +
                '}';
    }
}
