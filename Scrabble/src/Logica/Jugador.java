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
    private ArrayList<Palabra> jugadas = new ArrayList<>();

    public Jugador() {
    }

    
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
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
    public void agregarJugada(Palabra palabra){
        jugadas.add(palabra);
    }
    
    //metodo agregar fichas
    public void agregarFic(Ficha ficha){
        fichasDis.add(ficha);
    }
    
    //metodo eliminar una ficha especifica
    public void eliminarFic(Ficha ficha){
        for(int i = 0; i < fichasDis.size(); i++){
            if(fichasDis.get(i).equals(ficha)){
                fichasDis.remove(i);
            }
        }
    }
    //metodo eliminar todas las fichas
    public void eliminarTod(){
        fichasDis.clear();
    }
    
    

}
