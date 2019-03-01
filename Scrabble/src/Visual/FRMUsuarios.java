/** Scrabble Games
 * AUTORS: 	Juan David Tique Triana 	             -	20181020046
 *	Johnatan GuillermoRuiz Bautista     -	20181020034
 *	Jos� Luis Quintero Ca�izalez           - 	20181020061
 * */
package Visual;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import Logica.Jugador;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;

/**
 *
 * @author estudiantes
 */
public class FRMUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FRMUsuarios
     */
    // <editor-fold defaultstate="collapsed" desc="Variables globales">
    Timer t;
    static Jugador j1 = new Jugador();  // se crearon jugadores a los que no puedo acceder desde el tablero.
    static Jugador j2 = new Jugador();  // esa es la razon del static declarado
    int tamaño = 0;
    boolean iniciarJuego = false;
    // </editor-fold>  

    public FRMUsuarios() {
        initComponents();
        super.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPrimerJugador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(943, 567));
        setPreferredSize(new java.awt.Dimension(943, 567));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrimerJugador.setFont(new java.awt.Font("Dotum", 0, 1)); // NOI18N
        lblPrimerJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimerJugador.setText("asas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimerJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimerJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 132, 837, 330));

        jLabel1.setFont(new java.awt.Font("Dotum", 0, 13)); // NOI18N
        jLabel1.setText("Jugador 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 81, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dotum", 0, 13)); // NOI18N
        jLabel2.setText("Jugador 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 81, -1, -1));

        txtJugador1.setFont(new java.awt.Font("Dotum", 0, 14)); // NOI18N
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJugador1KeyReleased(evt);
            }
        });
        getContentPane().add(txtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 101, 310, -1));

        txtJugador2.setFont(new java.awt.Font("Dotum", 0, 14)); // NOI18N
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJugador2KeyReleased(evt);
            }
        });
        getContentPane().add(txtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 101, 310, -1));

        btnJugar.setContentAreaFilled(false);
        btnJugar.setOpaque(true);
        btnJugar.setBackground(new java.awt.Color(39, 170, 240));
        btnJugar.setFont(new java.awt.Font("Dotum", 1, 20)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("<html>Seleccionar<br>jugador</html>");
        btnJugar.setActionCommand("Seleccionar \nJugador");
        btnJugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 138, 186), 2));
        btnJugar.setEnabled(false);
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJugarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJugarMousePressed(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 470, 160, 60));

        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setOpaque(true);
        btnLimpiar.setBackground(new java.awt.Color(39, 170, 240));
        btnLimpiar.setFont(new java.awt.Font("Dotum", 1, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("<html>Limpiar<br></html>");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 138, 186), 2));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 120, 60));

        jLabel4.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUEVA PARTIDA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 940, 70));

        btnAtras.setContentAreaFilled(false);
        btnAtras.setOpaque(true);
        btnAtras.setBackground(new java.awt.Color(39, 170, 240));
        btnAtras.setFont(new java.awt.Font("Dotum", 1, 20)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 138, 186), 2));
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAtrasMousePressed(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 119, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Funciones">
    // Define el ICO del JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("recursos/icon_Scrabble1.png"));

        return retValue;
    }

    // Eventos visuales de botones
    public void mouseEntrante(JButton boton) {
        boton.setBackground(new java.awt.Color(61, 179, 229));
    }

    public void mouseSaliente(JButton boton) {
        //boton.setBackground(new java.awt.Color(39,170,240));
        boton.setBackground(new java.awt.Color(39, 170, 240));
    }

    public void mousePulsado(JButton boton) {
        boton.setBackground(new java.awt.Color(30, 156, 209));
    }
    // </editor-fold>        

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtJugador1.setText("");
        txtJugador2.setText("");

        Font auxFont = lblPrimerJugador.getFont();
        lblPrimerJugador.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 1));

        iniciarJuego = false;
        btnJugar.setEnabled(false);
        btnJugar.setText("<html>Seleccionar<br>jugador</html>");

        txtJugador1.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if (iniciarJuego) {
            // Cerrar venta FRM Usuarios
            this.dispose();

            // Abrir venta FRM Menu
            FRMTablero tablero = new FRMTablero();
            tablero.setVisible(true);
        } else {
            btnLimpiar.setEnabled(false);
            // Selección aleatoria del jugador
            int numero = (int) (Math.random() * 2) + 1;
            if (numero == 1) {
                lblPrimerJugador.setText(txtJugador1.getText());
                j1 = new Jugador(txtJugador1.getText(), 0);
            } else {
                lblPrimerJugador.setText(txtJugador2.getText());
                j1 = new Jugador(txtJugador2.getText(), 0);
            }

            t = new Timer(1, (ActionEvent e) -> {
                if (tamaño < 100) {
                    // Recojo la fuente que se esta utilizando actualmente.
                    Font auxFont = lblPrimerJugador.getFont();
                    //Aplico la fuente actual, y al final se define el tamaño del texto
                    lblPrimerJugador.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), tamaño));

                    tamaño = tamaño + 4;
                } else if (tamaño >= 100 && tamaño < 800) {
                    tamaño++;
                    t.stop();
                }
            });
            t.start();
            btnJugar.setText("Jugar");
            iniciarJuego = true;
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtJugador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyReleased
        if ("".equals(txtJugador1.getText()) || "".equals(txtJugador2.getText())) {
            btnJugar.setEnabled(false);
        } else {
            btnJugar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJugador1KeyReleased

    private void txtJugador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyReleased
        if ("".equals(txtJugador1.getText()) || "".equals(txtJugador2.getText())) {
            btnJugar.setEnabled(false);
        } else {
            btnJugar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJugador2KeyReleased

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered
        mouseEntrante(btnAtras);
    }//GEN-LAST:event_btnAtrasMouseEntered

    private void btnAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseExited
        mouseSaliente(btnAtras);
    }//GEN-LAST:event_btnAtrasMouseExited

    private void btnAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMousePressed
        mousePulsado(btnAtras);
    }//GEN-LAST:event_btnAtrasMousePressed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        FRMenu menu = new FRMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        if (j1 == null) {
            // Cerrar venta FRM Usuarios
            this.dispose();

            // Abrir venta FRM Menu
            FRMenu menu = new FRMenu();
            menu.setVisible(true);
        }
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        if (btnLimpiar.isEnabled()) {
            mouseEntrante(btnLimpiar);
        }
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        if (btnLimpiar.isEnabled()) {
            mouseSaliente(btnLimpiar);
        }
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        if (btnLimpiar.isEnabled()) {
            mousePulsado(btnLimpiar);
        }
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void btnJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseEntered
        if (btnJugar.isEnabled()) {
            mouseEntrante(btnJugar);
        }
    }//GEN-LAST:event_btnJugarMouseEntered

    private void btnJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseExited
        if (btnJugar.isEnabled()) {
            mouseSaliente(btnJugar);
        }
    }//GEN-LAST:event_btnJugarMouseExited

    private void btnJugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMousePressed
        if (btnJugar.isEnabled()) {
            mousePulsado(btnJugar);
        }
    }//GEN-LAST:event_btnJugarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrimerJugador;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
