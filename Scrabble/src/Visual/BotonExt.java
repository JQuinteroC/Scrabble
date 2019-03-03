/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Visual;

import javax.swing.JButton;

/**
 *
 * @author Holligan
 */
public class BotonExt extends JButton {

    private int posX;
    private int posY;
    private boolean presionado;

    public BotonExt(int posX, int posY, boolean presionado) {
        super();
        this.posX = posX;
        this.posY = posY;
        this.presionado = presionado;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }
}
