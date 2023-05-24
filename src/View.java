public class View {
    static boolean muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");;
        return true;
    }

    static boolean mostrarCoche(String matricula, String modelo, Integer velocidad){
        Dialog.atributosDialogo("Coche buscado con matricula: " +  matricula + ", modelo: " + modelo + " y velocidad: " + velocidad);
        return true;
    }
}
