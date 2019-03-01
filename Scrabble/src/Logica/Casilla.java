/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JButton;

/**
 *
 * @author Estudiantes
 */
public class Casilla {

    //posicion de la casilla en el tablero
    private int x;
    private int y;
    //Indica el tipo de casilla para calcular el valor de la jugada supertipo casilla normal
    private boolean doblePal;
    private boolean doblePun;
    private boolean triplePal;
    private boolean triplePun;
    private boolean salida;
    private boolean ocupado;

    public Casilla(int x, int y) {
        this.x = x;
        this.y = y;
        this.doblePal = false;
        this.doblePun = false;
        this.triplePal = false;
        this.triplePun = false;
        this.salida = false;
        this.ocupado = false;
    }
    
    

    public Casilla(int x, int y, boolean doblePal, boolean doblePun, boolean triplePal, boolean triplePun, boolean salida, boolean ocupado) {
        this.x = x;
        this.y = y;
        this.doblePal = doblePal;
        this.doblePun = doblePun;
        this.triplePal = triplePal;
        this.triplePun = triplePun;
        this.salida = salida;
        this.ocupado = ocupado;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isDoblePal() {
        return doblePal;
    }

    public void setDoblePal(boolean doblePal) {
        this.doblePal = doblePal;
    }

    public boolean isDoblePun() {
        return doblePun;
    }

    public void setDoblePun(boolean doblePun) {
        this.doblePun = doblePun;
    }

    public boolean isTriplePal() {
        return triplePal;
    }

    public void setTriplePal(boolean triplePal) {
        this.triplePal = triplePal;
    }

    public boolean isTriplePun() {
        return triplePun;
    }

    public void setTriplePun(boolean triplePun) {
        this.triplePun = triplePun;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
