/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Casilla {
    //posicion de la casilla en el tablero
    int x;
    int y;
    //Indica el tipo de casilla para calcular el valor de la jugada supertipo casilla normal
    int tipo;
    Ficha fichaActual;
    boolean estaOcupado;
    
    
    
    public int calcularValor(){
        return fichaActual.valor;
    }
}
