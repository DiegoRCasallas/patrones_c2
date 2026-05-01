package hospital.facade;

import hospital.builder.BuilderHistoriaClinica;
import hospital.builder.Director;

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
