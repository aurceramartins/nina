package proyectofintrimestrnina;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPrincipal extends JPanel {
//fondo principal lo dibujamos con graphics

    public FondoPrincipal() {

        this.setSize(750, 550);

        //Icon icono = new ImageIcon(getClass().getResource("/Imagenes/fondochampions.jpg"));
    }

    @Override
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        ImageIcon imagenf = new ImageIcon(getClass().getResource("/Imagenes/botafondo.jpg"));
        g.drawImage(imagenf.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);

    }

}
