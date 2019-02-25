/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Visual;

import Logica.CTriLetra;
import Logica.CTriPalabra;
import Logica.Casilla;
import Logica.Ficha;
import Logica.CDoLetra;
import Logica.CDoPalabra;

/**
 *
 * @author estudiantes
 */
public class FRMTablero extends javax.swing.JFrame {

    /**
     * Creates new form FRMTablero
     */
    public FRMTablero() {
        initComponents();
        super.setLocationRelativeTo(null);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Variables globales"> 
    Casilla[] cNormal;
    CTriPalabra[] cTripleP;
    CTriLetra[] cTripleL;
    CDoPalabra[] cDobleP;
    CDoLetra[] cDobleL;
    Ficha[] fichas;
    // </editor-fold>      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnA11 = new javax.swing.JButton();
        btnA12 = new javax.swing.JButton();
        btnA13 = new javax.swing.JButton();
        btnA14 = new javax.swing.JButton();
        btnA15 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnB6 = new javax.swing.JButton();
        btnB7 = new javax.swing.JButton();
        btnB8 = new javax.swing.JButton();
        btnB9 = new javax.swing.JButton();
        btnB10 = new javax.swing.JButton();
        btnB11 = new javax.swing.JButton();
        btnB12 = new javax.swing.JButton();
        btnB13 = new javax.swing.JButton();
        btnB14 = new javax.swing.JButton();
        btnB15 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnD5 = new javax.swing.JButton();
        btnD6 = new javax.swing.JButton();
        btnD7 = new javax.swing.JButton();
        btnD8 = new javax.swing.JButton();
        btnD9 = new javax.swing.JButton();
        btnD10 = new javax.swing.JButton();
        btnD11 = new javax.swing.JButton();
        btnD12 = new javax.swing.JButton();
        btnD13 = new javax.swing.JButton();
        btnD14 = new javax.swing.JButton();
        btnD15 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE3 = new javax.swing.JButton();
        btnE4 = new javax.swing.JButton();
        btnE5 = new javax.swing.JButton();
        btnE6 = new javax.swing.JButton();
        btnE7 = new javax.swing.JButton();
        btnE8 = new javax.swing.JButton();
        btnE9 = new javax.swing.JButton();
        btnE10 = new javax.swing.JButton();
        btnE11 = new javax.swing.JButton();
        btnE12 = new javax.swing.JButton();
        btnE13 = new javax.swing.JButton();
        btnE14 = new javax.swing.JButton();
        btnE15 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnF2 = new javax.swing.JButton();
        btnF3 = new javax.swing.JButton();
        btnF4 = new javax.swing.JButton();
        btnF5 = new javax.swing.JButton();
        btnF6 = new javax.swing.JButton();
        btnF7 = new javax.swing.JButton();
        btnF8 = new javax.swing.JButton();
        btnF9 = new javax.swing.JButton();
        btnF10 = new javax.swing.JButton();
        btnF11 = new javax.swing.JButton();
        btnF12 = new javax.swing.JButton();
        btnF13 = new javax.swing.JButton();
        btnF14 = new javax.swing.JButton();
        btnF15 = new javax.swing.JButton();
        btnG1 = new javax.swing.JButton();
        btnG2 = new javax.swing.JButton();
        btnG3 = new javax.swing.JButton();
        btnG4 = new javax.swing.JButton();
        btnG5 = new javax.swing.JButton();
        btnG6 = new javax.swing.JButton();
        btnG7 = new javax.swing.JButton();
        btnG8 = new javax.swing.JButton();
        btnG9 = new javax.swing.JButton();
        btnG10 = new javax.swing.JButton();
        btnG11 = new javax.swing.JButton();
        btnG12 = new javax.swing.JButton();
        btnG13 = new javax.swing.JButton();
        btnG14 = new javax.swing.JButton();
        btnG15 = new javax.swing.JButton();
        btnH1 = new javax.swing.JButton();
        btnH2 = new javax.swing.JButton();
        btnH3 = new javax.swing.JButton();
        btnH4 = new javax.swing.JButton();
        btnH5 = new javax.swing.JButton();
        btnH6 = new javax.swing.JButton();
        btnH7 = new javax.swing.JButton();
        btnH8 = new javax.swing.JButton();
        btnH9 = new javax.swing.JButton();
        btnH10 = new javax.swing.JButton();
        btnH11 = new javax.swing.JButton();
        btnH12 = new javax.swing.JButton();
        btnH13 = new javax.swing.JButton();
        btnH14 = new javax.swing.JButton();
        btnH15 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnI2 = new javax.swing.JButton();
        btnI3 = new javax.swing.JButton();
        btnI4 = new javax.swing.JButton();
        btnI5 = new javax.swing.JButton();
        btnI6 = new javax.swing.JButton();
        btnI7 = new javax.swing.JButton();
        btnI8 = new javax.swing.JButton();
        btnI9 = new javax.swing.JButton();
        btnI10 = new javax.swing.JButton();
        btnI11 = new javax.swing.JButton();
        btnI12 = new javax.swing.JButton();
        btnI13 = new javax.swing.JButton();
        btnI14 = new javax.swing.JButton();
        btnI15 = new javax.swing.JButton();
        btnJ1 = new javax.swing.JButton();
        btnJ2 = new javax.swing.JButton();
        btnJ3 = new javax.swing.JButton();
        btnJ4 = new javax.swing.JButton();
        btnJ5 = new javax.swing.JButton();
        btnJ6 = new javax.swing.JButton();
        btnJ7 = new javax.swing.JButton();
        btnJ8 = new javax.swing.JButton();
        btnJ9 = new javax.swing.JButton();
        btnJ10 = new javax.swing.JButton();
        btnJ11 = new javax.swing.JButton();
        btnJ12 = new javax.swing.JButton();
        btnJ13 = new javax.swing.JButton();
        btnJ14 = new javax.swing.JButton();
        btnJ15 = new javax.swing.JButton();
        btnK1 = new javax.swing.JButton();
        btnK2 = new javax.swing.JButton();
        btnK3 = new javax.swing.JButton();
        btnK4 = new javax.swing.JButton();
        btnK5 = new javax.swing.JButton();
        btnK6 = new javax.swing.JButton();
        btnK7 = new javax.swing.JButton();
        btnK8 = new javax.swing.JButton();
        btnK9 = new javax.swing.JButton();
        btnK10 = new javax.swing.JButton();
        btnK11 = new javax.swing.JButton();
        btnK12 = new javax.swing.JButton();
        btnK13 = new javax.swing.JButton();
        btnK14 = new javax.swing.JButton();
        btnK15 = new javax.swing.JButton();
        btnL1 = new javax.swing.JButton();
        btnL2 = new javax.swing.JButton();
        btnL3 = new javax.swing.JButton();
        btnL4 = new javax.swing.JButton();
        btnL5 = new javax.swing.JButton();
        btnL6 = new javax.swing.JButton();
        btnL7 = new javax.swing.JButton();
        btnL8 = new javax.swing.JButton();
        btnL9 = new javax.swing.JButton();
        btnL10 = new javax.swing.JButton();
        btnL11 = new javax.swing.JButton();
        btnL12 = new javax.swing.JButton();
        btnL13 = new javax.swing.JButton();
        btnL14 = new javax.swing.JButton();
        btnL15 = new javax.swing.JButton();
        btnM1 = new javax.swing.JButton();
        btnM2 = new javax.swing.JButton();
        btnM3 = new javax.swing.JButton();
        btnM4 = new javax.swing.JButton();
        btnM5 = new javax.swing.JButton();
        btnM6 = new javax.swing.JButton();
        btnM7 = new javax.swing.JButton();
        btnM8 = new javax.swing.JButton();
        btnM9 = new javax.swing.JButton();
        btnM10 = new javax.swing.JButton();
        btnM11 = new javax.swing.JButton();
        btnM12 = new javax.swing.JButton();
        btnM13 = new javax.swing.JButton();
        btnM14 = new javax.swing.JButton();
        btnM15 = new javax.swing.JButton();
        btnN1 = new javax.swing.JButton();
        btnN2 = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnN5 = new javax.swing.JButton();
        btnN6 = new javax.swing.JButton();
        btnN7 = new javax.swing.JButton();
        btnN8 = new javax.swing.JButton();
        btnN9 = new javax.swing.JButton();
        btnN10 = new javax.swing.JButton();
        btnN11 = new javax.swing.JButton();
        btnN12 = new javax.swing.JButton();
        btnN13 = new javax.swing.JButton();
        btnN14 = new javax.swing.JButton();
        btnN15 = new javax.swing.JButton();
        btnO1 = new javax.swing.JButton();
        btnO2 = new javax.swing.JButton();
        btnO3 = new javax.swing.JButton();
        btnO4 = new javax.swing.JButton();
        btnO5 = new javax.swing.JButton();
        btnO6 = new javax.swing.JButton();
        btnO7 = new javax.swing.JButton();
        btnO8 = new javax.swing.JButton();
        btnO9 = new javax.swing.JButton();
        btnO10 = new javax.swing.JButton();
        btnO11 = new javax.swing.JButton();
        btnO12 = new javax.swing.JButton();
        btnO13 = new javax.swing.JButton();
        btnO14 = new javax.swing.JButton();
        btnO15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1044, 774));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(750, 750));
        jPanel2.setMinimumSize(new java.awt.Dimension(750, 750));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 750));
        jPanel2.setLayout(new java.awt.GridLayout(15, 15));

        btnA1.setContentAreaFilled(false);
        btnA1.setOpaque(true);
        btnA1.setBackground(new java.awt.Color(254, 69, 69));
        btnA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA1.setEnabled(false);
        jPanel2.add(btnA1);

        btnA2.setContentAreaFilled(false);
        btnA2.setOpaque(true);
        btnA2.setBackground(new java.awt.Color(255, 255, 255));
        btnA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA2.setEnabled(false);
        jPanel2.add(btnA2);

        btnA3.setContentAreaFilled(false);
        btnA3.setOpaque(true);
        btnA3.setBackground(new java.awt.Color(255, 255, 255));
        btnA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA3.setEnabled(false);
        jPanel2.add(btnA3);

        btnA4.setContentAreaFilled(false);
        btnA4.setOpaque(true);
        btnA4.setBackground(new java.awt.Color(218, 219, 252));
        btnA4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA4.setEnabled(false);
        jPanel2.add(btnA4);

        btnA5.setContentAreaFilled(false);
        btnA5.setOpaque(true);
        btnA5.setBackground(new java.awt.Color(255, 255, 255));
        btnA5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA5.setEnabled(false);
        jPanel2.add(btnA5);

        btnA6.setContentAreaFilled(false);
        btnA6.setOpaque(true);
        btnA6.setBackground(new java.awt.Color(255, 255, 255));
        btnA6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA6.setEnabled(false);
        jPanel2.add(btnA6);

        btnA7.setContentAreaFilled(false);
        btnA7.setOpaque(true);
        btnA7.setBackground(new java.awt.Color(255, 255, 255));
        btnA7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA7.setEnabled(false);
        jPanel2.add(btnA7);

        btnA8.setContentAreaFilled(false);
        btnA8.setOpaque(true);
        btnA8.setBackground(new java.awt.Color(254, 69, 69));
        btnA8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA8.setEnabled(false);
        jPanel2.add(btnA8);

        btnA9.setContentAreaFilled(false);
        btnA9.setOpaque(true);
        btnA9.setBackground(new java.awt.Color(255, 255, 255));
        btnA9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA9.setEnabled(false);
        jPanel2.add(btnA9);

        btnA10.setContentAreaFilled(false);
        btnA10.setOpaque(true);
        btnA10.setBackground(new java.awt.Color(255, 255, 255));
        btnA10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA10.setEnabled(false);
        jPanel2.add(btnA10);

        btnA11.setContentAreaFilled(false);
        btnA11.setOpaque(true);
        btnA11.setBackground(new java.awt.Color(255, 255, 255));
        btnA11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA11.setEnabled(false);
        jPanel2.add(btnA11);

        btnA12.setContentAreaFilled(false);
        btnA12.setOpaque(true);
        btnA12.setBackground(new java.awt.Color(218, 219, 252));
        btnA12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA12.setEnabled(false);
        jPanel2.add(btnA12);

        btnA13.setContentAreaFilled(false);
        btnA13.setOpaque(true);
        btnA13.setBackground(new java.awt.Color(255, 255, 255));
        btnA13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA13.setEnabled(false);
        jPanel2.add(btnA13);

        btnA14.setContentAreaFilled(false);
        btnA14.setOpaque(true);
        btnA14.setBackground(new java.awt.Color(255, 255, 255));
        btnA14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA14.setEnabled(false);
        jPanel2.add(btnA14);

        btnA15.setContentAreaFilled(false);
        btnA15.setOpaque(true);
        btnA15.setBackground(new java.awt.Color(254, 69, 69));
        btnA15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnA15.setEnabled(false);
        jPanel2.add(btnA15);

        btnB1.setBackground(new java.awt.Color(255, 255, 255));
        btnB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB1.setEnabled(false);
        jPanel2.add(btnB1);

        btnB2.setBackground(new java.awt.Color(254, 179, 179));
        btnB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB2.setEnabled(false);
        jPanel2.add(btnB2);

        btnB3.setBackground(new java.awt.Color(255, 255, 255));
        btnB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB3.setEnabled(false);
        jPanel2.add(btnB3);

        btnB4.setBackground(new java.awt.Color(255, 255, 255));
        btnB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB4.setEnabled(false);
        jPanel2.add(btnB4);

        btnB5.setBackground(new java.awt.Color(255, 255, 255));
        btnB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB5.setEnabled(false);
        jPanel2.add(btnB5);

        btnB6.setBackground(new java.awt.Color(99, 99, 254));
        btnB6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB6.setEnabled(false);
        jPanel2.add(btnB6);

        btnB7.setBackground(new java.awt.Color(255, 255, 255));
        btnB7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB7.setEnabled(false);
        jPanel2.add(btnB7);

        btnB8.setBackground(new java.awt.Color(255, 255, 255));
        btnB8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB8.setEnabled(false);
        jPanel2.add(btnB8);

        btnB9.setBackground(new java.awt.Color(255, 255, 255));
        btnB9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB9.setEnabled(false);
        jPanel2.add(btnB9);

        btnB10.setBackground(new java.awt.Color(99, 99, 254));
        btnB10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB10.setEnabled(false);
        jPanel2.add(btnB10);

        btnB11.setBackground(new java.awt.Color(255, 255, 255));
        btnB11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB11.setEnabled(false);
        jPanel2.add(btnB11);

        btnB12.setBackground(new java.awt.Color(255, 255, 255));
        btnB12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB12.setEnabled(false);
        jPanel2.add(btnB12);

        btnB13.setBackground(new java.awt.Color(255, 255, 255));
        btnB13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB13.setEnabled(false);
        jPanel2.add(btnB13);

        btnB14.setBackground(new java.awt.Color(254, 179, 179));
        btnB14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB14.setEnabled(false);
        jPanel2.add(btnB14);

        btnB15.setBackground(new java.awt.Color(255, 255, 255));
        btnB15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnB15.setEnabled(false);
        jPanel2.add(btnB15);

        btnC1.setBackground(new java.awt.Color(255, 255, 255));
        btnC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC1.setEnabled(false);
        jPanel2.add(btnC1);

        btnC2.setBackground(new java.awt.Color(255, 255, 255));
        btnC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC2.setEnabled(false);
        jPanel2.add(btnC2);

        btnC3.setBackground(new java.awt.Color(254, 179, 179));
        btnC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC3.setEnabled(false);
        jPanel2.add(btnC3);

        btnC4.setBackground(new java.awt.Color(255, 255, 255));
        btnC4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC4.setEnabled(false);
        jPanel2.add(btnC4);

        btnC5.setBackground(new java.awt.Color(255, 255, 255));
        btnC5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC5.setEnabled(false);
        jPanel2.add(btnC5);

        btnC6.setBackground(new java.awt.Color(255, 255, 255));
        btnC6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC6.setEnabled(false);
        jPanel2.add(btnC6);

        btnC7.setBackground(new java.awt.Color(218, 219, 252));
        btnC7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC7.setEnabled(false);
        jPanel2.add(btnC7);

        btnC8.setBackground(new java.awt.Color(255, 255, 255));
        btnC8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC8.setEnabled(false);
        jPanel2.add(btnC8);

        btnC9.setBackground(new java.awt.Color(218, 219, 252));
        btnC9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC9.setEnabled(false);
        jPanel2.add(btnC9);

        btnC10.setBackground(new java.awt.Color(255, 255, 255));
        btnC10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC10.setEnabled(false);
        jPanel2.add(btnC10);

        btnC11.setBackground(new java.awt.Color(255, 255, 255));
        btnC11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC11.setEnabled(false);
        jPanel2.add(btnC11);

        btnC12.setBackground(new java.awt.Color(255, 255, 255));
        btnC12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC12.setEnabled(false);
        jPanel2.add(btnC12);

        btnC13.setBackground(new java.awt.Color(254, 179, 179));
        btnC13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC13.setEnabled(false);
        jPanel2.add(btnC13);

        btnC14.setBackground(new java.awt.Color(255, 255, 255));
        btnC14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC14.setEnabled(false);
        jPanel2.add(btnC14);

        btnC15.setBackground(new java.awt.Color(255, 255, 255));
        btnC15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnC15.setEnabled(false);
        jPanel2.add(btnC15);

        btnD1.setBackground(new java.awt.Color(218, 219, 252));
        btnD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD1.setEnabled(false);
        jPanel2.add(btnD1);

        btnD2.setBackground(new java.awt.Color(255, 255, 255));
        btnD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD2.setEnabled(false);
        jPanel2.add(btnD2);

        btnD3.setBackground(new java.awt.Color(255, 255, 255));
        btnD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD3.setEnabled(false);
        jPanel2.add(btnD3);

        btnD4.setBackground(new java.awt.Color(254, 179, 179));
        btnD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD4.setEnabled(false);
        jPanel2.add(btnD4);

        btnD5.setBackground(new java.awt.Color(255, 255, 255));
        btnD5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD5.setEnabled(false);
        jPanel2.add(btnD5);

        btnD6.setBackground(new java.awt.Color(255, 255, 255));
        btnD6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD6.setEnabled(false);
        jPanel2.add(btnD6);

        btnD7.setBackground(new java.awt.Color(255, 255, 255));
        btnD7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD7.setEnabled(false);
        jPanel2.add(btnD7);

        btnD8.setBackground(new java.awt.Color(218, 219, 252));
        btnD8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD8.setEnabled(false);
        jPanel2.add(btnD8);

        btnD9.setBackground(new java.awt.Color(255, 255, 255));
        btnD9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD9.setEnabled(false);
        jPanel2.add(btnD9);

        btnD10.setBackground(new java.awt.Color(255, 255, 255));
        btnD10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD10.setEnabled(false);
        jPanel2.add(btnD10);

        btnD11.setBackground(new java.awt.Color(255, 255, 255));
        btnD11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD11.setEnabled(false);
        jPanel2.add(btnD11);

        btnD12.setBackground(new java.awt.Color(254, 179, 179));
        btnD12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD12.setEnabled(false);
        jPanel2.add(btnD12);

        btnD13.setBackground(new java.awt.Color(255, 255, 255));
        btnD13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD13.setEnabled(false);
        jPanel2.add(btnD13);

        btnD14.setBackground(new java.awt.Color(255, 255, 255));
        btnD14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD14.setEnabled(false);
        jPanel2.add(btnD14);

        btnD15.setBackground(new java.awt.Color(218, 219, 252));
        btnD15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnD15.setEnabled(false);
        jPanel2.add(btnD15);

        btnE1.setBackground(new java.awt.Color(255, 255, 255));
        btnE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE1.setEnabled(false);
        jPanel2.add(btnE1);

        btnE2.setBackground(new java.awt.Color(255, 255, 255));
        btnE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE2.setEnabled(false);
        jPanel2.add(btnE2);

        btnE3.setBackground(new java.awt.Color(255, 255, 255));
        btnE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE3.setEnabled(false);
        jPanel2.add(btnE3);

        btnE4.setBackground(new java.awt.Color(255, 255, 255));
        btnE4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE4.setEnabled(false);
        jPanel2.add(btnE4);

        btnE5.setBackground(new java.awt.Color(254, 179, 179));
        btnE5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE5.setEnabled(false);
        jPanel2.add(btnE5);

        btnE6.setBackground(new java.awt.Color(255, 255, 255));
        btnE6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE6.setEnabled(false);
        jPanel2.add(btnE6);

        btnE7.setBackground(new java.awt.Color(255, 255, 255));
        btnE7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE7.setEnabled(false);
        jPanel2.add(btnE7);

        btnE8.setBackground(new java.awt.Color(255, 255, 255));
        btnE8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE8.setEnabled(false);
        jPanel2.add(btnE8);

        btnE9.setBackground(new java.awt.Color(255, 255, 255));
        btnE9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE9.setEnabled(false);
        jPanel2.add(btnE9);

        btnE10.setBackground(new java.awt.Color(255, 255, 255));
        btnE10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE10.setEnabled(false);
        jPanel2.add(btnE10);

        btnE11.setBackground(new java.awt.Color(254, 179, 179));
        btnE11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE11.setEnabled(false);
        jPanel2.add(btnE11);

        btnE12.setBackground(new java.awt.Color(255, 255, 255));
        btnE12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE12.setEnabled(false);
        jPanel2.add(btnE12);

        btnE13.setBackground(new java.awt.Color(255, 255, 255));
        btnE13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE13.setEnabled(false);
        jPanel2.add(btnE13);

        btnE14.setBackground(new java.awt.Color(255, 255, 255));
        btnE14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE14.setEnabled(false);
        jPanel2.add(btnE14);

        btnE15.setBackground(new java.awt.Color(255, 255, 255));
        btnE15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnE15.setEnabled(false);
        jPanel2.add(btnE15);

        btnF1.setBackground(new java.awt.Color(255, 255, 255));
        btnF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF1.setEnabled(false);
        jPanel2.add(btnF1);

        btnF2.setBackground(new java.awt.Color(99, 99, 254));
        btnF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF2.setEnabled(false);
        jPanel2.add(btnF2);

        btnF3.setBackground(new java.awt.Color(255, 255, 255));
        btnF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF3.setEnabled(false);
        jPanel2.add(btnF3);

        btnF4.setBackground(new java.awt.Color(255, 255, 255));
        btnF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF4.setEnabled(false);
        jPanel2.add(btnF4);

        btnF5.setBackground(new java.awt.Color(255, 255, 255));
        btnF5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF5.setEnabled(false);
        jPanel2.add(btnF5);

        btnF6.setBackground(new java.awt.Color(99, 99, 254));
        btnF6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF6.setEnabled(false);
        jPanel2.add(btnF6);

        btnF7.setBackground(new java.awt.Color(255, 255, 255));
        btnF7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF7.setEnabled(false);
        jPanel2.add(btnF7);

        btnF8.setBackground(new java.awt.Color(255, 255, 255));
        btnF8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF8.setEnabled(false);
        jPanel2.add(btnF8);

        btnF9.setBackground(new java.awt.Color(255, 255, 255));
        btnF9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF9.setEnabled(false);
        jPanel2.add(btnF9);

        btnF10.setBackground(new java.awt.Color(99, 99, 254));
        btnF10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF10.setEnabled(false);
        jPanel2.add(btnF10);

        btnF11.setBackground(new java.awt.Color(255, 255, 255));
        btnF11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF11.setEnabled(false);
        jPanel2.add(btnF11);

        btnF12.setBackground(new java.awt.Color(255, 255, 255));
        btnF12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF12.setEnabled(false);
        jPanel2.add(btnF12);

        btnF13.setBackground(new java.awt.Color(255, 255, 255));
        btnF13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF13.setEnabled(false);
        jPanel2.add(btnF13);

        btnF14.setBackground(new java.awt.Color(99, 99, 254));
        btnF14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF14.setEnabled(false);
        jPanel2.add(btnF14);

        btnF15.setBackground(new java.awt.Color(255, 255, 255));
        btnF15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnF15.setEnabled(false);
        jPanel2.add(btnF15);

        btnG1.setBackground(new java.awt.Color(255, 255, 255));
        btnG1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG1.setEnabled(false);
        jPanel2.add(btnG1);

        btnG2.setBackground(new java.awt.Color(255, 255, 255));
        btnG2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG2.setEnabled(false);
        jPanel2.add(btnG2);

        btnG3.setBackground(new java.awt.Color(218, 219, 252));
        btnG3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG3.setEnabled(false);
        jPanel2.add(btnG3);

        btnG4.setBackground(new java.awt.Color(255, 255, 255));
        btnG4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG4.setEnabled(false);
        jPanel2.add(btnG4);

        btnG5.setBackground(new java.awt.Color(255, 255, 255));
        btnG5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG5.setEnabled(false);
        jPanel2.add(btnG5);

        btnG6.setBackground(new java.awt.Color(255, 255, 255));
        btnG6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG6.setEnabled(false);
        jPanel2.add(btnG6);

        btnG7.setBackground(new java.awt.Color(218, 219, 252));
        btnG7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG7.setEnabled(false);
        jPanel2.add(btnG7);

        btnG8.setBackground(new java.awt.Color(255, 255, 255));
        btnG8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG8.setEnabled(false);
        jPanel2.add(btnG8);

        btnG9.setBackground(new java.awt.Color(218, 219, 252));
        btnG9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG9.setEnabled(false);
        jPanel2.add(btnG9);

        btnG10.setBackground(new java.awt.Color(255, 255, 255));
        btnG10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG10.setEnabled(false);
        jPanel2.add(btnG10);

        btnG11.setBackground(new java.awt.Color(255, 255, 255));
        btnG11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG11.setEnabled(false);
        jPanel2.add(btnG11);

        btnG12.setBackground(new java.awt.Color(255, 255, 255));
        btnG12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG12.setEnabled(false);
        jPanel2.add(btnG12);

        btnG13.setBackground(new java.awt.Color(218, 219, 252));
        btnG13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG13.setEnabled(false);
        jPanel2.add(btnG13);

        btnG14.setBackground(new java.awt.Color(255, 255, 255));
        btnG14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG14.setEnabled(false);
        jPanel2.add(btnG14);

        btnG15.setBackground(new java.awt.Color(255, 255, 255));
        btnG15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnG15.setEnabled(false);
        jPanel2.add(btnG15);

        btnH1.setBackground(new java.awt.Color(254, 69, 69));
        btnH1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH1.setEnabled(false);
        jPanel2.add(btnH1);

        btnH2.setBackground(new java.awt.Color(255, 255, 255));
        btnH2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH2.setEnabled(false);
        jPanel2.add(btnH2);

        btnH3.setBackground(new java.awt.Color(255, 255, 255));
        btnH3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH3.setEnabled(false);
        jPanel2.add(btnH3);

        btnH4.setBackground(new java.awt.Color(218, 219, 252));
        btnH4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH4.setEnabled(false);
        jPanel2.add(btnH4);

        btnH5.setBackground(new java.awt.Color(255, 255, 255));
        btnH5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH5.setEnabled(false);
        jPanel2.add(btnH5);

        btnH6.setBackground(new java.awt.Color(255, 255, 255));
        btnH6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH6.setEnabled(false);
        jPanel2.add(btnH6);

        btnH7.setBackground(new java.awt.Color(255, 255, 255));
        btnH7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH7.setEnabled(false);
        jPanel2.add(btnH7);

        btnH8.setContentAreaFilled(false);
        btnH8.setOpaque(true);
        btnH8.setBackground(new java.awt.Color(254, 179, 179));
        btnH8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel2.add(btnH8);

        btnH9.setBackground(new java.awt.Color(255, 255, 255));
        btnH9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH9.setEnabled(false);
        jPanel2.add(btnH9);

        btnH10.setBackground(new java.awt.Color(255, 255, 255));
        btnH10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH10.setEnabled(false);
        jPanel2.add(btnH10);

        btnH11.setBackground(new java.awt.Color(255, 255, 255));
        btnH11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH11.setEnabled(false);
        jPanel2.add(btnH11);

        btnH12.setBackground(new java.awt.Color(218, 219, 252));
        btnH12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH12.setEnabled(false);
        jPanel2.add(btnH12);

        btnH13.setBackground(new java.awt.Color(255, 255, 255));
        btnH13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH13.setEnabled(false);
        jPanel2.add(btnH13);

        btnH14.setBackground(new java.awt.Color(255, 255, 255));
        btnH14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH14.setEnabled(false);
        jPanel2.add(btnH14);

        btnH15.setBackground(new java.awt.Color(254, 69, 69));
        btnH15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnH15.setEnabled(false);
        jPanel2.add(btnH15);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn1.setEnabled(false);
        jPanel2.add(btn1);

        btnI2.setBackground(new java.awt.Color(255, 255, 255));
        btnI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI2.setEnabled(false);
        jPanel2.add(btnI2);

        btnI3.setBackground(new java.awt.Color(218, 219, 252));
        btnI3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI3.setEnabled(false);
        jPanel2.add(btnI3);

        btnI4.setBackground(new java.awt.Color(255, 255, 255));
        btnI4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI4.setEnabled(false);
        jPanel2.add(btnI4);

        btnI5.setBackground(new java.awt.Color(255, 255, 255));
        btnI5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI5.setEnabled(false);
        jPanel2.add(btnI5);

        btnI6.setBackground(new java.awt.Color(255, 255, 255));
        btnI6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI6.setEnabled(false);
        jPanel2.add(btnI6);

        btnI7.setBackground(new java.awt.Color(218, 219, 252));
        btnI7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI7.setEnabled(false);
        jPanel2.add(btnI7);

        btnI8.setBackground(new java.awt.Color(255, 255, 255));
        btnI8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI8.setEnabled(false);
        jPanel2.add(btnI8);

        btnI9.setBackground(new java.awt.Color(218, 219, 252));
        btnI9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI9.setEnabled(false);
        jPanel2.add(btnI9);

        btnI10.setBackground(new java.awt.Color(255, 255, 255));
        btnI10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI10.setEnabled(false);
        jPanel2.add(btnI10);

        btnI11.setBackground(new java.awt.Color(255, 255, 255));
        btnI11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI11.setEnabled(false);
        jPanel2.add(btnI11);

        btnI12.setBackground(new java.awt.Color(255, 255, 255));
        btnI12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI12.setEnabled(false);
        jPanel2.add(btnI12);

        btnI13.setBackground(new java.awt.Color(218, 219, 252));
        btnI13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI13.setEnabled(false);
        jPanel2.add(btnI13);

        btnI14.setBackground(new java.awt.Color(255, 255, 255));
        btnI14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI14.setEnabled(false);
        jPanel2.add(btnI14);

        btnI15.setBackground(new java.awt.Color(255, 255, 255));
        btnI15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnI15.setEnabled(false);
        jPanel2.add(btnI15);

        btnJ1.setBackground(new java.awt.Color(255, 255, 255));
        btnJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ1.setEnabled(false);
        jPanel2.add(btnJ1);

        btnJ2.setBackground(new java.awt.Color(99, 99, 254));
        btnJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ2.setEnabled(false);
        jPanel2.add(btnJ2);

        btnJ3.setBackground(new java.awt.Color(255, 255, 255));
        btnJ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ3.setEnabled(false);
        jPanel2.add(btnJ3);

        btnJ4.setBackground(new java.awt.Color(255, 255, 255));
        btnJ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ4.setEnabled(false);
        jPanel2.add(btnJ4);

        btnJ5.setBackground(new java.awt.Color(255, 255, 255));
        btnJ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ5.setEnabled(false);
        jPanel2.add(btnJ5);

        btnJ6.setBackground(new java.awt.Color(99, 99, 254));
        btnJ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ6.setEnabled(false);
        jPanel2.add(btnJ6);

        btnJ7.setBackground(new java.awt.Color(255, 255, 255));
        btnJ7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ7.setEnabled(false);
        jPanel2.add(btnJ7);

        btnJ8.setBackground(new java.awt.Color(255, 255, 255));
        btnJ8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ8.setEnabled(false);
        jPanel2.add(btnJ8);

        btnJ9.setBackground(new java.awt.Color(255, 255, 255));
        btnJ9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ9.setEnabled(false);
        jPanel2.add(btnJ9);

        btnJ10.setBackground(new java.awt.Color(99, 99, 254));
        btnJ10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ10.setEnabled(false);
        jPanel2.add(btnJ10);

        btnJ11.setBackground(new java.awt.Color(255, 255, 255));
        btnJ11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ11.setEnabled(false);
        jPanel2.add(btnJ11);

        btnJ12.setBackground(new java.awt.Color(255, 255, 255));
        btnJ12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ12.setEnabled(false);
        jPanel2.add(btnJ12);

        btnJ13.setBackground(new java.awt.Color(255, 255, 255));
        btnJ13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ13.setEnabled(false);
        jPanel2.add(btnJ13);

        btnJ14.setBackground(new java.awt.Color(99, 99, 254));
        btnJ14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ14.setEnabled(false);
        jPanel2.add(btnJ14);

        btnJ15.setBackground(new java.awt.Color(255, 255, 255));
        btnJ15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJ15.setEnabled(false);
        jPanel2.add(btnJ15);

        btnK1.setBackground(new java.awt.Color(255, 255, 255));
        btnK1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK1.setEnabled(false);
        jPanel2.add(btnK1);

        btnK2.setBackground(new java.awt.Color(255, 255, 255));
        btnK2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK2.setEnabled(false);
        jPanel2.add(btnK2);

        btnK3.setBackground(new java.awt.Color(255, 255, 255));
        btnK3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK3.setEnabled(false);
        jPanel2.add(btnK3);

        btnK4.setBackground(new java.awt.Color(255, 255, 255));
        btnK4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK4.setEnabled(false);
        jPanel2.add(btnK4);

        btnK5.setBackground(new java.awt.Color(254, 179, 179));
        btnK5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK5.setEnabled(false);
        jPanel2.add(btnK5);

        btnK6.setBackground(new java.awt.Color(255, 255, 255));
        btnK6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK6.setEnabled(false);
        jPanel2.add(btnK6);

        btnK7.setBackground(new java.awt.Color(255, 255, 255));
        btnK7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK7.setEnabled(false);
        jPanel2.add(btnK7);

        btnK8.setBackground(new java.awt.Color(255, 255, 255));
        btnK8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK8.setEnabled(false);
        jPanel2.add(btnK8);

        btnK9.setBackground(new java.awt.Color(255, 255, 255));
        btnK9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK9.setEnabled(false);
        jPanel2.add(btnK9);

        btnK10.setBackground(new java.awt.Color(255, 255, 255));
        btnK10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK10.setEnabled(false);
        jPanel2.add(btnK10);

        btnK11.setBackground(new java.awt.Color(254, 179, 179));
        btnK11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK11.setEnabled(false);
        jPanel2.add(btnK11);

        btnK12.setBackground(new java.awt.Color(255, 255, 255));
        btnK12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK12.setEnabled(false);
        jPanel2.add(btnK12);

        btnK13.setBackground(new java.awt.Color(255, 255, 255));
        btnK13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK13.setEnabled(false);
        jPanel2.add(btnK13);

        btnK14.setBackground(new java.awt.Color(255, 255, 255));
        btnK14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK14.setEnabled(false);
        jPanel2.add(btnK14);

        btnK15.setBackground(new java.awt.Color(255, 255, 255));
        btnK15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnK15.setEnabled(false);
        jPanel2.add(btnK15);

        btnL1.setBackground(new java.awt.Color(218, 219, 252));
        btnL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL1.setEnabled(false);
        jPanel2.add(btnL1);

        btnL2.setBackground(new java.awt.Color(255, 255, 255));
        btnL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL2.setEnabled(false);
        jPanel2.add(btnL2);

        btnL3.setBackground(new java.awt.Color(255, 255, 255));
        btnL3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL3.setEnabled(false);
        jPanel2.add(btnL3);

        btnL4.setBackground(new java.awt.Color(254, 179, 179));
        btnL4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL4.setEnabled(false);
        jPanel2.add(btnL4);

        btnL5.setBackground(new java.awt.Color(255, 255, 255));
        btnL5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL5.setEnabled(false);
        jPanel2.add(btnL5);

        btnL6.setBackground(new java.awt.Color(255, 255, 255));
        btnL6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL6.setEnabled(false);
        jPanel2.add(btnL6);

        btnL7.setBackground(new java.awt.Color(255, 255, 255));
        btnL7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL7.setEnabled(false);
        jPanel2.add(btnL7);

        btnL8.setBackground(new java.awt.Color(218, 219, 252));
        btnL8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL8.setEnabled(false);
        jPanel2.add(btnL8);

        btnL9.setBackground(new java.awt.Color(255, 255, 255));
        btnL9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL9.setEnabled(false);
        jPanel2.add(btnL9);

        btnL10.setBackground(new java.awt.Color(255, 255, 255));
        btnL10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL10.setEnabled(false);
        jPanel2.add(btnL10);

        btnL11.setBackground(new java.awt.Color(255, 255, 255));
        btnL11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL11.setEnabled(false);
        jPanel2.add(btnL11);

        btnL12.setBackground(new java.awt.Color(254, 179, 179));
        btnL12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL12.setEnabled(false);
        jPanel2.add(btnL12);

        btnL13.setBackground(new java.awt.Color(255, 255, 255));
        btnL13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL13.setEnabled(false);
        jPanel2.add(btnL13);

        btnL14.setBackground(new java.awt.Color(255, 255, 255));
        btnL14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL14.setEnabled(false);
        jPanel2.add(btnL14);

        btnL15.setBackground(new java.awt.Color(218, 219, 252));
        btnL15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnL15.setEnabled(false);
        jPanel2.add(btnL15);

        btnM1.setBackground(new java.awt.Color(255, 255, 255));
        btnM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM1.setEnabled(false);
        jPanel2.add(btnM1);

        btnM2.setBackground(new java.awt.Color(255, 255, 255));
        btnM2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM2.setEnabled(false);
        jPanel2.add(btnM2);

        btnM3.setBackground(new java.awt.Color(254, 179, 179));
        btnM3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM3.setEnabled(false);
        jPanel2.add(btnM3);

        btnM4.setBackground(new java.awt.Color(255, 255, 255));
        btnM4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM4.setEnabled(false);
        jPanel2.add(btnM4);

        btnM5.setBackground(new java.awt.Color(255, 255, 255));
        btnM5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM5.setEnabled(false);
        jPanel2.add(btnM5);

        btnM6.setBackground(new java.awt.Color(255, 255, 255));
        btnM6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM6.setEnabled(false);
        jPanel2.add(btnM6);

        btnM7.setBackground(new java.awt.Color(218, 219, 252));
        btnM7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM7.setEnabled(false);
        jPanel2.add(btnM7);

        btnM8.setBackground(new java.awt.Color(255, 255, 255));
        btnM8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM8.setEnabled(false);
        jPanel2.add(btnM8);

        btnM9.setBackground(new java.awt.Color(218, 219, 252));
        btnM9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM9.setEnabled(false);
        jPanel2.add(btnM9);

        btnM10.setBackground(new java.awt.Color(255, 255, 255));
        btnM10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM10.setEnabled(false);
        jPanel2.add(btnM10);

        btnM11.setBackground(new java.awt.Color(255, 255, 255));
        btnM11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM11.setEnabled(false);
        jPanel2.add(btnM11);

        btnM12.setBackground(new java.awt.Color(255, 255, 255));
        btnM12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM12.setEnabled(false);
        jPanel2.add(btnM12);

        btnM13.setBackground(new java.awt.Color(254, 179, 179));
        btnM13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM13.setEnabled(false);
        jPanel2.add(btnM13);

        btnM14.setBackground(new java.awt.Color(255, 255, 255));
        btnM14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM14.setEnabled(false);
        jPanel2.add(btnM14);

        btnM15.setBackground(new java.awt.Color(255, 255, 255));
        btnM15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnM15.setEnabled(false);
        jPanel2.add(btnM15);

        btnN1.setBackground(new java.awt.Color(255, 255, 255));
        btnN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN1.setEnabled(false);
        jPanel2.add(btnN1);

        btnN2.setBackground(new java.awt.Color(254, 179, 179));
        btnN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN2.setEnabled(false);
        jPanel2.add(btnN2);

        btnN3.setBackground(new java.awt.Color(255, 255, 255));
        btnN3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN3.setEnabled(false);
        jPanel2.add(btnN3);

        btnN4.setBackground(new java.awt.Color(255, 255, 255));
        btnN4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN4.setEnabled(false);
        jPanel2.add(btnN4);

        btnN5.setBackground(new java.awt.Color(255, 255, 255));
        btnN5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN5.setEnabled(false);
        jPanel2.add(btnN5);

        btnN6.setBackground(new java.awt.Color(99, 99, 254));
        btnN6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN6.setEnabled(false);
        jPanel2.add(btnN6);

        btnN7.setBackground(new java.awt.Color(255, 255, 255));
        btnN7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN7.setEnabled(false);
        jPanel2.add(btnN7);

        btnN8.setBackground(new java.awt.Color(255, 255, 255));
        btnN8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN8.setEnabled(false);
        jPanel2.add(btnN8);

        btnN9.setBackground(new java.awt.Color(99, 99, 254));
        btnN9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN9.setEnabled(false);
        jPanel2.add(btnN9);

        btnN10.setBackground(new java.awt.Color(255, 255, 255));
        btnN10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN10.setEnabled(false);
        jPanel2.add(btnN10);

        btnN11.setBackground(new java.awt.Color(255, 255, 255));
        btnN11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN11.setEnabled(false);
        jPanel2.add(btnN11);

        btnN12.setBackground(new java.awt.Color(255, 255, 255));
        btnN12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN12.setEnabled(false);
        jPanel2.add(btnN12);

        btnN13.setBackground(new java.awt.Color(255, 255, 255));
        btnN13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN13.setEnabled(false);
        jPanel2.add(btnN13);

        btnN14.setBackground(new java.awt.Color(254, 179, 179));
        btnN14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN14.setEnabled(false);
        jPanel2.add(btnN14);

        btnN15.setBackground(new java.awt.Color(255, 255, 255));
        btnN15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnN15.setEnabled(false);
        jPanel2.add(btnN15);

        btnO1.setBackground(new java.awt.Color(254, 69, 69));
        btnO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO1.setEnabled(false);
        jPanel2.add(btnO1);

        btnO2.setBackground(new java.awt.Color(255, 255, 255));
        btnO2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO2.setEnabled(false);
        jPanel2.add(btnO2);

        btnO3.setBackground(new java.awt.Color(255, 255, 255));
        btnO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO3.setEnabled(false);
        jPanel2.add(btnO3);

        btnO4.setBackground(new java.awt.Color(218, 219, 252));
        btnO4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO4.setEnabled(false);
        jPanel2.add(btnO4);

        btnO5.setBackground(new java.awt.Color(255, 255, 255));
        btnO5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO5.setEnabled(false);
        jPanel2.add(btnO5);

        btnO6.setBackground(new java.awt.Color(255, 255, 255));
        btnO6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO6.setEnabled(false);
        jPanel2.add(btnO6);

        btnO7.setBackground(new java.awt.Color(255, 255, 255));
        btnO7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO7.setEnabled(false);
        jPanel2.add(btnO7);

        btnO8.setBackground(new java.awt.Color(254, 69, 69));
        btnO8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO8.setEnabled(false);
        jPanel2.add(btnO8);

        btnO9.setBackground(new java.awt.Color(255, 255, 255));
        btnO9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO9.setEnabled(false);
        jPanel2.add(btnO9);

        btnO10.setBackground(new java.awt.Color(255, 255, 255));
        btnO10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO10.setEnabled(false);
        jPanel2.add(btnO10);

        btnO11.setBackground(new java.awt.Color(255, 255, 255));
        btnO11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO11.setEnabled(false);
        jPanel2.add(btnO11);

        btnO12.setBackground(new java.awt.Color(218, 219, 252));
        btnO12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO12.setEnabled(false);
        jPanel2.add(btnO12);

        btnO13.setBackground(new java.awt.Color(255, 255, 255));
        btnO13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO13.setEnabled(false);
        jPanel2.add(btnO13);

        btnO14.setBackground(new java.awt.Color(255, 255, 255));
        btnO14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO14.setEnabled(false);
        jPanel2.add(btnO14);

        btnO15.setBackground(new java.awt.Color(254, 69, 69));
        btnO15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnO15.setEnabled(false);
        jPanel2.add(btnO15);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Jugadores");

        jLabel2.setText("[J2]");

        jLabel3.setText("[J1]");

        jLabel4.setText("Turno");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fichas"));
        jPanel3.setLayout(new java.awt.GridLayout(4, 2));

        jButton1.setText("jButton1");
        jPanel3.add(jButton1);

        jButton2.setText("jButton2");
        jPanel3.add(jButton2);

        jButton3.setText("jButton3");
        jPanel3.add(jButton3);

        jButton4.setText("jButton4");
        jPanel3.add(jButton4);

        jButton5.setText("jButton5");
        jPanel3.add(jButton5);

        jButton6.setText("jButton6");
        jPanel3.add(jButton6);

        jButton7.setText("jButton7");
        jPanel3.add(jButton7);

        jButton10.setText("Nuevas Fichas");
        jPanel3.add(jButton10);

        jButton8.setText("Pasar turno");
        jButton8.setPreferredSize(new java.awt.Dimension(119, 60));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Aceptar");
        jButton9.setMinimumSize(new java.awt.Dimension(55, 25));
        jButton9.setPreferredSize(new java.awt.Dimension(119, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Funciones"> 
    // </editor-fold>       
    
    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FRMTablero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA11;
    private javax.swing.JButton btnA12;
    private javax.swing.JButton btnA13;
    private javax.swing.JButton btnA14;
    private javax.swing.JButton btnA15;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB10;
    private javax.swing.JButton btnB11;
    private javax.swing.JButton btnB12;
    private javax.swing.JButton btnB13;
    private javax.swing.JButton btnB14;
    private javax.swing.JButton btnB15;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnB5;
    private javax.swing.JButton btnB6;
    private javax.swing.JButton btnB7;
    private javax.swing.JButton btnB8;
    private javax.swing.JButton btnB9;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD10;
    private javax.swing.JButton btnD11;
    private javax.swing.JButton btnD12;
    private javax.swing.JButton btnD13;
    private javax.swing.JButton btnD14;
    private javax.swing.JButton btnD15;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnD3;
    private javax.swing.JButton btnD4;
    private javax.swing.JButton btnD5;
    private javax.swing.JButton btnD6;
    private javax.swing.JButton btnD7;
    private javax.swing.JButton btnD8;
    private javax.swing.JButton btnD9;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnE10;
    private javax.swing.JButton btnE11;
    private javax.swing.JButton btnE12;
    private javax.swing.JButton btnE13;
    private javax.swing.JButton btnE14;
    private javax.swing.JButton btnE15;
    private javax.swing.JButton btnE2;
    private javax.swing.JButton btnE3;
    private javax.swing.JButton btnE4;
    private javax.swing.JButton btnE5;
    private javax.swing.JButton btnE6;
    private javax.swing.JButton btnE7;
    private javax.swing.JButton btnE8;
    private javax.swing.JButton btnE9;
    private javax.swing.JButton btnF1;
    private javax.swing.JButton btnF10;
    private javax.swing.JButton btnF11;
    private javax.swing.JButton btnF12;
    private javax.swing.JButton btnF13;
    private javax.swing.JButton btnF14;
    private javax.swing.JButton btnF15;
    private javax.swing.JButton btnF2;
    private javax.swing.JButton btnF3;
    private javax.swing.JButton btnF4;
    private javax.swing.JButton btnF5;
    private javax.swing.JButton btnF6;
    private javax.swing.JButton btnF7;
    private javax.swing.JButton btnF8;
    private javax.swing.JButton btnF9;
    private javax.swing.JButton btnG1;
    private javax.swing.JButton btnG10;
    private javax.swing.JButton btnG11;
    private javax.swing.JButton btnG12;
    private javax.swing.JButton btnG13;
    private javax.swing.JButton btnG14;
    private javax.swing.JButton btnG15;
    private javax.swing.JButton btnG2;
    private javax.swing.JButton btnG3;
    private javax.swing.JButton btnG4;
    private javax.swing.JButton btnG5;
    private javax.swing.JButton btnG6;
    private javax.swing.JButton btnG7;
    private javax.swing.JButton btnG8;
    private javax.swing.JButton btnG9;
    private javax.swing.JButton btnH1;
    private javax.swing.JButton btnH10;
    private javax.swing.JButton btnH11;
    private javax.swing.JButton btnH12;
    private javax.swing.JButton btnH13;
    private javax.swing.JButton btnH14;
    private javax.swing.JButton btnH15;
    private javax.swing.JButton btnH2;
    private javax.swing.JButton btnH3;
    private javax.swing.JButton btnH4;
    private javax.swing.JButton btnH5;
    private javax.swing.JButton btnH6;
    private javax.swing.JButton btnH7;
    private javax.swing.JButton btnH8;
    private javax.swing.JButton btnH9;
    private javax.swing.JButton btnI10;
    private javax.swing.JButton btnI11;
    private javax.swing.JButton btnI12;
    private javax.swing.JButton btnI13;
    private javax.swing.JButton btnI14;
    private javax.swing.JButton btnI15;
    private javax.swing.JButton btnI2;
    private javax.swing.JButton btnI3;
    private javax.swing.JButton btnI4;
    private javax.swing.JButton btnI5;
    private javax.swing.JButton btnI6;
    private javax.swing.JButton btnI7;
    private javax.swing.JButton btnI8;
    private javax.swing.JButton btnI9;
    private javax.swing.JButton btnJ1;
    private javax.swing.JButton btnJ10;
    private javax.swing.JButton btnJ11;
    private javax.swing.JButton btnJ12;
    private javax.swing.JButton btnJ13;
    private javax.swing.JButton btnJ14;
    private javax.swing.JButton btnJ15;
    private javax.swing.JButton btnJ2;
    private javax.swing.JButton btnJ3;
    private javax.swing.JButton btnJ4;
    private javax.swing.JButton btnJ5;
    private javax.swing.JButton btnJ6;
    private javax.swing.JButton btnJ7;
    private javax.swing.JButton btnJ8;
    private javax.swing.JButton btnJ9;
    private javax.swing.JButton btnK1;
    private javax.swing.JButton btnK10;
    private javax.swing.JButton btnK11;
    private javax.swing.JButton btnK12;
    private javax.swing.JButton btnK13;
    private javax.swing.JButton btnK14;
    private javax.swing.JButton btnK15;
    private javax.swing.JButton btnK2;
    private javax.swing.JButton btnK3;
    private javax.swing.JButton btnK4;
    private javax.swing.JButton btnK5;
    private javax.swing.JButton btnK6;
    private javax.swing.JButton btnK7;
    private javax.swing.JButton btnK8;
    private javax.swing.JButton btnK9;
    private javax.swing.JButton btnL1;
    private javax.swing.JButton btnL10;
    private javax.swing.JButton btnL11;
    private javax.swing.JButton btnL12;
    private javax.swing.JButton btnL13;
    private javax.swing.JButton btnL14;
    private javax.swing.JButton btnL15;
    private javax.swing.JButton btnL2;
    private javax.swing.JButton btnL3;
    private javax.swing.JButton btnL4;
    private javax.swing.JButton btnL5;
    private javax.swing.JButton btnL6;
    private javax.swing.JButton btnL7;
    private javax.swing.JButton btnL8;
    private javax.swing.JButton btnL9;
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnM10;
    private javax.swing.JButton btnM11;
    private javax.swing.JButton btnM12;
    private javax.swing.JButton btnM13;
    private javax.swing.JButton btnM14;
    private javax.swing.JButton btnM15;
    private javax.swing.JButton btnM2;
    private javax.swing.JButton btnM3;
    private javax.swing.JButton btnM4;
    private javax.swing.JButton btnM5;
    private javax.swing.JButton btnM6;
    private javax.swing.JButton btnM7;
    private javax.swing.JButton btnM8;
    private javax.swing.JButton btnM9;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN10;
    private javax.swing.JButton btnN11;
    private javax.swing.JButton btnN12;
    private javax.swing.JButton btnN13;
    private javax.swing.JButton btnN14;
    private javax.swing.JButton btnN15;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnN5;
    private javax.swing.JButton btnN6;
    private javax.swing.JButton btnN7;
    private javax.swing.JButton btnN8;
    private javax.swing.JButton btnN9;
    private javax.swing.JButton btnO1;
    private javax.swing.JButton btnO10;
    private javax.swing.JButton btnO11;
    private javax.swing.JButton btnO12;
    private javax.swing.JButton btnO13;
    private javax.swing.JButton btnO14;
    private javax.swing.JButton btnO15;
    private javax.swing.JButton btnO2;
    private javax.swing.JButton btnO3;
    private javax.swing.JButton btnO4;
    private javax.swing.JButton btnO5;
    private javax.swing.JButton btnO6;
    private javax.swing.JButton btnO7;
    private javax.swing.JButton btnO8;
    private javax.swing.JButton btnO9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
