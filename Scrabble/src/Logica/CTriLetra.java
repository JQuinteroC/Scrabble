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
public class CTriLetra extends Casilla {

    public CTriLetra(int x, int y, Ficha fichaActual, boolean estaOcupado, JButton botonAsociado) {
        super(x, y, fichaActual, estaOcupado, botonAsociado);
    }

    @Override
    public void CalcularPuntaje() {
        if (estaOcupado) {
            fichaActual.valor = fichaActual.valor * 2;
        }
    }
}
