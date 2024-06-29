package com.ForoAlura.ForoAlura.curso;

import com.ForoAlura.ForoAlura.Modelo.curso;

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
