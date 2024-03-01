package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

//Clases que heredan:
// -clases hijas
// -subclases
// - clased detalle
// - Cases especificas
public class Medico extends Usuario {

    //POR REGLA GENERAL
    // los atributos de una clase 
    //deben ser privados

    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(int id,
                 String nombre, 
                 String apellido, 
                 TipoDocumento tipoDocumento, 
                 Long numeroIdentificación,
                 Long registroMedico,
                 Especialidad especialidad
                 ) {
//si quieres instanciar un medico
//tambien debes instanciar el usuario
//super en el constructor invoca (LLama, ejecuta)
//al constructor de la clase padre (superclase)
//super () llamada al constructor de la superclase
//debe ser lo primero que aparezca en el
//constructor de la clase hija
        super(id, nombre, apellido, tipoDocumento, numeroIdentificación);
        //a continuacion inicializamos
        //atributos propios de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
    

} 
