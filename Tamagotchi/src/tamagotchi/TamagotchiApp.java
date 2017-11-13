/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

/**
 *
 * @author rherera
 */
public class TamagotchiApp {
    private Accion accion;
    private Estado estado;
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cambiarEstado(Estado e){
        //
    }
    
    public void ejecutarAccion(Accion a){
        //
    }
    
   /* public Estado estadoActual(Estado e){
        return e.settearEstado();
    }*/
}
