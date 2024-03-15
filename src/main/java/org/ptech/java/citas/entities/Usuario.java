package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.Especialidad;
//clase padre
//clase base
abstract class Usuario {

    //atributos a heredarse
    //deben ser protected

    protected int id;
    protected String nombre;
    protected String apellido;
    protected TipoDocumento tipoDocumento;
    protected Long numeroIdentificación;
    
    //sobreescribir el metodo toString
    public String toString(){
        return "Usuario:"+ "[Nombre:" + this.nombre +" Apellido:"+ this.apellido +" Tipo de Documento:"+ this.tipoDocumento +" Numero Identificacion:" +this.numeroIdentificación;

    }
    public Usuario(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroIdentificación) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificación = numeroIdentificación;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public Long getNumeroIdentificación() {
        return numeroIdentificación;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumeroIdentificación(Long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }
    
    
}
