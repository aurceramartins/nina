package proyectofintrimestrnina;

import java.awt.BorderLayout;

public class MarcadorPartido extends javax.swing.JFrame {

    Crono crono = new Crono();
    Sonido son = new Sonido();

    public MarcadorPartido() {

        initComponents();
        //muestra en un label lo ke escribes en la caja de texto de la pantalla principal donde pone nombre ekipo localy vis
        txtMostNomLoc.setText(ControlDeMarcador.lblNombreEquipoLocal.getText());
        txtMostNomVis.setText(ControlDeMarcador.lblNombreEquipoVisitante.getText());

        setLocationRelativeTo(null);

    }

    public void configurar() {
        //configuramos el fondo del marcador
        Fondo pnlFondo = new Fondo();
        pnlFondo.setSize(this.getSize());
        this.add(pnlFondo, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtMostNomLoc = new javax.swing.JTextField();
        txtMostNomVis = new javax.swing.JTextField();
        escudoLoc = new javax.swing.JLabel();
        escudoVis = new javax.swing.JLabel();
        golesvis = new javax.swing.JLabel();
        golesloc = new javax.swing.JLabel();
        cronomarca = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        minutogol = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        minutogolvis = new javax.swing.JTextArea();
        escudoVis1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(485, 260));

        txtMostNomLoc.setEditable(false);
        txtMostNomLoc.setBackground(new java.awt.Color(0, 204, 255));
        txtMostNomLoc.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtMostNomLoc.setForeground(new java.awt.Color(255, 255, 255));
        txtMostNomLoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMostNomLoc.setBorder(new javax.swing.border.MatteBorder(null));
        txtMostNomLoc.setOpaque(false);
        txtMostNomLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostNomLocActionPerformed(evt);
            }
        });

        txtMostNomVis.setEditable(false);
        txtMostNomVis.setBackground(new java.awt.Color(255, 0, 0));
        txtMostNomVis.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtMostNomVis.setForeground(new java.awt.Color(255, 255, 255));
        txtMostNomVis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMostNomVis.setBorder(new javax.swing.border.MatteBorder(null));
        txtMostNomVis.setOpaque(false);
        txtMostNomVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostNomVisActionPerformed(evt);
            }
        });

        escudoLoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudoLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        escudoVis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudoVis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escudodechatarreros.gif"))); // NOI18N

        golesvis.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        golesvis.setForeground(new java.awt.Color(255, 255, 255));
        golesvis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        golesvis.setText("0");

        golesloc.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        golesloc.setForeground(new java.awt.Color(255, 255, 255));
        golesloc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        golesloc.setText("0");

        cronomarca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cronomarca.setForeground(new java.awt.Color(255, 255, 255));
        cronomarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronomarca.setText("00:00");

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        minutogol.setBackground(new java.awt.Color(0, 0, 204));
        minutogol.setColumns(20);
        minutogol.setForeground(new java.awt.Color(255, 255, 255));
        minutogol.setRows(5);
        jScrollPane2.setViewportView(minutogol);

        minutogolvis.setBackground(new java.awt.Color(0, 0, 204));
        minutogolvis.setColumns(20);
        minutogolvis.setForeground(new java.awt.Color(255, 255, 255));
        minutogolvis.setRows(5);
        jScrollPane1.setViewportView(minutogolvis);

        escudoVis1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudoVis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escudocelta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtMostNomLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cronomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtMostNomVis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(escudoVis1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escudoLoc)
                .addGap(18, 18, 18)
                .addComponent(golesloc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(golesvis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escudoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMostNomVis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMostNomLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cronomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(escudoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(golesloc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(golesvis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(escudoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escudoVis1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //boton volver para volver del marcador a la pantalla principal
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Boton Salir
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMostNomVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostNomVisActionPerformed

    }//GEN-LAST:event_txtMostNomVisActionPerformed

    private void txtMostNomLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostNomLocActionPerformed

    }//GEN-LAST:event_txtMostNomLocActionPerformed

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
            java.util.logging.Logger.getLogger(MarcadorPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcadorPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcadorPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcadorPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcadorPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cronomarca;
    private javax.swing.JLabel escudoLoc;
    private javax.swing.JLabel escudoVis;
    private javax.swing.JLabel escudoVis1;
    public static javax.swing.JLabel golesloc;
    public static javax.swing.JLabel golesvis;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea minutogol;
    public static javax.swing.JTextArea minutogolvis;
    public static javax.swing.JTextField txtMostNomLoc;
    public static javax.swing.JTextField txtMostNomVis;
    // End of variables declaration//GEN-END:variables
}
