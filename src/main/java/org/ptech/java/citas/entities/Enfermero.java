package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

public class Enfermero extends Usuario {

    private List<String> procedimientos;

    public Enfermero(int id,
            String nombre,
            String apellido,
            TipoDocumento tipoDocumento,
            Long numeroIdentificación) {
        // 1.llamar al constructor de
        // la superclase

        super(id, nombre, apellido, tipoDocumento, numeroIdentificación);
        // 2.inicializar atributos
        // intrinsecos del objeto
        this.procedimientos = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + "id ="+ super.id+ "Nombre ="+ super.nombre +"Apellido ="+ super.apellido + "]";
    }

    public void addProcedure(String procedure) {
        // añadir el procedimiento a
        // a la lista de procedimiento
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }

}
