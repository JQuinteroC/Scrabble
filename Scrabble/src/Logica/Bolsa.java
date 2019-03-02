/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Bolsa {

    //contenedor de fichas
    private ArrayList<Ficha> bolsa;

    //constructor e inicializacion de las fichas
    public Bolsa() {
        bolsa = new ArrayList<>();
        inicializarBol();
    }

    //metodo agregar ficha nueva
    public void agregarFic(String letra, int valor) {
        bolsa.add(new Ficha(letra, valor));
    }

    //metodo agregar ficha existente en  una posicion aleatoria
    public void agregarFic(Ficha ficha) {
        int indice = (new Random()).nextInt(bolsa.size());
        bolsa.add(indice, ficha);
    }

    //metodo revolver fichas
    public void revolverFic() {
        Collections.shuffle(bolsa);
    }

    //retirar ficha final
    public Ficha retirarFic() {
        if (!bolsa.isEmpty()) {
            return bolsa.remove(bolsa.size() - 1);
        } else {
            System.out.println("No hay Fichas");
            return null;
        }
    }

    //metodo inicializar bolsa con total de fichas
    private void inicializarBol() {

        for (int i = 0; i < 12; i++) {
            //letra A
            agregarFic("A", 1);
            //letra E
            agregarFic("E", 1);
        }

        for (int i = 0; i < 9; i++) {
            //letra O
            agregarFic("O", 1);
        }

        for (int i = 0; i < 6; i++) {
            //Letra I
            agregarFic("I", 1);
            //Letra S
            agregarFic("S", 1);
        }

        for (int i = 0; i < 5; i++) {
            //Letra N
            agregarFic("N", 1);
            //Letra R
            agregarFic("R", 1);
            //Letra U
            agregarFic("U", 1);
            //Letra D
            agregarFic("D", 2);
        }

        for (int i = 0; i < 4; i++) {
            //Letra L
            agregarFic("L", 1);
            //Letra T
            agregarFic("T", 1);
            //Letra C
            agregarFic("C", 3);
        }

        for (int i = 0; i < 2; i++) {
            //Letra G
            agregarFic("G", 2);
            //Letra B
            agregarFic("B", 3);
            //Letra M
            agregarFic("M", 3);
            //Letra P
            agregarFic("P", 3);
            //Letra H
            agregarFic("H", 4);
            //Letra BLANCO
            agregarFic("BLANCO", 0);
        }

        //Letra F
        agregarFic("F", 4);
        //Letra V
        agregarFic("V", 4);
        //Letra Y
        agregarFic("Y", 4);
        //Letra CH
        agregarFic("CH", 5);
        //Letra Q
        agregarFic("Q", 5);
        //Letra J
        agregarFic("J", 8);
        //Letra LL
        agregarFic("LL", 8);
        //Letra Ñ
        agregarFic("Ñ", 8);
        //Letra RR
        agregarFic("RR", 8);
        //Letra X
        agregarFic("X", 8);
        //Letra Z
        agregarFic("Z", 10);
    }

    public ArrayList<Ficha> getBolsa() {
        return bolsa;
    }

    public void setBolsa(ArrayList<Ficha> bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsa:\n" + bolsa;
    }

}
