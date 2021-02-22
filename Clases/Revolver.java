package Clases;
import java.util.*;

public class Revolver {
    ArrayList<Bala> cargador;

    public ArrayList<Bala> getCargador() {
        return cargador;
    }

    public void setCargador(ArrayList<Bala> cargador) {
        this.cargador = cargador;
    }

    public Revolver(ArrayList<Bala> cargador) {
        this.cargador = cargador;
    }

    public Revolver() {

    }

    public void girarTambor(){
        Collections.rotate(cargador, (int)(Math.random()*100));
    }

    public void recargar(Bala bala) {
        cargador.set(1, bala);
    }


    public boolean disparar() {
        Bala bala = cargador.set(0, null);
        Collections.rotate(cargador, 1);
        return bala!=null;
    }

    public String verEstado() {
        return cargador.toString();
    }

}
