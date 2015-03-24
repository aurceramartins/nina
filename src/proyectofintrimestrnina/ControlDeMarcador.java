package proyectofintrimestrnina;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.PrintWriter;
import java.util.ArrayList;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ControlDeMarcador extends javax.swing.JFrame {

    public ControlDeMarcador() {

        //iniciamos los componentes(botones y esas cosas) y le metemos el fondo que lo sacamos de la clase fondoprincipal 
        initComponents();
        FondoPrincipal fondo = new FondoPrincipal();
        this.add(fondo, BorderLayout.CENTER);
        this.pack();
        setLocationRelativeTo(null);
        

    }

    
    ArrayList<Jugadores> jugadores = new ArrayList();
    PrintWriter fich = null;
    Fondo fond = new Fondo();
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        EditarAlineacionLocal = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonComenzarPartido = new javax.swing.JButton();
        AlineacionVisitante = new javax.swing.JButton();
        EstadisticasLocales = new javax.swing.JButton();
        EstadisticasVisitantes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreEquipoLocal = new javax.swing.JTextField();
        lblNombreEquipoVisitante = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MARCADOR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MARCADOR"); // NOI18N

        EditarAlineacionLocal.setBackground(new java.awt.Color(208, 5, 5));
        EditarAlineacionLocal.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        EditarAlineacionLocal.setForeground(new java.awt.Color(206, 6, 6));
        EditarAlineacionLocal.setText("EDITAR ALINEACION LOCAL");
        EditarAlineacionLocal.setBorderPainted(false);
        EditarAlineacionLocal.setContentAreaFilled(false);
        EditarAlineacionLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarAlineacionLocal.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonb.jpg"))); // NOI18N
        EditarAlineacionLocal.setFocusPainted(false);
        EditarAlineacionLocal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abstractos.jpg"))); // NOI18N
        EditarAlineacionLocal.setSelected(true);
        EditarAlineacionLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAlineacionLocalActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonComenzarPartido.setBackground(new java.awt.Color(255, 0, 0));
        BotonComenzarPartido.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        BotonComenzarPartido.setForeground(new java.awt.Color(255, 255, 255));
        BotonComenzarPartido.setText("Comezo do partido");
        BotonComenzarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComenzarPartidoActionPerformed(evt);
            }
        });

        AlineacionVisitante.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        AlineacionVisitante.setForeground(new java.awt.Color(206, 6, 6));
        AlineacionVisitante.setText("EDITAR ALINEACION VISITANTE");
        AlineacionVisitante.setBorderPainted(false);
        AlineacionVisitante.setContentAreaFilled(false);
        AlineacionVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AlineacionVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlineacionVisitanteActionPerformed(evt);
            }
        });

        EstadisticasLocales.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        EstadisticasLocales.setForeground(new java.awt.Color(206, 6, 6));
        EstadisticasLocales.setText("EDITAR ESTADISTICAS LOCALES");
        EstadisticasLocales.setBorderPainted(false);
        EstadisticasLocales.setContentAreaFilled(false);
        EstadisticasLocales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstadisticasLocales.setDefaultCapable(false);

        EstadisticasVisitantes.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        EstadisticasVisitantes.setForeground(new java.awt.Color(206, 6, 6));
        EstadisticasVisitantes.setText("EDITAR ESTADISTICAS VISITANTES");
        EstadisticasVisitantes.setBorderPainted(false);
        EstadisticasVisitantes.setContentAreaFilled(false);
        EstadisticasVisitantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 6, 6));
        jLabel1.setText("Nombre del equipo local : ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        jLabel2.setFont(new java.awt.Font("AR CENA", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 6, 6));
        jLabel2.setText("Nombre del equipo visitante : ");

        lblNombreEquipoLocal.setBackground(new java.awt.Color(0, 255, 255));
        lblNombreEquipoLocal.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEquipoLocal.setOpaque(false);
        lblNombreEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreEquipoLocalActionPerformed(evt);
            }
        });

        lblNombreEquipoVisitante.setForeground(new java.awt.Color(0, 255, 255));
        lblNombreEquipoVisitante.setOpaque(false);
        lblNombreEquipoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNombreEquipoVisitanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonComenzarPartido)
                    .addComponent(BotonSalir))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreEquipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lblNombreEquipoVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlineacionVisitante)
                            .addComponent(EstadisticasLocales, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadisticasVisitantes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(EditarAlineacionLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(EditarAlineacionLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlineacionVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstadisticasLocales, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstadisticasVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BotonComenzarPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        //Boton salir
        
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed
    private void BotonComenzarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComenzarPartidoActionPerformed
        //no le hagas caso a los comentarios del medio
        //Este boton inicia el marcador y a la vez el control del marcador, tambien le introducimos el fondo ke lo cogemos de la clase marcadorpartido
        
        Crono reloj = new Crono();
        //Marcador jdiFondo = new Marcador(this, true);
        //Marcador dialog = new Marcador(new javax.swing.JFrame(), true);
        //dialog.setVisible(true);
        MarcadorPartido jdiFondo = new MarcadorPartido();
        int ancho = 530;
        int alto = 475;

        jdiFondo.setSize(ancho, alto);
        jdiFondo.setPreferredSize(new Dimension(ancho, alto));
        jdiFondo.configurar();
        reloj.setVisible(true);
        jdiFondo.setVisible(true);
        //Sonido soniparti=new Sonido();
        //soniparti.plusliga();
        
        
    }//GEN-LAST:event_BotonComenzarPartidoActionPerformed

    private void lblNombreEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreEquipoLocalActionPerformed

    }//GEN-LAST:event_lblNombreEquipoLocalActionPerformed

    private void lblNombreEquipoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreEquipoVisitanteActionPerformed

    }//GEN-LAST:event_lblNombreEquipoVisitanteActionPerformed

    private void EditarAlineacionLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAlineacionLocalActionPerformed
       //Este boton te lleva a un menu en el ke puedes editar la alineacion o hacer cambios en el equipo
        int opcion = 0;

        do {
            switch (Integer.parseInt(JOptionPane.showInputDialog("  MENU \n"
                    + "1-Algun jugador nuevo en la convocatoria??\n"
                    + "2- Hacer cambios en el equipo"))) {
                case 1:
                    AlineacionLocal local = new AlineacionLocal(new javax.swing.JFrame(), true);
                    String loc = lblNombreEquipoLocal.getText();
                    local.editarAlineacion(loc + ".txt");
                    break;
                case 2:
                    AlineacionLocal dialog = new AlineacionLocal(new javax.swing.JFrame(), true);
                    dialog.setVisible(true);
                    break;
            }
        } while (opcion <= 2);


    }//GEN-LAST:event_EditarAlineacionLocalActionPerformed

    private void AlineacionVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlineacionVisitanteActionPerformed
        // este hara lo mismo ke el boton de arriba
        AlineacionVisitante vis=new AlineacionVisitante();
        vis.setVisible(true);
        String visit = lblNombreEquipoLocal.getText();
        vis.leerFichero(visit+".txt");
    }//GEN-LAST:event_AlineacionVisitanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlineacionVisitante;
    public static javax.swing.JButton BotonComenzarPartido;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton EditarAlineacionLocal;
    private javax.swing.JButton EstadisticasLocales;
    private javax.swing.JButton EstadisticasVisitantes;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JTextField lblNombreEquipoLocal;
    public static javax.swing.JTextField lblNombreEquipoVisitante;
    // End of variables declaration//GEN-END:variables
}
