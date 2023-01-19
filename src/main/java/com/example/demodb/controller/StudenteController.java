package com.example.demodb.controller;

import com.example.demodb.entity.Studente;
import com.example.demodb.repository.StudenteRepository;
import com.example.demodb.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/studente")
public class StudenteController {
    @Autowired
    private StudentServiceImpl studentServiceIml;

    @Autowired
    private StudenteRepository studenteRepository;

    @RequestMapping(value = "/saveStudente",method = RequestMethod.POST)
    public List<Studente> saveStudente(@RequestBody List<Studente> listStudenti){
        List<Studente> rispostaStudente = (List<Studente>) studentServiceIml.saveStudente(listStudenti);
        return rispostaStudente;
    }

    @RequestMapping(value = "/getAllStudente",method = RequestMethod.GET)
    public List<Studente> getAllStudent(){
        List<Studente> rispostaStudente = (List<Studente>) studentServiceIml.getAllStudente();
        return rispostaStudente;
    }

    @RequestMapping(value = "/getStudenteByAbbonamento/{abbonamento}", method = RequestMethod.GET)
    public List<Studente> getAllStudentByAbbonamento(@PathVariable String abbonamento){
        List<Studente> risposta = (List<Studente>) studenteRepository.findAllByAbbonamentiList_Abbonamento(abbonamento);
        return risposta;
    }


}
