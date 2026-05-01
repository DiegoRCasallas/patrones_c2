package com.hospital.facade;

import com.hospital.builder.BuilderHistoriaClinica;
import com.hospital.builder.Director;

public class HospitalFacade {
    private Director director;
    private BuilderHistoriaClinica builder;

    public HospitalFacade(Director director, BuilderHistoriaClinica builder) {
        this.director = director;
        this.builder = builder;
    }

    public void registrarNuevoPaciente() {
        // Facade method implementation
        director.construirHistoriaCompleta();
    }
}
