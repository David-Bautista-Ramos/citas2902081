package org.ptech.java.citas.entities;

import java.time.LocalDate;

public class Cita {
    private int id;
    private LocalDate fecha;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;
    private EstadoCita estado;

    public Cita() {
        
    }

    public Cita(int id, LocalDate fecha, Medico medico, Paciente paciente, Consultorio consultorio,
            EstadoCita estado) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.estado = estado;
    }
    
    //get y set
    
    

    public Medico getMedico() {
        return medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    

    
}

