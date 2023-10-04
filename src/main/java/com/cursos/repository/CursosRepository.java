package com.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cursos.model.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {
    @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :priceMin AND :priceMax")
    List<Curso> getPreciosBetween(double priceMin, double priceMax);
}
