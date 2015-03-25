package proyectofintrimestrnina;

public class Jugadores {
//getters y seters y toString para el arraylist jugadores

    String nombre;
    int dorsal;
    String posicion;

    public Jugadores() {
    }

    public Jugadores(String nombre, int dorsal, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre + ", " + dorsal + ", " + posicion;
    }

}
