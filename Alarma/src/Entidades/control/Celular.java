/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.control;

import Entidades.botonera.Alarma;
import Entidades.botonera.Luz;

/**
 *
 * @author alumno
 */
public class Celular extends Control {
    
    public Celular(){
        this.addBoton(new Luz());
        this.addBoton(new Alarma());
    }
    
}
