package proyectofintrimestrnina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Crono extends javax.swing.JFrame {

    String numero;
    String respuesta;
    String respuesta1;
    int totalgolesLoc;
    int totalgolesVis;
    int totalamarillasLoc;
    int totalrojasLoc;
    int totalamarillasVis;
    int totalrojasVis;

    public Crono() {
        initComponents();
//creamos un objeto de la clase timer y le decimos ke por cada accion cuente 1000 milisegundos por lo tanto por cada accion cuenta un segundo
        t = new Timer(1000, acciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnReiniciarCrono = new javax.swing.JButton();
        btnPararTiempo = new javax.swing.JButton();
        golLocal = new javax.swing.JButton();
        descuento = new javax.swing.JButton();
        golVisitante = new javax.swing.JButton();
        vermellaLoc = new javax.swing.JButton();
        marelaLoc = new javax.swing.JButton();
        marelaVis = new javax.swing.JButton();
        vermellaVis = new javax.swing.JButton();
        rematarPartido = new javax.swing.JButton();
        LocalMostrarNombre = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jButton3.setText("jButton3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(630, 210));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jPanel2.setRequestFocusEnabled(false);

        btnStart.setText("Comenzar crono");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnReiniciarCrono.setText("Reiniciar Crono");
        btnReiniciarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarCronoActionPerformed(evt);
            }
        });

        btnPararTiempo.setText("Parar");
        btnPararTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararTiempoActionPerformed(evt);
            }
        });

        golLocal.setText("ollo que hay gooool");
        golLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                golLocalMouseClicked(evt);
            }
        });
        golLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golLocalActionPerformed(evt);
            }
        });

        descuento.setText("añadir descuento");
        descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentoActionPerformed(evt);
            }
        });

        golVisitante.setText("gol visitante");
        golVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golVisitanteActionPerformed(evt);
            }
        });

        vermellaLoc.setText("Vermella pa casa");
        vermellaLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermellaLocActionPerformed(evt);
            }
        });

        marelaLoc.setText("marela");
        marelaLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marelaLocActionPerformed(evt);
            }
        });

        marelaVis.setText("MarelaVis");
        marelaVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marelaVisActionPerformed(evt);
            }
        });

        vermellaVis.setText("VermellaVis");
        vermellaVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermellaVisActionPerformed(evt);
            }
        });

        rematarPartido.setText("Rematar o Partido");
        rematarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rematarPartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPararTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(golVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marelaVis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(golLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marelaLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vermellaLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(vermellaVis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(rematarPartido)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marelaLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vermellaLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(golVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPararTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marelaVis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vermellaVis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rematarPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 190));
        getContentPane().add(LocalMostrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 271, 183, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t;
    private int minuto, seg;
    private ActionListener acciones = new ActionListener() {
// este metodo calcula los segundos y minutos los segundos aumentan hasta 60 y cuando llega los segundos se ponen a 0 y se suma un minuto asi empieza a subir otra vez los segundos hasta 60 y tendriamos 2 minutos etc etc
        @Override
        public void actionPerformed(ActionEvent e) {
            seg++;
            if (seg == 60) {
                seg = 0;
                minuto++;
            }
            if (minuto == 60) {
                minuto = 0;
            }
            actualizarLabel();
        }
    };
// con este metodo lo que vamos a conseguir es que en el string solo se vean los minutos y segundos hasta 9
    //es decir para ke kede asi 09:09 si le subieramos un segundo mas kedaria 09:010 asi se le suma al otro numero y keda 09:10

    public void actualizarLabel() {
        String tiempo = (minuto <= 9 ? "0" : "") + minuto + ":" + (seg <= 9 ? "0" : "") + seg;
        //le mandamos el String al marcador para ke muestre el cronometro en la interfaz
        MarcadorPartido.cronomarca.setText(tiempo);
    }


    private void btnPararTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararTiempoActionPerformed
        //con este metodo paramos el tiempo restauramos el boton start para ke se pueda volver a presionar y el boton parar lo deshabilitamos
        t.stop();
        btnStart.setEnabled(true);
        btnPararTiempo.setEnabled(false);
    }//GEN-LAST:event_btnPararTiempoActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //iniciamos el cronometro y desactivamos este boton para ke no se pueda volver a presionar sin antes parar o reiniciar
        t.start();

        btnStart.setEnabled(false);
        //le damos texto al boton para ke ponga reanudar si lo paramos
        btnStart.setText("Reanudar");
        //activamos los botones parar y reiniciar
        btnPararTiempo.setEnabled(true);
        btnReiniciarCrono.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnReiniciarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarCronoActionPerformed
        //si el tiempo esta corriendo lo para
        if (t.isRunning()) {
            t.stop();
            btnStart.setEnabled(true);
        }
        //y ahora reinicia el boton start para que vuelva a como estaba al principio
        btnStart.setText("Comenzar Partido");
        //se desactivan parar y reiniciar
        btnPararTiempo.setEnabled(false);
        btnReiniciarCrono.setEnabled(false);
        //se pone el cronometro a 0
        minuto = 0;
        seg = 0;
        //llamamos al metodo actualizar label para ke lo muestre en el marcador quedaria 00:00
        actualizarLabel();
    }//GEN-LAST:event_btnReiniciarCronoActionPerformed

    private void golLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golLocalActionPerformed
        //Es para subir los goles cuando pulsas el boton
        //Coge lo que esta escrito en el marcador coge por ejemplo esta escrito 0 pues lo que hace es ponerlo en 1 si esta en 1 lo pone en 2 y asi sucesivamente
        String captura = minuto + ":" + seg;
        String contador = MarcadorPartido.golesloc.getText();

        if (contador.equalsIgnoreCase("0")) {
            MarcadorPartido.golesloc.setText("1");
        } else if (contador.equalsIgnoreCase("1")) {
            MarcadorPartido.golesloc.setText("2");
        } else if (contador.equalsIgnoreCase("2")) {
            MarcadorPartido.golesloc.setText("3");
        } else if (contador.equalsIgnoreCase("3")) {
            MarcadorPartido.golesloc.setText("4");
        } else if (contador.equalsIgnoreCase("4")) {
            MarcadorPartido.golesloc.setText("5");
        } else if (contador.equalsIgnoreCase("5")) {
            MarcadorPartido.golesloc.setText("6");
        } else if (contador.equalsIgnoreCase("6")) {
            MarcadorPartido.golesloc.setText("7");
        } else if (contador.equalsIgnoreCase("7")) {
            MarcadorPartido.golesloc.setText("8");
        } else if (contador.equalsIgnoreCase("8")) {
            MarcadorPartido.golesloc.setText("9");
        } else if (contador.equalsIgnoreCase("9")) {
            MarcadorPartido.golesloc.setText("10");
        }

        String resp = JOptionPane.showInputDialog("¿Quien marco el gol??");
        respuesta = respuesta + "\n" + resp + " minuto " + captura;

        MarcadorPartido.minutogol.setText(respuesta);
        totalgolesLoc = totalgolesLoc + 1;
        String golLoc=String.valueOf(totalgolesLoc);
        EstadisticasPostPartido.totalgolesloc.setText(golLoc);
    }//GEN-LAST:event_golLocalActionPerformed

    private void golVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golVisitanteActionPerformed
        //Este es lo mismo solo ke para los visitantes
        String captura = minuto + ":" + seg;
        String contador = MarcadorPartido.golesvis.getText();

        if (contador.equalsIgnoreCase("0")) {
            MarcadorPartido.golesvis.setText("1");
        } else if (contador.equalsIgnoreCase("1")) {
            MarcadorPartido.golesvis.setText("2");
        } else if (contador.equalsIgnoreCase("2")) {
            MarcadorPartido.golesvis.setText("3");
        } else if (contador.equalsIgnoreCase("3")) {
            MarcadorPartido.golesvis.setText("4");
        } else if (contador.equalsIgnoreCase("4")) {
            MarcadorPartido.golesvis.setText("5");
        } else if (contador.equalsIgnoreCase("5")) {
            MarcadorPartido.golesvis.setText("6");
        } else if (contador.equalsIgnoreCase("6")) {
            MarcadorPartido.golesvis.setText("7");
        } else if (contador.equalsIgnoreCase("7")) {
            MarcadorPartido.golesvis.setText("8");
        } else if (contador.equalsIgnoreCase("8")) {
            MarcadorPartido.golesvis.setText("9");
        } else if (contador.equalsIgnoreCase("9")) {
            MarcadorPartido.golesvis.setText("10");
        }

        String resp = JOptionPane.showInputDialog("¿Quien marco el gol??");
        respuesta1 = respuesta1 + "\n" + resp + " minuto " + captura;
        MarcadorPartido.minutogolvis.setText(respuesta1);
        totalgolesVis = totalgolesVis + 1;
        String golVis=String.valueOf(totalgolesVis);
        EstadisticasPostPartido.totalgolesvis.setText(golVis);
    }//GEN-LAST:event_golVisitanteActionPerformed

    private void descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoActionPerformed

    }//GEN-LAST:event_descuentoActionPerformed

    private void golLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_golLocalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_golLocalMouseClicked

    private void marelaLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marelaLocActionPerformed
        String captura = minuto + ":" + seg;
        String amarillapara = JOptionPane.showInputDialog("¿A quien le saco tarjeta?");
        respuesta = respuesta + "\nMarela: " + amarillapara + " minuto " + captura;
        MarcadorPartido.minutogol.setText(respuesta);
        totalamarillasLoc = totalamarillasLoc + 1;
        String amaLoc=String.valueOf(totalamarillasLoc);
        EstadisticasPostPartido.totalamarillasloc.setText(amaLoc);
    }//GEN-LAST:event_marelaLocActionPerformed

    private void marelaVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marelaVisActionPerformed
        String captura = minuto + ":" + seg;
        String amarillapara = JOptionPane.showInputDialog("¿A quien le saco tarjeta?");
        respuesta1 = respuesta1 + "\nMarela: " + amarillapara + " minuto " + captura;
        MarcadorPartido.minutogolvis.setText(respuesta1);
        totalamarillasVis = totalamarillasVis + 1;
        String amaVis=String.valueOf(totalamarillasVis);
        EstadisticasPostPartido.totalamarillasvis.setText(amaVis);
    }//GEN-LAST:event_marelaVisActionPerformed

    private void vermellaLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermellaLocActionPerformed
        String captura = minuto + ":" + seg;
        String rojapara = JOptionPane.showInputDialog("¿A quien le saco tarjeta?");
        respuesta = respuesta + "\nVermella: " + rojapara + " minuto " + captura;
        MarcadorPartido.minutogol.setText(respuesta);
        totalrojasLoc = totalrojasLoc + 1;
        String rojloc=String.valueOf(totalrojasLoc);
        EstadisticasPostPartido.totalrojasloc.setText(rojloc);
    }//GEN-LAST:event_vermellaLocActionPerformed

    private void vermellaVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermellaVisActionPerformed
        String captura = minuto + ":" + seg;
        String rojapara = JOptionPane.showInputDialog("¿A quien le saco tarjeta?");
        respuesta1 = respuesta1 + "\nVermella: " + rojapara + " minuto " + captura;
        MarcadorPartido.minutogolvis.setText(respuesta1);
        totalrojasVis = totalrojasVis + 1;
        String rojvis=String.valueOf(totalrojasVis);
        EstadisticasPostPartido.totalrojasvis.setText(rojvis);
    }//GEN-LAST:event_vermellaVisActionPerformed

    private void rematarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rematarPartidoActionPerformed
        EstadisticasPostPartido dialog = new EstadisticasPostPartido(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        
        
        
        
        
        
    }//GEN-LAST:event_rematarPartidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LocalMostrarNombre;
    private javax.swing.JButton btnPararTiempo;
    private javax.swing.JButton btnReiniciarCrono;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton descuento;
    public static javax.swing.JButton golLocal;
    private javax.swing.JButton golVisitante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton marelaLoc;
    private javax.swing.JButton marelaVis;
    private javax.swing.JButton rematarPartido;
    private javax.swing.JButton vermellaLoc;
    private javax.swing.JButton vermellaVis;
    // End of variables declaration//GEN-END:variables
}
