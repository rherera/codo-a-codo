/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.control;
import Entidades.botonera.Alarma;
import Entidades.botonera.Luz;
import Entidades.botonera.Puerta;


/**
 *
 * @author alumno
 */
public class Web extends Control{
    
    public Web(){
        this.addBoton(new Puerta());
        this.addBoton(new Alarma());
        this.addBoton(new Luz());
    }    
    
}
