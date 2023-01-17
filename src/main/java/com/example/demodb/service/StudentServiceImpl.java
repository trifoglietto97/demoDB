package com.example.demodb.service;

import com.example.demodb.entity.Studente;
import com.example.demodb.repository.StudenteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudenteService {
    @Autowired
    private StudenteRepository studenteRepository;
    @Transactional
    public List<Studente> saveStudente(List<Studente> listStudenti){
        List<Studente> risposta = (List<Studente>)studenteRepository.saveAll(listStudenti);
        return risposta;

    }


}
