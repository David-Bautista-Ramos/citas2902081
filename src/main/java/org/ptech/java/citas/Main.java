package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto medico
        // Crear un objeto es lo mismo quer instanciar
        // una manera de dar valor
        // a atributos privados en una clase
        // es a travez constructor
        // parametrizado
        Medico m = new Medico(1, "llanero", "solitario", TipoDocumento.CC, 1128522826L, 1000125L,
                Especialidad.CARDIOLOGIA);

        Medico m2 = new Medico(2, "sofia", "vergara", TipoDocumento.CE, 255259964L, 9868L,
                Especialidad.OTORRINOLARINGOLOGIA);

        System.out.println("Medico1: "+m);
        System.out.println("Medico2: "+m2);
        // instanciar otro medico
        Medico m3 = new Medico();
        // se debe hacer: se debe utilizar primero el setter
        // del atributo a asignar
        m3.setNombre("Karla");
        m3.setApellido("Bro");
        m3.setTipoDocumento(TipoDocumento.CE);
        m3.setNumeroIdentificación(7845120L);
 
        System.out.println("Medico3: "+m3.getNombre()+ "---" + m3.getApellido()+ "---" + m3.getTipoDocumento()+ "---"+m3.getNumeroIdentificación());

        //craer paciente
        Paciente p = new Paciente(1 , "Lola" , "Landa" , TipoDocumento.RC , 23432423L , "lola@gmail.com" , 2342342L , LocalDate.of(2002, Month.AUGUST, 6) , 184.3 , 95.6 , TipoSangre.AB , '+');
        Paciente p2 = new Paciente(12 , "Mia" , "Diaz" , TipoDocumento.CC, 23485232423L , "Miaa@gmail.com" , 562342342L , LocalDate.of(2002, Month.AUGUST, 8) , 174.3 , 65.6 , TipoSangre.B , '+');

        System.out.println("Paciente1: "+p.getNombre()+"---"+p.getApellido()+"---"+p.getEmail());
        System.out.println("Paciente2: "+p2.getNombre()+"---"+p2.getApellido()+"---"+p2.getEmail());

        //crear consultario
        Consultorio c =new Consultorio();
        c.setDireccion("calle 69");
        c.setNumero(9969);

        System.out.println("Consulta: "+c.getDireccion()+ "-----" + c.getNumero());

        Cita ci =new Cita();
        ci.setEstado(EstadoCita.AGENDADA);
        ci.setMedico(m);
        ci.setConsultorio(c);
        ci.setPaciente(p2);

        System.out.println("Cita: "+ci.getPaciente()+"---"+ci.getConsultorio()+"---"+ci.getMedico()+"----"+ci.getEstado());
    }

}