package Inicializador;
import java.util.*;  
import Clases.*;

public class Duelo {
    
    //* VAQUERO
    ArrayList<Bala> cargador = new ArrayList(3);
    Revolver revolver1 = new Revolver(cargador);
    Pistolero p1 = new Vaquero("Woody", revolver1, true);

    //* BANDIDO
    ArrayList<Bala> cargador2 = new ArrayList(3);
    Revolver revolver2 = new Revolver(cargador2);
    Pistolero p2 = new Bandido("Dann", revolver2, true, "El Sucio");

    public void empezarDuelo() {
        System.out.println(p1.getNombre()+" VS "+p2.getNombre()+" - "+p2.toString());
        System.out.println("*Silencio absoluto en el salon, el duelo va a comenzar*");
    }

    public void tiroteo() {
        empezarDuelo();
        int aleatorio;
        aleatorio = (int)(Math.random()*10);
        if(aleatorio<=5){
            p1.desenfundar(revolver1);
            p1.disparar(p2);
        }else if(aleatorio>5){
            p2.desenfundar(revolver2);
            p2.disparar(p1);
        }
        checkGanador(p1, p2);
    }
    
    public void checkGanador(Pistolero pistolero1, Pistolero pistolero2) {
        if(pistolero1.isVivo()==false && pistolero2.isVivo()==true){
            System.out.println(pistolero2.getNombre()+ " ha ganado el duelo, ha sido mas rapido");
        }else{
            System.out.println(pistolero1.getNombre()+ " ha ganado el duelo, ha sido mas rapido");
        }           
    }
}
