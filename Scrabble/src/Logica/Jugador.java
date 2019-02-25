/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Logica.Ficha;
import java.util.ArrayList;
/**
 *
 * @author Estudiantes
 */
public class Jugador {
    public String nombre;
    int puntaje;
   private ArrayList<Ficha> FichaJug = new ArrayList<Ficha>();
    
    public Jugador(){
        
    }
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public void setFichaJug(ArrayList<Ficha> FichaJug) {
        this.FichaJug = FichaJug;
    }

    public ArrayList<Ficha> getFichaJug() {
        return FichaJug;
    }
    
}