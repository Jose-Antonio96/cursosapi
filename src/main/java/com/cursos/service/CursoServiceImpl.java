package com.cursos.service;

import java.util.List;

import com.cursos.model.Curso;
import com.cursos.repository.CursosRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired 
    CursosRepository repository;

    @Override
    public List<Curso> cursos(){
        return repository.findAll();
    }

    @Override
    public void altaCurso(Curso curso){
        repository.save(curso);
    }

    @Override
    public List <Curso> eliminarCurso(int codCurso){
        repository.deleteById(codCurso);
        return repository.findAll();
    }

    @Override
    public void actualizarDuracion(int codCurso, int duracion){
        Curso curso = repository.findById(codCurso).orElse(null);
        if (curso != null) {
            curso.setDuracion(duracion);
            repository.save(curso);
        }
    }
    
    @Override
    public Curso buscarCurso(int codCurso){
        return repository.findById(codCurso).orElse(null);
    }

    @Override
    public List<Curso> getPreciosInBetween(double priceMin, double priceMax){
        return repository.getPreciosBetween(priceMin, priceMax);
    }
}
