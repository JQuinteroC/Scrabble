/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * Clase donde se guardaran todas las fichas disponles durante el juego
 * 
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 */
public class Bolsa {

    //contenedor de fichas
    private ArrayList<Ficha> bolsa;

    /**
     *  Constructor e inicialización de las fichas
     */
    public Bolsa() {
        bolsa = new ArrayList<>();
        inicializarBol();
    }

    /**
     * metodo agregar ficha nueva
     * @param letra 
     * @param valor puntaje que tiene la letra
     * @param imagenA ruta de acceso a la imagen pequeña
     * @param imagenB ruta de acceso a la imagen grande
     */
    public void agregarFic(String letra, int valor, ImageIcon imagenA, ImageIcon imagenB) {
        bolsa.add(new Ficha(letra, valor, imagenA, imagenB));
    }

    /**
     * metodo agregar ficha existente en una posicion aleatoria
     * @param ficha Objeto de tipo ficha
     * @see Logica.Ficha
     */
    public void agregarFic(Ficha ficha) {
        int indice = (new Random()).nextInt(bolsa.size());
        bolsa.add(indice, ficha);
    }

    /**
     *metodo revolver fichas
     */
    public void revolverFic() {
        Collections.shuffle(bolsa);
    }

    /**
     * retirar ficha final
     * @return El objeto ficha que salio de la bolsa
     */
    public Ficha retirarFic() {
        if (!bolsa.isEmpty()) {
            return bolsa.remove(bolsa.size() - 1);
        } else {
            System.out.println("No hay Fichas");
            return null;
        }
    }

    /**
     * metodo inicializar bolsa con total de fichas
     */
    private void inicializarBol() {

        for (int i = 0; i < 12; i++) {
            //letra A
            agregarFic("A", 1, new ImageIcon(getClass().getResource("/recursos/A.png")), new ImageIcon(getClass().getResource("/recursos/AGran.png")));
            //letra E
            agregarFic("E", 1, new ImageIcon(getClass().getResource("/recursos/E.png")), new ImageIcon(getClass().getResource("/recursos/EGran.png")));
        }

        for (int i = 0; i < 9; i++) {
            //letra O
            agregarFic("O", 1, new ImageIcon(getClass().getResource("/recursos/O.png")), new ImageIcon(getClass().getResource("/recursos/OGran.png")));
        }

        for (int i = 0; i < 6; i++) {
            //Letra I
            agregarFic("I", 1, new ImageIcon(getClass().getResource("/recursos/I.png")), new ImageIcon(getClass().getResource("/recursos/IGran.png")));
            //Letra S
            agregarFic("S", 1, new ImageIcon(getClass().getResource("/recursos/S.png")), new ImageIcon(getClass().getResource("/recursos/SGran.png")));
        }

        for (int i = 0; i < 5; i++) {
            //Letra N
            agregarFic("N", 1, new ImageIcon(getClass().getResource("/recursos/N.png")), new ImageIcon(getClass().getResource("/recursos/NGran.png")));
            //Letra R
            agregarFic("R", 1, new ImageIcon(getClass().getResource("/recursos/R.png")), new ImageIcon(getClass().getResource("/recursos/RGran.png")));
            //Letra U
            agregarFic("U", 1, new ImageIcon(getClass().getResource("/recursos/U.png")), new ImageIcon(getClass().getResource("/recursos/UGran.png")));
            //Letra D
            agregarFic("D", 2, new ImageIcon(getClass().getResource("/recursos/D.png")), new ImageIcon(getClass().getResource("/recursos/DGran.png")));
        }

        for (int i = 0; i < 4; i++) {
            //Letra L
            agregarFic("L", 1, new ImageIcon(getClass().getResource("/recursos/L.png")), new ImageIcon(getClass().getResource("/recursos/LGran.png")));
            //Letra T
            agregarFic("T", 1, new ImageIcon(getClass().getResource("/recursos/T.png")), new ImageIcon(getClass().getResource("/recursos/TGran.png")));
            //Letra C
            agregarFic("C", 3, new ImageIcon(getClass().getResource("/recursos/C.png")), new ImageIcon(getClass().getResource("/recursos/CGran.png")));
        }

        for (int i = 0; i < 2; i++) {
            //Letra G
            agregarFic("G", 2, new ImageIcon(getClass().getResource("/recursos/G.png")), new ImageIcon(getClass().getResource("/recursos/GGran.png")));
            //Letra B
            agregarFic("B", 3, new ImageIcon(getClass().getResource("/recursos/B.png")), new ImageIcon(getClass().getResource("/recursos/BGran.png")));
            //Letra M
            agregarFic("M", 3, new ImageIcon(getClass().getResource("/recursos/M.png")), new ImageIcon(getClass().getResource("/recursos/MGran.png")));
            //Letra P
            agregarFic("P", 3, new ImageIcon(getClass().getResource("/recursos/P.png")), new ImageIcon(getClass().getResource("/recursos/PGran.png")));
            //Letra H
            agregarFic("H", 4, new ImageIcon(getClass().getResource("/recursos/H.png")), new ImageIcon(getClass().getResource("/recursos/HGran.png")));
            //Letra BLANCO
            agregarFic("BLANCO", 0, new ImageIcon(getClass().getResource("/recursos/BLANCO.png")), new ImageIcon(getClass().getResource("/recursos/BLANCOGran.png")));
        }

        //Letra F
        agregarFic("F", 4, new ImageIcon(getClass().getResource("/recursos/F.png")), new ImageIcon(getClass().getResource("/recursos/FGran.png")));
        //Letra V
        agregarFic("V", 4, new ImageIcon(getClass().getResource("/recursos/V.png")), new ImageIcon(getClass().getResource("/recursos/VGran.png")));
        //Letra Y
        agregarFic("Y", 4, new ImageIcon(getClass().getResource("/recursos/Y.png")), new ImageIcon(getClass().getResource("/recursos/YGran.png")));
        //Letra CH
        agregarFic("CH", 5, new ImageIcon(getClass().getResource("/recursos/CH.png")), new ImageIcon(getClass().getResource("/recursos/CHGran.png")));
        //Letra Q
        agregarFic("Q", 5, new ImageIcon(getClass().getResource("/recursos/Q.png")), new ImageIcon(getClass().getResource("/recursos/QGran.png")));
        //Letra J
        agregarFic("J", 8, new ImageIcon(getClass().getResource("/recursos/J.png")), new ImageIcon(getClass().getResource("/recursos/JGran.png")));
        //Letra LL
        agregarFic("LL", 8, new ImageIcon(getClass().getResource("/recursos/LL.png")), new ImageIcon(getClass().getResource("/recursos/LLGran.png")));
        //Letra Ñ
        agregarFic("Ñ", 8, new ImageIcon(getClass().getResource("/recursos/Ñ.png")), new ImageIcon(getClass().getResource("/recursos/ÑGran.png")));
        //Letra RR
        agregarFic("RR", 8, new ImageIcon(getClass().getResource("/recursos/RR.png")), new ImageIcon(getClass().getResource("/recursos/RRGran.png")));
        //Letra X
        agregarFic("X", 8, new ImageIcon(getClass().getResource("/recursos/X.png")), new ImageIcon(getClass().getResource("/recursos/XGran.png")));
        //Letra Z
        agregarFic("Z", 10, new ImageIcon(getClass().getResource("/recursos/Z.png")), new ImageIcon(getClass().getResource("/recursos/ZGran.png")));

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
