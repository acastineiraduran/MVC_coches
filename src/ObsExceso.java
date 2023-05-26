import java.util.Observable;
import java.util.Observer;

/**
 * clase que hace el papel del Observador. En concreto observa la velocidad
 */
public class ObsExceso implements Observer {
    View miVista = new View();
    /**
     * Método que hace el cambio cuando se llama al notifyObservers(...)
     * @param o observable
     * @param arg recibe el objeto que hemos modificado, en este caso Coche
     * Si la velocidad es superior a 120km/h llama a la view para mostrar un aviso
     */
    @Override
    public void update(Observable o, Object arg) {
        Coche auxCoche = (Coche)arg; // para poder trabajar con el
        if(auxCoche.velocidad > 120) {
            miVista.muestraExceso(auxCoche.matricula);
        }
    }
}
