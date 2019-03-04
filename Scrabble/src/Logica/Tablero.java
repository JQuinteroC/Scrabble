/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Logica;

import java.util.Arrays;

/**
 * Clase donde esta la información del tablero
 *
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 * @see Logica.Casilla
 */
public class Tablero {

    private final Casilla tablero[][];

    /**
     * Constructor parametrizado del tablero
     * @param dimension 
     */
    public Tablero(int dimension) {
        tablero = new Casilla[dimension][dimension];
        llenarTab();
        agregarPre();
    }

    /**
     * Genera el tablero con cada casilla
     * @see Logica.Casilla
     */
    private void llenarTab() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
    
    public void setCasilla(int i, int j, Ficha ficha){
        tablero[i][j].setFicha(ficha);
        tablero[i][j].setOcupado(true);
    }

    public Casilla getCasilla(int i, int j){
        return tablero[i][j];
    }
    /**
     *metodo agregar premios de las casillas especiales
     */
    private void agregarPre() {
        //casillas triple palabra
        tablero[0][0].setTriplePal(true);
        tablero[0][7].setTriplePal(true);
        tablero[0][14].setTriplePal(true);
        tablero[7][0].setTriplePal(true);
        tablero[14][0].setTriplePal(true);
        tablero[14][7].setTriplePal(true);
        tablero[14][14].setTriplePal(true);
        tablero[7][14].setTriplePal(true);
        //casillas doble palabra
        tablero[1][1].setDoblePal(true);
        tablero[2][2].setDoblePal(true);
        tablero[3][3].setDoblePal(true);
        tablero[4][4].setDoblePal(true);
        tablero[1][13].setDoblePal(true);
        tablero[2][12].setDoblePal(true);
        tablero[3][11].setDoblePal(true);
        tablero[4][10].setDoblePal(true);
        tablero[13][1].setDoblePal(true);
        tablero[12][2].setDoblePal(true);
        tablero[11][3].setDoblePal(true);
        tablero[10][4].setDoblePal(true);
        tablero[7][7].setDoblePal(true);
        tablero[13][13].setDoblePal(true);
        tablero[12][12].setDoblePal(true);
        tablero[11][11].setDoblePal(true);
        tablero[10][10].setDoblePal(true);
        //casilla de salida
        tablero[7][7].setSalida(true);
        //casillas triple puntaje
        tablero[1][5].setTriplePun(true);
        tablero[1][9].setTriplePun(true);
        tablero[5][1].setTriplePun(true);
        tablero[5][5].setTriplePun(true);
        tablero[5][13].setTriplePun(true);
        tablero[5][9].setTriplePun(true);
        tablero[9][1].setTriplePun(true);
        tablero[9][5].setTriplePun(true);
        tablero[9][9].setTriplePun(true);
        tablero[9][13].setTriplePun(true);
        tablero[13][5].setTriplePun(true);
        tablero[13][9].setTriplePun(true);
        //casillas doble puntaje
        tablero[0][3].setDoblePun(true);
        tablero[0][11].setDoblePun(true);
        tablero[14][3].setDoblePun(true);
        tablero[14][11].setDoblePun(true);
        tablero[2][6].setDoblePun(true);
        tablero[2][8].setDoblePun(true);
        tablero[12][6].setDoblePun(true);
        tablero[12][8].setDoblePun(true);
        tablero[3][0].setDoblePun(true);
        tablero[3][7].setDoblePun(true);
        tablero[3][14].setDoblePun(true);
        tablero[11][0].setDoblePun(true);
        tablero[11][7].setDoblePun(true);
        tablero[11][14].setDoblePun(true);
        tablero[6][2].setDoblePun(true);
        tablero[6][6].setDoblePun(true);
        tablero[6][8].setDoblePun(true);
        tablero[6][12].setDoblePun(true);
        tablero[8][2].setDoblePun(true);
        tablero[8][6].setDoblePun(true);
        tablero[8][8].setDoblePun(true);
        tablero[8][12].setDoblePun(true);
        tablero[7][3].setDoblePun(true);
        tablero[7][11].setDoblePun(true);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        for (Casilla[] tablero1 : tablero) {
            sb.append(Arrays.toString(tablero1));
            sb.append("\n");
        }
        return sb.toString();
    }

}
