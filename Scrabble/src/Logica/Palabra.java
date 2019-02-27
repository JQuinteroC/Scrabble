/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class Palabra {

    private int puntaje;
    private ArrayList<Ficha> palabra;

    public Palabra() {
        this.palabra = new ArrayList<>();
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void agregarFic(Ficha ficha) {
        palabra.add(ficha);
    }

    public void calcularPun() {
        int sum = 0;
        int mult = 1;
        for (Ficha ficha : palabra) {
            
        }
    }

}
