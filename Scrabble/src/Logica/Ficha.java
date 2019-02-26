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
public class Ficha {
    private char letra;
    int valor;
    boolean enUso;
    public Ficha(){
        
    }
    public Ficha(char letra, int valor){
        this.letra = letra;
        this.valor = valor;
    }
    
    public char getLetra() {
        return letra;
    }

    public int getValor() {
        return valor;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
   
}