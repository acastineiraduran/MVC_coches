/**
 * se comunica con las clase vista y controlador. tiene el metodo principal
 */
public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();

    /**
     * metodo principal el cual vamos a ejecutar
     * @param args
     */
    public static void main(String[] args) {
        IU.crearVentana();
    }

    /**
     * se comunica con los objetos de vista y modelo para crear el coche, guardarlo en parking e imprimir un mensaje
     * indicando el coche que se ha creado
     *
     * @param modelo
     * @param matricula
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Utilizando el objeto de modelo bajo la velocidad del coche y se la mando al objeto de vista el cual la imprimira
     * @param matricula
     */
    public static void bajarVelocidad(String matricula){
        int aux = miModelo.bajarVelocidad(matricula);
        miVista.muestraVelocidad(matricula, aux);
    }

    /**
     * Utilizando el objeto de modelo subo la velocidad del coche y se la mando al objeto de vista el cual la imprimira
     * @param matricula
     */
    public static void aumentarVelocidad(String matricula){
        int aux = miModelo.subirVelocidad(matricula);
        miVista.muestraVelocidad(matricula,aux);
    }

    /**
     *  LLamo al metodo de la clase Model que me devolvera objeto coche con el cual accederé a sus atributos para
     *  mandarselos al objeto de miVista
     * @param matricula
     */
    public static void buscarCoche(String matricula){
        Coche coche = Model.getCoche(matricula);
        miVista.mostrarCoche(coche.matricula, coche.modelo, coche.velocidad);
    }
}