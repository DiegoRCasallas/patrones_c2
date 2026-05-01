package com.hospital.decorator;

public class CuidadoIntensivo extends CitaDecorator {
    private String field;

    public CuidadoIntensivo(Cita wrappee) {
        super(wrappee);
    }

    @Override
    public void cambiarFecha() {
        super.cambiarFecha();
        // Additional ICU logic
    }
}
