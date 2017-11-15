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
public class Tamagotchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cambioEstado = false;
        String prueba = "";
        
        TamagotchiApp a = new TamagotchiApp();
        
        a.setNombre("Pepe");
        a.setEstadoActual("hambriento");
        
        
        System.out.println("El Estado es: " + a.getEstadoActual());
        
        cambioEstado = a.EjecutarEstado(0);
        
        System.out.println("El usuario ingreso la acción de: " + a.accion.get(0));
        
        System.out.println("El estado actual es: " + a.getEstadoActual());
    }
    
}
