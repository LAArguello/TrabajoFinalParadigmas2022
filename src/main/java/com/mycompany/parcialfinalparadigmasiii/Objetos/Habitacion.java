/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialfinalparadigmasiii.Objetos;

import java.util.ArrayList;

/**
 *
 * @author U632698
 */
public class Habitacion {
    private Integer numero;
    private Integer ubicacion;
    private ArrayList<Cama> cama;

    public ArrayList<Cama> getCama() {
        return cama;
    }

    public void setCama(ArrayList<Cama> cama) {
        this.cama = cama;
    }
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
     public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
