public class View {
    static boolean muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");;
        return true;
    }
}
