package com.example.demodb.controller;

import com.example.demodb.entity.Studente;
import com.example.demodb.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/studente")
public class StudenteController {
    @Autowired
    private StudentServiceImpl studentServiceIml;

    @RequestMapping(value = "/saveStudente",method = RequestMethod.POST)
    @ResponseBody
    public List<Studente> saveStudente(@RequestBody List<Studente> listStudenti){
        List<Studente> rispostaStudente = (List<Studente>) studentServiceIml.saveStudente(listStudenti);
        return rispostaStudente;
    }

    @RequestMapping(value = "/getAllStudente",method = RequestMethod.GET)
    @ResponseBody
    public List<Studente> getAllStudent(){
        List<Studente> rispostaStudente = (List<Studente>) studentServiceIml.getAllStudente();
        return rispostaStudente;
    }

}
