package org.ptech.java.citas.entities;

public class Medico {

    //POR REGLA GENERAL
    // los atributos de una clase 
    //deben ser privados
    private int id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private Long numeroIdentificación;
    private Long registroMedico;
    private Especialidad especialidad;

    //Constructor por defecto
    //siempre tiene el modificador de acceso publico
    public Medico() {
    }

    public Medico(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroIdentificación,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificación = numeroIdentificación;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //getters y setters 
    //deben ser publicos
    // Firma de eun getter:
    //tipo de dato de retorno:
    //           el tipo de dato del atributo
    //Nombre del Metodo:
    //           -get seguido del nombre del atributo
    //           -parametros: 0
    //          -Retorna: el valor del atributo
    public String getNombre() {
        //return sirve para retornar el valor al invocante 

        return this.nombre;
    }
    // sirve para asignar un valor a un atributo privado
    //Firma de un setter:
    //        -tipo de retorno: void
    //        -Nombre: set seguido del nombre del atributo
    //        -Parametros: 1, input del valor a asignar al atributo
    //        -Retorna: nada
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroIdentificación() {
        return numeroIdentificación;
    }

    public void setNumeroIdentificación(Long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }

  
   
    
}
