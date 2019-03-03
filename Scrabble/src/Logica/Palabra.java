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

    public void agregarFic(Ficha ficha) {
        palabra.add(ficha);
    }

    //calcula el valor de la palabra formada
    public void calcularPun() {
        int suma = 0;
        int multiplicador = 1;
        for (Ficha ficha : palabra) {
            int valorFicha = ficha.getValor();
            if (!ficha.getCasillaAct().isOcupado()) {
                if (ficha.getCasillaAct().isDoblePun()) {
                    valorFicha *= 2;
                } else if (ficha.getCasillaAct().isTriplePun()) {
                    valorFicha *= 3;
                } else if (ficha.getCasillaAct().isDoblePal()) {
                    multiplicador *= 2;
                } else if (ficha.getCasillaAct().isTriplePal()) {
                    multiplicador *= 3;
                }
            }
            suma += valorFicha;
        }
        puntaje = suma * multiplicador;
    }

}
