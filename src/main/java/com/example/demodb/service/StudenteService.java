package com.example.demodb.service;

import com.example.demodb.entity.Studente;

import java.util.List;

public interface StudenteService {
    List<Studente> saveStudente(List<Studente> listStudenti);
    public List<Studente> getAllStudente();
}
