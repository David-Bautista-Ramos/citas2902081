package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.Interfaces.IAgendable;
import org.ptech.java.citas.entities.enums.EstadoCita;

public class CitaMedico extends Cita implements IAgendable  {
  
    Medico medico;
    EstadoCita estado;
    private String motivo;
    

    public CitaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio,Medico medico,EstadoCita estadoCita,String motivo ) {
        super(id, fecha, paciente, consultorio);
        this.estado = EstadoCita.AGENDADA;
        this.medico = medico;
        this.motivo = motivo;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstado() {
        return estado;
    }
    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    public String getmotivo() {
        return motivo;
    }
    public void getmotivo(String motivo) {
        this.motivo = motivo;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
       this.setFecha(fecha);
       this.setConsultorio(c);
        return true;
    }
    
    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoC) {
        this.setFecha(nuevaFecha);
       this.setConsultorio(nuevoC);
        return true;
    }
    @Override
    public boolean cancelarCita() {
        this.estado= EstadoCita.CANCELADA;
        return true;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
     
    
}
