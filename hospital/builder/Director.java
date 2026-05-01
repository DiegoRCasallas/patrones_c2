package hospital.builder;

public class Director {
    private BuilderHistoriaClinica builder;

    public Director(BuilderHistoriaClinica builder) {
        this.builder = builder;
    }

    public void cambiarBuilder(BuilderHistoriaClinica builder) {
        this.builder = builder;
    }

    public void elaborar(String type) {
        // Implementation based on type
    }

    public void construirHistoriaBase() {
        builder.reset();
        builder.agregarDatos();
    }

    public void construirHistoriaCompleta() {
        builder.reset();
        builder.agregarDatos();
        builder.agregarDiagnostico();
    }
}
