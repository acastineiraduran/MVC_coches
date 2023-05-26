import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    View miVista = new View();
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     *            method.
     */
    @Override
    public void update(Observable o, Object arg) {
        Coche auxCoche = (Coche)arg; // para poder trabajar con el
        if(auxCoche.velocidad > 120) {
            miVista.muestraExceso(auxCoche.matricula, auxCoche.velocidad);
        }
    }
}
