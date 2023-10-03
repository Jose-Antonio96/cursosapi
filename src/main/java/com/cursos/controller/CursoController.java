package com.cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.cursos.model.Curso;
import com.cursos.service.CursoService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CursoController {
    @Autowired
    CursoService service;

    @GetMapping(value="curso/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Curso buscar(@PathVariable("codCurso") int codCurso){
        return service.buscarCurso(codCurso);
    }

    @GetMapping(value="cursos", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos(){
        return service.cursos();
    }

    @PostMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void guardar(Curso curso){
        service.altaCurso(curso);
    }

    @PutMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Curso curso){
        
        service.actualizarDuracion(curso.getCodCurso(), curso.getDuracion());
    }

    @DeleteMapping(value="curso/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
        public List<Curso> eliminar(@PathVariable("codCurso") int codCurso){
        return service.eliminarCurso(codCurso);
    }

    @GetMapping(value="curso/{precioMin}/{precioMax}" , produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> precio(@PathVariable("precioMin") int precioMin, @PathVariable("precioMax") int precioMax){
        return service.getPreciosInBetween(precioMin, precioMax);
    }

    @GetMapping(value="/")
    public String hello(){
        return "Hola!";
    }
     
}
