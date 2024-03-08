package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
        // INSTANCIAR UN USUARIO
        Usuario u = new Medico(1,
                "Ricardo",
                "Martinez",
                TipoDocumento.CC,
                4852674L,
                562376L,
                Especialidad.DERMATOLOGIA);

        System.out.println(u.toString());


        // INSTANCIAR UN PACIENTE
        Usuario pa1 = new Paciente(12,
                "Ricardo",
                "Martinez",
                TipoDocumento.CE,
                4852674L,
                "maicol@gmail.com", 
                522581544L,
                LocalDate.now(),
                67.2, 55.8,
                TipoSangre.AB,
                 '+');

        System.out.println(pa1.toString());

         // INSTANCIAR UN ENFERMERO
         Usuario en1 = new Enfermero(134,"luna","suarez",TipoDocumento.CE,798123164L);

        System.out.println(en1.toString());

        

    }

}
