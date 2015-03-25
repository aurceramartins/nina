package proyectofintrimestrnina;

public class DatosFutbol {

    int golesfav;
    int golescontra;
    int partidosgan;
    int partidosperd;
    int numeroamarillas;
    int numerorojas;

    public DatosFutbol() {
    }

    public DatosFutbol(int golesfav, int golescontra, int partidosgan, int partidosperd, int numeroamarillas, int numerorojas) {
        this.golesfav = golesfav;
        this.golescontra = golescontra;
        this.partidosgan = partidosgan;
        this.partidosperd = partidosperd;
        this.numeroamarillas = numeroamarillas;
        this.numerorojas = numerorojas;
    }

    public int getGolesfav() {
        return golesfav;
    }

    public void setGolesfav(int golesfav) {
        this.golesfav = golesfav;
    }

    public int getGolescontra() {
        return golescontra;
    }

    public void setGolescontra(int golescontra) {
        this.golescontra = golescontra;
    }

    public int getPartidosgan() {
        return partidosgan;
    }

    public void setPartidosgan(int partidosgan) {
        this.partidosgan = partidosgan;
    }

    public int getPartidosperd() {
        return partidosperd;
    }

    public void setPartidosperd(int partidosperd) {
        this.partidosperd = partidosperd;
    }

    public int getNumeroamarillas() {
        return numeroamarillas;
    }

    public void setNumeroamarillas(int numeroamarillas) {
        this.numeroamarillas = numeroamarillas;
    }

    public int getNumerorojas() {
        return numerorojas;
    }

    public void setNumerorojas(int numerorojas) {
        this.numerorojas = numerorojas;
    }

    @Override
    public String toString() {
        return golesfav + ", " + golescontra + ", " + partidosgan + ", " + partidosperd + ", " + numeroamarillas + ", " + numerorojas;
    }

}
