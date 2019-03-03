/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Logica;

import Visual.FRMInicio;

/**
 *
 * @author Holligan
 */
public class ScrabbleIni {

    public static void main(String[] args) {
        Jugador jugadorUno = new Jugador("J1", 0);
        Jugador jugadorDos = new Jugador("J2", 0);
        Bolsa bolsa = new Bolsa();
        Tablero tab = new Tablero(15);

        FRMInicio interfaz = FRMInicio.getInstance();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        bolsa.revolverFic();
        System.out.println(bolsa);
        System.out.println(tab);
        interfaz.setJugadorDos(jugadorDos);
        interfaz.setJugadorUno(jugadorUno);
        interfaz.setTablero(tab);
        interfaz.setBolsa(bolsa);
        interfaz.setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            interfaz.setVisible(true);
        });

    }
}
