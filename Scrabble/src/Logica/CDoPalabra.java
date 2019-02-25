/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Logica;

import javax.swing.JButton;

/**
 *
 * @author JQuintero
 */
public class CDoPalabra extends Casilla {

    Palabra palabraFormada;

    public CDoPalabra(int x, int y, Ficha fichaActual, boolean estaOcupado, JButton botonAsociado) {
        super(x, y, fichaActual, estaOcupado, botonAsociado);
    }

    @Override
    public void CalcularPuntaje() {
        if (estaOcupado) {
            palabraFormada.puntaje = palabraFormada.puntaje * 2;
        }
    }
}
