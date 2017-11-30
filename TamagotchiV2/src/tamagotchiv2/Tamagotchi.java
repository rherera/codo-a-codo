/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchiv2;

import entidades.Estado;
import entidades.Feliz;

/**
 *
 * @author alumno
 */
public class Tamagotchi {
    
    private Estado estado;
    
    public void setEstado(Estado est){
        this.estado = est;
    }
    
    public Estado getEstado(){
        return this.estado;
    }

    
    public void comer(){
        if(this.getEstado().getMostrarEstado()=="Hambriento"){
            Feliz f = new Feliz();
            this.setEstado(f);
        }
    }
    public void beber(){
        if(this.getEstado().getMostrarEstado()=="Sediento"){
            Feliz f = new Feliz();
            this.setEstado(f);
        }
        
    }
    public void mimar(){
        if(this.getEstado().getMostrarEstado()=="Triste"){
            Feliz f = new Feliz();
            this.setEstado(f);
        }
    }
    
    
}
