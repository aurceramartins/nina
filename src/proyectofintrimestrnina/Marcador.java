package proyectofintrimestrnina;

import java.awt.BorderLayout;

public class Marcador extends javax.swing.JDialog {

    public Marcador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtMostNomLoc.setText(ControlDeMarcador.lblNombreEquipoLocal.getText());
        txtMostNomVis.setText(ControlDeMarcador.lblNombreEquipoVisitante.getText());
        setLocationRelativeTo(null);

    }

    public void configurar() {
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
        cronomarcador = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(485, 260));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

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
        escudoLoc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alex Urcera\\Desktop\\escudocelta.png")); // NOI18N
        escudoLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        escudoVis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudoVis.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alex Urcera\\Desktop\\escudodechatarreros.gif")); // NOI18N

        golesvis.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        golesvis.setForeground(new java.awt.Color(255, 255, 255));
        golesvis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        golesvis.setText("0");

        golesloc.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        golesloc.setForeground(new java.awt.Color(255, 255, 255));
        golesloc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        golesloc.setText("3");

        cronomarcador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cronomarcador.setForeground(new java.awt.Color(255, 255, 255));
        cronomarcador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronomarcador.setText("00:00");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(escudoLoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesloc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesvis, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(escudoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtMostNomLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cronomarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtMostNomVis, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMostNomVis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMostNomLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cronomarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(escudoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(golesloc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(golesvis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(escudoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMostNomVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostNomVisActionPerformed

    }//GEN-LAST:event_txtMostNomVisActionPerformed

    private void txtMostNomLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostNomLocActionPerformed


    }//GEN-LAST:event_txtMostNomLocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cronomarcador;
    private javax.swing.JLabel escudoLoc;
    private javax.swing.JLabel escudoVis;
    private javax.swing.JLabel golesloc;
    private javax.swing.JLabel golesvis;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txtMostNomLoc;
    public static javax.swing.JTextField txtMostNomVis;
    // End of variables declaration//GEN-END:variables
}
