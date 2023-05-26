/**
 * clase que se comunica con Model y View con el fin de implementar un diseño MVC consiguiendo la
 * abstracción del código
 */
public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {

        //instancio observer
        ObsExceso miObservador = new ObsExceso();
        miModelo.addObserver(miObservador);

        IU.crearVentana();
    }

    /**
     * Se comunica con Model para crear un coche y despues con Vista para indicar al usuario de que se ha creado el coche
     * @param modelo del coche que queramos crear
     * @param matricula del coche que queremos crear
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Se comunica con Model para bajar la velocidad de un coche y después con Vista para indicar al usuario la nueva velocidad
     * @param matricula del coche al que le queremos bajar velocidad
     */
    public static void bajarVelocidad(String matricula){
        int aux = miModelo.bajarVelocidad(matricula);
        miVista.muestraVelocidad(matricula, aux);
    }
    /**
     * Se comunica con Model para subir la velocidad de un coche y después con Vista para indicar al usuario la nueva velocidad
     * @param matricula del coche al que le queremos aumentar velocidad
     */
    public static void aumentarVelocidad(String matricula){
        int aux = miModelo.subirVelocidad(matricula);
        miVista.muestraVelocidad(matricula,aux);
    }
}