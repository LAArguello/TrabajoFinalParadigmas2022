/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinalparadigmasiii.Objetos;

import java.sql.Date;



/**
 *
 * @author Leonel Arguello
 */
public class Internacion {


    private Integer id;
    private String paciente;
    private Date fecha;
    private String diagnostico;
    private Cama cama;

    
        public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Cama getCama() {
        return cama;
    }

    public void setCama(Cama cama) {
        this.cama = cama;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
}
