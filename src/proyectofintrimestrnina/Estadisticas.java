package proyectofintrimestrnina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estadisticas {

    public Estadisticas() {
    }
    PrintWriter fich = null;
    ArrayList<DatosFutbol> equipoLocal = new ArrayList();
    ArrayList<DatosFutbol> equipoVisitante = new ArrayList();

    public void estadisticasLocal(String ficheroCelta) {

        int golesfav = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de goles a favor"));
        int golescontra = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de goles en contra"));
        int partidosgan = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de partidos ganados"));
        int partidosperd = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de partidos perdidos"));
        int numeroamarillas = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de tarjetas amarillas"));
        int numerorojas = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de tarjetas rojas"));
        equipoLocal.add(new DatosFutbol(golesfav, golescontra, partidosgan, partidosperd, numeroamarillas, numerorojas));

        try {

            fich = new PrintWriter(new FileWriter(new File(ficheroCelta), true));
            for (int i = 0; i < equipoLocal.size(); i++) {
                fich.println(equipoLocal.get(i));

            }

        } catch (IOException ex) {
            System.err.println("error de escritura" + ex.toString());
        } finally {
            fich.close();
        }
    }

    public void estadisticasVisitante(String ficheroCelta) {

        int golesfav = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de goles a favor"));
        int golescontra = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de goles en contra"));
        int partidosgan = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de partidos ganados"));
        int partidosperd = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de partidos perdidos"));
        int numeroamarillas = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de tarjetas amarillas"));
        int numerorojas = Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de tarjetas rojas"));
        equipoVisitante.add(new DatosFutbol(golesfav, golescontra, partidosgan, partidosperd, numeroamarillas, numerorojas));

        try {

            fich = new PrintWriter(new FileWriter(new File(ficheroCelta), true));
            for (int i = 0; i < equipoVisitante.size(); i++) {
                fich.println(equipoVisitante.get(i));

            }

        } catch (IOException ex) {
            System.err.println("error de escritura" + ex.toString());
        } finally {
            fich.close();
        }
    }
}
