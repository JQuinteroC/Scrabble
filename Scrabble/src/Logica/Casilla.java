/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Logica;

/**
 * Clase que representa a una casilla del tablero
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 * @see Logica.Tablero
 */
public class Casilla {
    //tipo de casilla
    private boolean doblePal;
    private boolean doblePun;
    private boolean triplePal;
    private boolean triplePun;
    
    private boolean salida;
    private boolean ocupado;
    //ficha que esta en la casilla
    private Ficha ficha;

    /**
     * Constructor parametrizado de una casilla normal
     */
    public Casilla() {
        this.doblePal = false;
        this.doblePun = false;
        this.triplePal = false;
        this.triplePun = false;
        this.salida = false;
        this.ocupado = false;
    }

    /**
     * Constructor parametrizado de una casilla especial (doble palabra, doble letra, triple palabra, tripleletra)
     * @param doblePal indica si la casilla es doble palabra
     * @param doblePun indica si la casilla es doble letra
     * @param triplePal indica si la casilla es triple palabra
     * @param triplePun indica si la casilla es triple letra
     * @param salida -------------------------
     * @param ocupado  indica si la casilla esta ocupada
     */
    public Casilla(boolean doblePal, boolean doblePun, boolean triplePal, boolean triplePun, boolean salida, boolean ocupado) {
        this.doblePal = doblePal;
        this.doblePun = doblePun;
        this.triplePal = triplePal;
        this.triplePun = triplePun;
        this.salida = salida;
        this.ocupado = ocupado;
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

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    
    @Override
    public String toString() {
        String valor;
        if (isSalida()) {
            valor = "**";
        } else if (isDoblePun()) {
            valor = "2L";
        } else if (isDoblePal()) {
            valor = "2P";
        } else if (isTriplePal()) {
            valor = "3P";
        } else if (isTriplePun()) {
            valor = "3L";
        } else {
            valor = "--";
        }
        return "[" + valor + ']';
    }

}
