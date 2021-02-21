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

}
