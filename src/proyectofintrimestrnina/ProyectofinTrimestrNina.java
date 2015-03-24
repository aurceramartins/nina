package proyectofintrimestrnina;

public class ProyectofinTrimestrNina {

    public static void main(String[] args) {

        //Llamamos a la ventana principal del programa la que sale con la bota
        ControlDeMarcador control = new ControlDeMarcador();
        control.setVisible(true);

        //cancion ,suena cuando se inicia el proyecto
        Sonido cancionprincipal=new Sonido();
        cancionprincipal.rocky();
    }

}
