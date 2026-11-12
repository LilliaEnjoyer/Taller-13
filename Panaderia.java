
import java.util.ArrayList;

public class Panaderia implements Observable{
    private boolean hayPan = false;
    private ArrayList<Vecino> vecinos = new ArrayList<Vecino>();

    public void sacarPan() {
        System.out.println(">>>>>>>>>>Ha salido el pannnn");
        notificar("VECINOOOO YA SALIO EL PANNNNN");
    }

    // public boolean hayPan() {
    //     return hayPan;
    // }

    // public static void main(String[] args) {
        
    // }

    @Override
    public void suscribir(Vecino v) {
        System.out.println("se le notificara al vecino " + v.getNombre());
        vecinos.add(v);
    }

    @Override
    public void dessucribir(Vecino v) {
        System.out.println("ya no se le notificara al vecino " + v.getNombre());
        vecinos.removeIf(vec -> vec.getNombre().equals(v.getNombre()));
    }

    @Override
    public void notificar(String msj) {
        for(Vecino v : vecinos){
            v.actualizar(msj);
        }
    }
}
