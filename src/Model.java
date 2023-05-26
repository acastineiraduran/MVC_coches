import java.util.ArrayList;
import java.util.Observable;

/**
 * clase que hace como de bd "consultando" y "modificando" info del objeto Coche.
 */
public class Model extends Observable {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * cambia la velocidad por la que le pasemos del coche que tenga la matricula que le pasemos
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public static Integer cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public static Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }


    /**
     * Modifica la velocidad del coche pasado por param y notifica a los observadores del cambio
     * @param matricula
     * @return velocidad modificada
     */
    public Integer subirVelocidad(String matricula) {
        getCoche(matricula).velocidad = getCoche(matricula).velocidad + 10;
        setChanged();// true
        notifyObservers(getCoche(matricula));// llamamos a update y le enviamos objeto modificado
        return getCoche(matricula).velocidad;
    }

    /**
     * baja la velocidad del coche pasado por parametro
     * @param matricula
     * @return velocidad modificada
     */
    public Integer bajarVelocidad(String matricula) {
        // busca el coche y sube la velocidad
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - 10;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }
}
