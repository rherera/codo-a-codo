/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

import java.util.ArrayList;

/**
 *
 * @author rherera
 */
public class TamagotchiApp {
    private String nombre;
    private String estadoActual;
    ArrayList accion = new ArrayList();
    ArrayList estado = new ArrayList();
    
    public TamagotchiApp(){
        //ArrayList accion = new ArrayList();
        //ArrayList estado = new ArrayList();
        
        accion.add(0, "comer");
        accion.add(1, "beber");
        accion.add(2, "mimos");
        
        estado.add(0, "hambriento");
        estado.add(1, "sediento");
        estado.add(2, "triste");
        estado.add(3, "feliz");
        
        this.setEstadoActual(this.estado.get(3).toString());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
    public boolean EjecutarEstado(Integer accion){
        boolean retorno = false;
        String accionIngresada = "";
        
        if (accion >= 0 && accion <= 2){
                      
           if (this.getEstadoActual().equals(this.estado.get(accion).toString())){
               
               this.setEstadoActual(this.estado.get(3).toString());
               
               retorno = true;
           }
        }
        return retorno;
        
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
 
        this.estadoActual = estadoActual;
    }

}
