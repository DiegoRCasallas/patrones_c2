package hospital.builder;

import hospital.HistoriaClinica;
import hospital.Persona;

public class BuilderHCEmergencia implements BuilderHistoriaClinica {
    private Persona paciente;
    private HistoriaClinica resultado;

    public BuilderHCEmergencia(Persona paciente) {
        this.paciente = paciente;
        this.reset();
    }

    @Override
    public void reset() {
        this.resultado = new HistoriaClinica();
    }

    @Override
    public void agregarDatos() {
        // Implementation
    }

    @Override
    public void agregarDiagnostico() {
        // Implementation
    }

    public void agregarDatosIdentificacion() {
        // Implementation
    }

    public void agregarDatosBiologicos() {
        // Implementation
    }

    public void agregarDatosEmergencia() {
        // Implementation
    }

    public HistoriaClinica getResultado() {
        return this.resultado;
    }
}
