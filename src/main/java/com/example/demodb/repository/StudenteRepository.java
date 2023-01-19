package com.example.demodb.repository;

import com.example.demodb.entity.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Long> {
    List<Studente> findAllByAbbonamentiList_Abbonamento(String abbonamento);

}
