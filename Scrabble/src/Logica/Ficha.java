/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Ficha {

    //Atributos de clase 
    private String letra; //Simbolo sobre la ficha
    private int valor;
    private int estado; //Estado actual de la ficha -> { 0: En bolsa, 1: En mano, 2: En tablero}
    private Casilla casillaAct;
    private ImageIcon imagenPeq;
    private ImageIcon imagenGra;

    public Ficha(String letra, int valor, ImageIcon imagenA, ImageIcon imagenB) {
        this.letra = letra;
        this.valor = valor;
        this.estado = 0;
        this.imagenPeq = imagenA;
        this.imagenGra = imagenB;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Casilla getCasillaAct() {
        return casillaAct;
    }

    public void setCasillaAct(Casilla casillaAct) {
        this.casillaAct = casillaAct;
    }

    public ImageIcon getImagenPeq() {
        return imagenPeq;
    }

    public void setImagenPeq(ImageIcon imagenPeq) {
        this.imagenPeq = imagenPeq;
    }

    public ImageIcon getImagenGra() {
        return imagenGra;
    }

    public void setImagenGra(ImageIcon imagenGra) {
        this.imagenGra = imagenGra;
    }

    @Override
    public boolean equals(Object obj) {
        if (this != obj) {
            return ((Ficha) obj).letra.equals(this.letra);
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "[" + letra + "," + valor + ']';
    }

}
