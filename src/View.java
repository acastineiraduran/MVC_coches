public class View {
     boolean muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");;
        return true;
    }

    void muestraExceso(String matricula, Integer v){
        Dialog.vDialogo("¡CUIDADO! El coche con matricula " + matricula + " excede la velocidad máxima permitida (120km/h)");
    }
}
