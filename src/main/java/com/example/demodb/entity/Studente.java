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
    private Long studenteId;

    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<Abbonamenti> abbonamentiList = new ArrayList();


    public Long getStudenteId() {
        return studenteId;
    }

    public void setStudenteId(Long studenteId) {
        this.studenteId = studenteId;
    }

    public List<Abbonamenti> getAbbonamentiList() {
        return abbonamentiList;
    }

    public void setAbbonamentiList(List<Abbonamenti> abbonamentiList) {
        this.abbonamentiList = abbonamentiList;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "studenteId=" + studenteId +
                ", abbonamentiList=" + abbonamentiList +
                '}';
    }
}
