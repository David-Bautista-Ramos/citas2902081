package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;


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

         //Crear otro medico           
        Medico m2 = new Medico(2,
                              "Felipe",
                             "Hernandez", 
                            TipoDocumento.CE,
                            41635263L,
                            741852963L,
                           Especialidad.PEDIATRIA);

        //System.out.println("id de medico:" + m1.getId());            
        //System.out.println("nomdre de medico" + m1.getNombre());
        //System.out.println("apellido de medico" + m1.getApellido());
        //System.out.println("especialidad de medico" + m1.getEspecialidad());



        //crear un enfermero :
        Enfermero e1 = new Enfermero(1, "Lola", "Lopez", TipoDocumento.PPT, 5623646L);

        //crear otro enfermero
        Enfermero e2 = new Enfermero(12, "Catalina", "Rojas", TipoDocumento.RC, 5178515178L);

        //crear otro enfermero
        Enfermero e3 = new Enfermero(31, "Daniela", "Lopez", TipoDocumento.PPT, 1662874612L);

        //anadir 2 procedimiento a enfermero
        e1.addProcedure("Aplicar Inyecciones");
        e1.addProcedure("Lavado de oidos");



        //Recorrer procedimientos de e1
        for( String p : e1.getProcedimientos()){
             System.out.println("Procedimiento:" + p);
        }

        //Crar consultorio
        Consultorio consu =new Consultorio(23, "calle fer", 3312);
        Consultorio consu2 =new Consultorio(3, "avenidad judas", 453);

        //Craear Pacientes
        Paciente p1 =new Paciente(25, "Esperanza", "Paz", TipoDocumento.CM, 73694862869L,"Espaz@gmail.com", 418596741L, LocalDate.of(2024,Month.DECEMBER,12),1.66 , 52.4, TipoSangre.AB, '+');
        Paciente p2 = new Paciente(52, "Sofia", "Rodriguez", TipoDocumento.RC, 4152352451L, "Sorof@gmai.com", 7415638745152L, LocalDate.of(2006, Month.JANUARY, 23), 1.70, 63.3, TipoSangre.O, '-');
        Paciente p3 = new Paciente(90, "Carolina", "Diaz", TipoDocumento.TI, 417416523852L, "Caroinaa@gmail.com", 741852693L, LocalDate.of(1993, Month.AUGUST, 14), 1.58, 60.5, TipoSangre.B, '+');
        Paciente p4 = new Paciente(43, "wiliam", "cesar", TipoDocumento.CC, 87443687L, "wilice@gmail.com", 857868610L, LocalDate.of(2012, Month.JULY, 30), 1.85, 85.8, TipoSangre.O, '-');
        Paciente p5 =new Paciente(2121, "filo", "lindo", TipoDocumento.CE, 5274584643L, "Filolindo@gmail.com", 54634634L,LocalDate.of(2002, Month.NOVEMBER, 23), 2.23, 50.8, TipoSangre.AB, '+');


        CitaMedico citmedi = new CitaMedico(3312, LocalDateTime.of(2092,Month.DECEMBER, 12, 03, 12, 33), p5, consu,m1,EstadoCita.AGENDADA,"Gripe");
        CitaMedico citmedi2 = new CitaMedico(1233, LocalDateTime.of(2002,Month.AUGUST, 14, 22, 50, 33), p2, consu2,m2,EstadoCita.AGENDADA,"Escopolamina");

        System.out.println(citmedi.getFecha().toString() + " " +citmedi.getConsultorio() +" " + citmedi.getMedico().getNombre() +" " + citmedi.getMedico().getApellido());
        System.out.println(citmedi2.getFecha().toString()+" " +citmedi2.getConsultorio()+" " +citmedi2.getMedico().getNombre()+" " +citmedi2.getMedico().getApellido());

        CitaEnfermero citaenfer = new CitaEnfermero(22, LocalDateTime.of(1339, Month.APRIL, 22, 05, 45, 22), p3, consu, e1,"vacuna");
        CitaEnfermero citaenfer2 = new CitaEnfermero(15, LocalDateTime.of(1888, Month.JUNE, 29, 11, 30, 15), p1, consu2 , e2,"lavado de oidos");

        System.out.println(citaenfer.getFecha().toString()+" "+citaenfer.getConsultorio()+" "+citaenfer.getEnfermero().getNombre()+" "+citaenfer.getEnfermero().getApellido()+" "+citaenfer.getPaciente().getNombre()+" "+citaenfer.getPaciente().getApellido());
        System.out.println(citaenfer2.getFecha().toString()+" "+citaenfer2.getConsultorio()+" "+citaenfer2.getEnfermero().getNombre()+" "+citaenfer2.getEnfermero().getApellido()+" "+citaenfer2.getPaciente().getNombre()+" "+citaenfer2.getPaciente().getApellido());

        citmedi.cancelarCita();
        System.out.println(citmedi.getEstado());

    }
}