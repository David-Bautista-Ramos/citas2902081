package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.Interfaces.IAgendable;
import org.ptech.java.citas.entities.enums.EstadoCita;

public class CitaEnfermero extends Cita implements IAgendable{

    Enfermero enfermero;
    public String procesoRealizar;
    EstadoCita  estadoCita;
    public CitaEnfermero() {
    }
    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        super(id, fecha, paciente, consultorio);
        this.estadoCita=EstadoCita.AGENDADA;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public String getProcesoRealizar() {
        return procesoRealizar;
    }
    public void setProcesoRealizar(String procesoRealizar) {
        this.procesoRealizar = procesoRealizar;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

     @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio ce) {
       this.setFecha(fecha);
       this.setConsultorio(ce);
        return true;
    }
    
    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoCE) {
        this.setFecha(nuevaFecha);
       this.setConsultorio(nuevoCE);
        return true;
    }
    @Override
    public boolean cancelarCita() {
        this.estadoCita= EstadoCita.CANCELADA;
        return true;
    }
    
    
    
}
