package com.hospital.composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements ComponenteHospitalario {
    private List<ComponenteHospitalario> hijos;

    public Departamento() {
        this.hijos = new ArrayList<>();
    }

    public void addHijo(ComponenteHospitalario hijo) {
        this.hijos.add(hijo);
    }

    @Override
    public void atender() {
        for (ComponenteHospitalario hijo : hijos) {
            hijo.atender();
        }
    }
}
