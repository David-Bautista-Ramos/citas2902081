package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.Month;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;


public class Main {
    public static void main(String[] args) {

     //crear un medico
     Medico m1 = new Medico(1, 
                      "Karol", 
                     "Sierra", 
                    TipoDocumento.CC, 
                     852741963L,
                    3344554L, 
                    Especialidad.CARDIOLOGIA);

        System.out.println("id de medico:" + m1.getId());            
        System.out.println("nomdre de medico" + m1.getNombre());
        System.out.println("apellido de medico" + m1.getApellido());
        System.out.println("especialidad de medico" + m1.getEspecialidad());

        //crear un enfermero :
        Enfermero e1 = new Enfermero(1, "Lola", "Lopez", TipoDocumento.PPT, 5623646L);
        //anadir 2 procedimiento a enfermero
        e1.addProcedure("Aplicar Inyecciones");
        e1.addProcedure("Lavado de oidos");

        //Recorrer procedimientos de e1
        for( String p : e1.getProcedimientos()){
             System.out.println("Procedimiento:" + p);
        }
    }
}