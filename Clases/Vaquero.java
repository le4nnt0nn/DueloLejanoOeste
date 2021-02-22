package Clases;

public class Vaquero extends Pistolero {
    int numeroPlaca;

    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public Vaquero(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public Vaquero() {

    }

    public Vaquero(String nombre, Revolver revolver, boolean vivo) {
        super(nombre, revolver, vivo);
    }

    public Vaquero(Revolver revolver, boolean vivo, int numeroPlaca) {
        super(revolver, vivo);
        this.numeroPlaca = numeroPlaca;
    }

    public Vaquero(String nombre, Revolver revolver, boolean vivo, int numeroPlaca) {
        super(nombre, revolver, vivo);
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return "Vaquero [numeroPlaca=" + numeroPlaca + "]";
    }

    
}
