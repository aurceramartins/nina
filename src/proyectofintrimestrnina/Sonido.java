package proyectofintrimestrnina;

import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Sonido {   //Ponemos el sonido al proyecto

    Player player;
    Player player1;

    public void plusliga() {

        try {
            FileInputStream song;

            song = new FileInputStream("C:\\Users\\Alex Urcera\\Desktop\\clase\\PROGRAMACION\\ProyectofinTrimestrNina\\src\\grabaciones de voz\\canalplus.mp3");
            BufferedInputStream cancion = new BufferedInputStream(song);
            player = new Player(song);
            player.play();

        } catch (FileNotFoundException | JavaLayerException e) {

        }
    }

    public void rocky() {

        try {
            FileInputStream song;
            song = new FileInputStream("C:\\Users\\Alex Urcera\\Videos\\rocky.mp3");
            BufferedInputStream cancion = new BufferedInputStream(song);
            player1 = new Player(song);
            player1.play();

        } catch (FileNotFoundException | JavaLayerException e) {

        }
    }

}
