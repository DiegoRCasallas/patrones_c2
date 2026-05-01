package com.hospital;

import com.hospital.composite.ComponenteHospitalario;
import com.hospital.decorator.Cita;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<ComponenteHospitalario> medicos;
    private List<Cita> citas;

    public Hospital() {
        this.medicos = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public Data obtenerResultados() {
        return new Data("Resultados internos del hospital");
    }

    public List<ComponenteHospitalario> getMedicos() {
        return medicos;
    }

    public List<Cita> getCitas() {
        return citas;
    }
}
