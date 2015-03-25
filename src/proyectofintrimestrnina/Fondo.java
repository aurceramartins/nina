package proyectofintrimestrnina;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Fondo extends javax.swing.JPanel {
//Clase fondo ke configra el fondo del marcador lo dibujamos gracias al metodo graphics lo que hace que el fondo se pueda autoampliar con la ventana

    public Fondo() {

        //this.setSize(100, 100);
        //Icon boton = new ImageIcon(getClass().getResource("/Imagenes/fondochampions.jpg"));
    }

    @Override
    public void paintComponent(Graphics g) {

        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/champions1.jpeg"));
        g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

}
