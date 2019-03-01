/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Logica;

/**
 *
 * @author Johnatan
 */
public class Tablero {
    
    private final Casilla tablero[][];

    public Tablero(int dimension) {
        tablero = new Casilla[dimension][dimension];
        this.llenarTab();
    }
    
    private void llenarTab(){
        for(int i = 0; i < tablero.length; i++)
            for(int j = 0; j < tablero.length; j++)
                tablero[i][j] = new Casilla(i, j);
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
    
    
}
