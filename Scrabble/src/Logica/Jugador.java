/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Jugador {

    //Atributos de clase
    private String nombre;
    private int puntaje;
    //fichas que tiene el jugador actualmente
    private ArrayList<Ficha> fichasDis = new ArrayList<>();
    //historial de jugadas
    private ArrayList<Palabra> jugadas = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        fichasDis = new ArrayList<>();
        jugadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //metodo agregar jugada
    public void agregarJugada(Palabra palabra) {
        jugadas.add(palabra);
    }

    //metodo agregar fichas
    public void agregarFic(Ficha ficha) {
        fichasDis.add(ficha);
    }

    //metodo eliminar todas las fichas
    public Ficha eliminarFicha() {
        if (!fichasDis.isEmpty()) {
            return fichasDis.remove(0);
        } else {
            System.out.println("No hay Fichas");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Jugador:\n\t" + nombre + "\n\t" + puntaje + "\n\t" + fichasDis + "\n\t" + jugadas;
    }

}
