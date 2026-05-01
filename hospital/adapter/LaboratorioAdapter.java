package com.hospital.adapter;

import com.hospital.Data;
import com.hospital.Hospital;

public class LaboratorioAdapter extends Hospital {
    private SistemaLaboratorioExterno adaptee;

    public LaboratorioAdapter(SistemaLaboratorioExterno adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public Data obtenerResultados() {
        JSON json = adaptee.get_results_json();
        // Convert JSON to Data
        return new Data(json.getContent());
    }
}
