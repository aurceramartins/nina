package proyectofintrimestrnina;

import java.io.*;
import javazoom.jl.decoder.JavaLayerException;

import javazoom.jl.player.Player;

public class Sonido {
//Ponemos el sonido al proyecto
    public void plusliga() {

        try {
            FileInputStream song;
            Player player;
            song = new FileInputStream("C:\\Users\\Alex Urcera\\Videos\\canalplus.mp3");
            BufferedInputStream cancion=new BufferedInputStream(song);
            player=new Player(song);
            player.play();
            
        } catch (FileNotFoundException | JavaLayerException e) {
            
        }
    }
    public void rocky() {

        try {
            FileInputStream song;
            Player player;
            song = new FileInputStream("C:\\Users\\Alex Urcera\\Videos\\rocky.mp3");
            BufferedInputStream cancion=new BufferedInputStream(song);
            player=new Player(song);
            player.play();
            
            
        } catch (FileNotFoundException | JavaLayerException e) {
            
        }
    }

    
    
}
