/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.control;

import Entidades.botonera.Boton;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public abstract class Control {
    private ArrayList<Boton> botones = new ArrayList<>();    
    
    public void addBoton(Boton b){
        this.botones.add(b);
    }
    
    public Boton getBoton(Integer i){
        return this.botones.get(i);
    }
    
}
