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

/**
 *
 * @author estudiantes
 */
public class FRMUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FRMUsuarios
     */
    Timer t;
    Jugador j1;
    Jugador j2;
    
    public FRMUsuarios() {
        initComponents();
        super.setLocationRelativeTo(null);
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
        lblAtras = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblContador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrimerJugador.setFont(new java.awt.Font("Dialog", 0, 1)); // NOI18N
        lblPrimerJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimerJugador.setText("asas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimerJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrimerJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Jugador 2");

        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJugador1KeyReleased(evt);
            }
        });

        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJugador2KeyReleased(evt);
            }
        });

        btnJugar.setText("Jugar");
        btnJugar.setEnabled(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblAtras.setText("Atras");
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAtrasMousePressed(evt);
            }
        });

        jLabel4.setText("NUEVA PARTIDA");

        lblContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContador.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnJugar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJugar)
                    .addComponent(btnLimpiar)
                    .addComponent(lblAtras)
                    .addComponent(lblContador))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Funciones">
    
    // Pausa la ejecución durante los milisegundos ingresado por parametro
    // </editor-fold>        

    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtJugador1.setText("");
        txtJugador2.setText("");
        
        Font auxFont = lblPrimerJugador.getFont();
        lblPrimerJugador.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 1));
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    int tamaño = 0; 
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        btnLimpiar.setEnabled(false);
        
        
        // Selección aleatoria del jugador
       int numero = (int) (Math.random() * 2) + 1;
       if(numero == 1){
           lblPrimerJugador.setText(txtJugador1.getText());
           j1 = new Jugador(txtJugador1.getText(), 0);
       } else{
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
                
                if (tamaño == 104) {
                    lblContador.setText("3");
                } else if (tamaño == 400) {
                    lblContador.setText("2");
                } else if (tamaño == 700) {
                    lblContador.setText("1");
                } else if (tamaño == 786) {
                    lblContador.setText("");
                }

            } else if (tamaño >= 800) {
                // Llamado a la venta FRM tablero
                FRMTablero tablero = new FRMTablero();
                tablero.setVisible(true);

                // Cerrar venta FRM Usuario
                this.dispose();
                t.stop();
            }
        });
        t.start();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void lblAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMousePressed
        if (j1 == null) {
            // Cerrar venta FRM Usuarios
            this.dispose();

            // Abrir venta FRM Menu
            FRMenu menu = new FRMenu();
            menu.setVisible(true);
        }

    }//GEN-LAST:event_lblAtrasMousePressed

    private void txtJugador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyReleased
        if("".equals(txtJugador1.getText()) || "".equals(txtJugador2.getText())){
            btnJugar.setEnabled(false);
        } else{
            btnJugar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJugador1KeyReleased

    private void txtJugador2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyReleased
         if("".equals(txtJugador1.getText()) || "".equals(txtJugador2.getText())){
            btnJugar.setEnabled(false);
        } else{
            btnJugar.setEnabled(true);
        }
    }//GEN-LAST:event_txtJugador2KeyReleased

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
            java.util.logging.Logger.getLogger(FRMUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FRMUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblPrimerJugador;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
