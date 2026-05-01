package com.hospital.decorator;

public class SeguroPremium extends CitaDecorator {
    private String field;

    public SeguroPremium(Cita wrappee) {
        super(wrappee);
    }

    @Override
    public void cambiarFecha() {
        super.cambiarFecha();
        // Additional premium logic
    }
}
