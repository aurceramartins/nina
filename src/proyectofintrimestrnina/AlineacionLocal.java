package proyectofintrimestrnina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlineacionLocal extends javax.swing.JDialog {

    public AlineacionLocal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();

    }
    ArrayList<Jugadores> jugadores = new ArrayList();
    PrintWriter fich = null;

    public void editarAlineacion(String nomeFicheiro) {
        //Este metodo sirve para cambiar la alineacion de cualkier ekipo mete la informacion en un fichero
        int jug = 0;
        while (jug < 11) {
            try {
                String aux1 = JOptionPane.showInputDialog("Dame el nombre del jugador");
                int aux2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el dorsal de ese jugador"));
                String aux3 = JOptionPane.showInputDialog("De que posicion juega el jugador?");
                jugadores.add(new Jugadores(aux1, aux2, aux3));
                fich = new PrintWriter(new FileWriter(new File(nomeFicheiro), true));
                fich.println(aux1 + ", " + aux2);
                jug++;

            } catch (IOException ex) {
                Logger.getLogger(AlineacionLocal.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                fich.close();
            }
        }
    }

    //Con este metodo leeremos el fichero para poder mostrarlo por pantalla en la alineacion y asi poder cambiar los jugadores en la alineacion
    public void leerFichero(String nomeFicheiro) {
        String resposta;
        Scanner sc = null;
        try {
            sc = new Scanner(new File(nomeFicheiro));
            while (sc.hasNextLine()) {
                resposta = sc.nextLine();
                String[] posiciones = resposta.split(", ");
                if ((posiciones[3]).equalsIgnoreCase("defensa")) {
                    System.out.println(posiciones[0] + " " + posiciones[1]);
                } else if (posiciones[3].equalsIgnoreCase("medio")) {
                    System.out.println(posiciones[0] + " " + posiciones[1]);
                } else if (posiciones[3].equalsIgnoreCase("delantero")) {
                    System.out.println(posiciones[0] + " " + posiciones[1]);
                }
            }
        } catch (IOException ex) {
            System.err.println("erro de lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PorteroL = new javax.swing.JLabel();
        centralDL = new javax.swing.JLabel();
        lateralIL = new javax.swing.JLabel();
        lateralDL = new javax.swing.JLabel();
        interioDL = new javax.swing.JLabel();
        mediapuntaL = new javax.swing.JLabel();
        interiorIL = new javax.swing.JLabel();
        medioDL = new javax.swing.JLabel();
        medioIL = new javax.swing.JLabel();
        centralIL = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        PorteroL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/catoira1.jpg"))); // NOI18N

        centralDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabraloca1.jpg"))); // NOI18N

        lateralIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xoni1.jpg"))); // NOI18N

        lateralDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planas1.jpg"))); // NOI18N

        interioDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orelludo1.jpg"))); // NOI18N

        mediapuntaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/augusto1.jpg"))); // NOI18N

        interiorIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nolito1.jpg"))); // NOI18N

        medioDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nemanja.jpg"))); // NOI18N

        medioIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kronh1.jpg"))); // NOI18N

        centralIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fontas1.jpg"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/larrivey1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mediapuntaL)
                        .addGap(43, 43, 43)
                        .addComponent(medioDL))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(interioDL)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(medioIL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(interiorIL)
                        .addGap(77, 77, 77))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lateralDL)
                        .addGap(18, 18, 18)
                        .addComponent(centralDL)
                        .addGap(18, 18, 18)
                        .addComponent(centralIL)
                        .addGap(18, 18, 18)
                        .addComponent(lateralIL))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(PorteroL)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PorteroL)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lateralIL)
                                .addGap(18, 18, 18)
                                .addComponent(medioIL)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lateralDL)
                                .addGap(18, 18, 18)
                                .addComponent(mediapuntaL)
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(centralDL)
                            .addComponent(centralIL))
                        .addGap(18, 18, 18)
                        .addComponent(medioDL)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(interiorIL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(interioDL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlineacionLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlineacionLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlineacionLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlineacionLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AlineacionLocal dialog = new AlineacionLocal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel PorteroL;
    public static javax.swing.JLabel centralDL;
    public static javax.swing.JLabel centralIL;
    public static javax.swing.JLabel interioDL;
    public static javax.swing.JLabel interiorIL;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lateralDL;
    public static javax.swing.JLabel lateralIL;
    public static javax.swing.JLabel mediapuntaL;
    public static javax.swing.JLabel medioDL;
    public static javax.swing.JLabel medioIL;
    // End of variables declaration//GEN-END:variables
}
