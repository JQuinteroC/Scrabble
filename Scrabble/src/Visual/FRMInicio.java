/** Scrabble Games
 * Autores: Juan David Tique Triana         - 20181020046
 *          Johnatan GuillermoRuiz Bautista - 20181020034
 *          Jose Luis Quintero Ca�izalez    - 20181020061
 * */
package Visual;

import Logica.Bolsa;
import Logica.Jugador;
import Logica.Tablero;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;

/**
 * Ventana de inicio
 *
 * @author <a href="https://github.com/Cuanse">Cuanse</a>
 * @author  <a href="https://github.com/jgruizba">Johnatan</a>
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 * @version 1.0
 * @see Visual.FRMenu
 * @see Logica.Jugador
 * @see Logica.Tablero
 * @see Logica.Bolsa
 */
public class FRMInicio extends javax.swing.JFrame {

    private static FRMInicio GUI;
    private Jugador jugadorUno;
    private Jugador jugadorDos;
    private Tablero tablero;
    private Bolsa bolsa;

    /**
     * Creates new form FRMInicio
     */
    private FRMInicio() {
        initComponents();
        super.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * Crea la ventana FRMInicio
     *
     * @param jugadorUno
     * @param jugadorDos
     * @param tablero
     * @param bolsa
     */
    public FRMInicio(Jugador jugadorUno, Jugador jugadorDos, Tablero tablero, Bolsa bolsa) {
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
        this.tablero = tablero;
        this.bolsa = bolsa;
        initComponents();
        super.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * Metodo para acceder al formulario FMRInicio desde otras clases
     *
     * @return formulario FRMInicio
     */
    public static FRMInicio getInstance() {
        if (GUI == null) {
            GUI = new FRMInicio();
        }
        return GUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(105, 197, 236));
        setForeground(new java.awt.Color(105, 197, 236));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        btnContinuar.setBackground(new java.awt.Color(39, 170, 240));
        btnContinuar.setFont(new java.awt.Font("Dotum", 1, 20)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 138, 186), 2));
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnContinuarMousePressed(evt);
            }
        });
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnSalir.setContentAreaFilled(false);
        btnSalir.setOpaque(true);
        btnSalir.setBackground(new java.awt.Color(39, 170, 240));
        btnSalir.setFont(new java.awt.Font("Dotum", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 138, 186), 2));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dotum", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCRABBLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Funciones">
    // Define el ICO del JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("recursos/icon_Scrabble.png"));

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

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        FRMenu menu = new FRMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    public Jugador getJugadorUno() {
        return jugadorUno;
    }

    public void setJugadorUno(Jugador jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public Jugador getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(Jugador jugadorDos) {
        this.jugadorDos = jugadorDos;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        mouseEntrante(btnSalir);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        mouseSaliente(btnSalir);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        mousePulsado(btnSalir);
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        mouseEntrante(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        mouseSaliente(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseExited

    private void btnContinuarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMousePressed
        mousePulsado(btnContinuar);
    }//GEN-LAST:event_btnContinuarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
