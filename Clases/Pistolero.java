package Clases;

abstract public class Pistolero extends Persona {
    Revolver revolver;
    boolean vivo;

    

    public Pistolero() {

    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Pistolero(Revolver revolver, boolean vivo) {
        this.revolver = revolver;
        this.vivo = vivo;
    }

    public Pistolero(String nombre, Revolver revolver, boolean vivo) {
        super(nombre);
        this.revolver = revolver;
        this.vivo = vivo;
    }


    @Override
    public String toString() {
        return "Pistolero [revolver=" + revolver + ", vivo=" + vivo + "]";
    }

    public void desenfundar(Revolver revolver) {
        System.out.println(this.nombre+" ha desenfundado");
    }

    public void disparar(Pistolero enemy) {
       System.out.println(this.nombre+" ha disparado a "+enemy.getNombre());
       enemy.setVivo(false);
    }

    public void verEstado() {
        if (this.vivo == true) {
            System.out.println("Esta vivo");
        } else if (this.vivo == false) {
            System.out.println("Esta muerto");
        }
    }
    
    
}
