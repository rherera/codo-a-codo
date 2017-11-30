/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchiv2;

import entidades.Estado;
import entidades.Hambriento;

/**
 *
 * @author alumno
 */
public class TamagotchiV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tamagotchi t = new Tamagotchi();
        Estado e = new Estado();
        Hambriento h = new Hambriento();
        t.setEstado(h);
        System.out.println("Que estado tengo? "+ t.getEstado().getMostrarEstado());
        t.comer();
        System.out.println("Estado actal : "+t.getEstado().getMostrarEstado());
        
    
    }
    
}
