package hospital.decorator;

public abstract class CitaDecorator implements Cita {
    private Cita wrappee;

    public CitaDecorator(Cita wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void cambiarFecha() {
        wrappee.cambiarFecha();
    }
}
