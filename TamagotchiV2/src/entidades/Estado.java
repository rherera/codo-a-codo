/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alumno
 */
public class Estado implements EstadoImpl{
    
    private String mostrarEstado;    

    public String getMostrarEstado() {
        return this.mostrarEstado;
    }

    @Override
    public void setMostrarEstado(String mostrarEstado) {
        this.mostrarEstado = mostrarEstado;
    }

}
