package com.cursos.service;

import java.util.List;
import com.cursos.model.Curso;

public interface CursoService {
    List<Curso> cursos();

    void altaCurso(Curso curso);

    List <Curso> eliminarCurso(int codCurso);

    void actualizarDuracion(int codCurso, int duracion);
    
    Curso buscarCurso(int codCurso);

    List<Curso> getPreciosInBetween(int priceMin, int priceMax);
}
