package org.ptech.java.citas.Interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {
    //proponer un metodo para agendar la cita
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) ;

    public boolean reAgendarCita (LocalDateTime nuevaFecha, Consultorio nuevoC);
 
    public boolean cancelarCita () ;
}
