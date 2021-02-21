package Clases;

public class Bandido extends Pistolero {
    String apodo;

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Bandido(String apodo) {
        this.apodo = apodo;
    }

    public Bandido(Revolver revolver, boolean vivo, String apodo) {
        super(revolver, vivo);
        this.apodo = apodo;
    }

    public Bandido(String nombre, Revolver revolver, boolean vivo, String apodo) {
        super(nombre, revolver, vivo);
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Bandido [apodo=" + apodo + "]";
    }

    
}
