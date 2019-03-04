/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Logica;

import java.util.ArrayList;

/**
 * Clase que representa a un jugador
 *
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 * @see Logica.Ficha
 * @see Logica.Palabra
 * @see Logica.Bolsa
 */
public class Jugador extends Persona {

    //Atributos de clase
    private int puntaje = 0;
    //fichas que tiene el jugador actualmente
    private ArrayList<Ficha> fichasDis = new ArrayList<>();
    //historial de jugadas
    private ArrayList<Palabra> jugadas = new ArrayList<>();

    /**
     * Constructor parametrizado
     *
     * @param nombre Nombre del jugador
     * @param puntaje Puntaje que lleva el jugador
     */
    public Jugador(String nombre, int puntaje) {
        super(nombre);
        this.puntaje = puntaje;
        fichasDis = new ArrayList<>(7);
        jugadas = new ArrayList<>();
    }

    public ArrayList<Ficha> getFichasDis() {
        return fichasDis;
    }

    public void setFichasDis(ArrayList<Ficha> fichasDis) {
        this.fichasDis = fichasDis;
    }

    public ArrayList<Palabra> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Palabra> jugadas) {
        this.jugadas = jugadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje += puntaje;
    }

    /**
     * metodo agregar jugada
     *
     * @param palabra Palabra formada en durante la jugada
     */
    public void agregarJugada(Palabra palabra) {
        jugadas.add(palabra);
    }

    /**
     * metodo agregar una ficha disponible para el jugador
     *
     * @param ficha
     */
    public void agregarFic(Ficha ficha) {
        fichasDis.add(ficha);
    }

    /**
     * metodo agregar fichas faltantes desde la bolsa
     *
     * @param bolsa Bolsa con las fichas disponibles en el juego
     * @see #agregarFic(Logica.Ficha)
     * @see Logica.Bolsa
     */
    public void agregarFal(Bolsa bolsa) {
        int fichasAct = fichasDis.size();
        for (int i = 0; i < 7 - fichasAct; i++) {
            agregarFic(bolsa.retirarFic());
        }
    }

    /**
     * metodo eliminar ficha especifica
     *
     * @param indice
     * @return Objeto Ficha eliminado
     */
    public Ficha eliminarFicha(int indice) {
        if (!fichasDis.isEmpty()) {
            return fichasDis.remove(indice);
        } else {
            System.out.println("No hay Fichas");
            return null;
        }
    }

    /**
     * metodo cambiar fichas
     *
     * @param bolsa
     * @see Logica.Bolsa
     * @see #eliminarFicha(int)
     */
    public void cambiarFic(Bolsa bolsa) {
        for (int i = 0; i < 7; i++) {
            bolsa.agregarFic(eliminarFicha(fichasDis.size() - 1));
        }
        agregarFal(bolsa);
    }

    @Override
    public String toString() {
        return "\nJugador:\n\t" + nombre + "\n\t" + puntaje + "\n\t" + fichasDis + "\n\t" + jugadas;
    }

}
