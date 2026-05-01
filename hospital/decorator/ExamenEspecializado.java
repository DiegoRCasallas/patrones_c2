package hospital.decorator;

public class ExamenEspecializado extends CitaDecorator {
    private String field;

    public ExamenEspecializado(Cita wrappee) {
        super(wrappee);
    }

    @Override
    public void cambiarFecha() {
        super.cambiarFecha();
        // Additional specialized exam logic
    }
}
