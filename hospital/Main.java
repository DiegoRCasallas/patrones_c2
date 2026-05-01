package hospital;

import hospital.builder.BuilderHCCita;
import hospital.builder.Director;
import hospital.facade.HospitalFacade;
import hospital.composite.Departamento;
import hospital.composite.Cardiologo;
import hospital.composite.Neurologo;
import hospital.adapter.SistemaLaboratorioExterno;
import hospital.adapter.LaboratorioAdapter;
import hospital.decorator.Cita;
import hospital.decorator.ServicioBasico;
import hospital.decorator.SeguroPremium;
import hospital.decorator.ExamenEspecializado;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS DEL SISTEMA HOSPITALARIO ===\n");

        // 1. Prueba del Patrón Facade y Builder
        System.out.println("--- Prueba de Patrones Facade y Builder ---");
        Persona paciente = new Persona("Juan Pérez");
        BuilderHCCita builderCita = new BuilderHCCita(paciente);
        Director director = new Director(builderCita);
        HospitalFacade facade = new HospitalFacade(director, builderCita);
        
        System.out.println("Ejecutando registrarNuevoPaciente() desde el Facade...");
        facade.registrarNuevoPaciente();
        HistoriaClinica hc = builderCita.getResultado();
        System.out.println("Historia Clínica construida en memoria para: " + paciente.getName() + ".\n");

        // 2. Prueba del Patrón Composite
        System.out.println("--- Prueba del Patrón Composite ---");
        Departamento deptoCardiologia = new Departamento();
        Cardiologo c1 = new Cardiologo();
        Neurologo n1 = new Neurologo();
        
        deptoCardiologia.addHijo(c1);
        deptoCardiologia.addHijo(n1);
        
        System.out.println("Llamando a atender() en el Departamento (esto delega a sus hijos Medicos)...");
        deptoCardiologia.atender();
        System.out.println("Atención completada por todos los miembros del departamento.\n");

        // 3. Prueba del Patrón Adapter
        System.out.println("--- Prueba del Patrón Adapter ---");
        SistemaLaboratorioExterno sistemaExterno = new SistemaLaboratorioExterno();
        LaboratorioAdapter adapter = new LaboratorioAdapter(sistemaExterno);
        
        System.out.println("Llamando a obtenerResultados() en el Adapter...");
        Data dataAdapter = adapter.obtenerResultados();
        System.out.println("Datos obtenidos a través del adaptador (JSON convertido a Data): " + dataAdapter.getContent() + "\n");

        // 4. Prueba del Patrón Decorator
        System.out.println("--- Prueba del Patrón Decorator ---");
        Cita citaNormal = new ServicioBasico();
        Cita citaConSeguro = new SeguroPremium(citaNormal);
        Cita citaCompleta = new ExamenEspecializado(citaConSeguro);
        
        System.out.println("Llamando a cambiarFecha() en una cita decorada con SeguroPremium y ExamenEspecializado...");
        citaCompleta.cambiarFecha();
        System.out.println("Lógica de decoración ejecutada (ServicioBasico -> SeguroPremium -> ExamenEspecializado).\n");

        System.out.println("=== PRUEBAS COMPLETADAS ===");
    }
}
