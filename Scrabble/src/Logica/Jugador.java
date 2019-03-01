/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.HashMap;

/**
 *
 * @author Estudiantes
 */
public class Jugador {

    private String nombre;
    private int puntaje;
    private HashMap<String, Ficha> FichasDis = new HashMap();

    public Jugador() {
    }

    
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

}
