/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Logica;

import java.util.ArrayList;

/**
 * Clase que representa a una palabra formada
 *
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 * @see Logica.Ficha
 */
public class Palabra {

    private int puntaje;
    private ArrayList<Ficha> palabra;

    /**
     * Constructor sin parametros
     */
    public Palabra() {
        this.palabra = new ArrayList<>();
    }

    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Ingresa una ficha a la palabra
     *
     * @param ficha
     * @see Logica.Ficha
     */
    public void agregarFic(Ficha ficha) {
        palabra.add(ficha);
    }

    /**
     * calcula el valor de la palabra formada y lo asigna al atributo puntaje
     */
    public void calcularPun() {
        int suma = 0;
        int multiplicador = 1;
        for (Ficha ficha : palabra) {
            int valorFicha = ficha.getValor();
            if (ficha.getCasillaAct().isOcupado()) {
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
