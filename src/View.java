/**
 * clase que se comunica con la GUI para mostrar mensajes al usuario
 */
public class View {
    /**
     * muestra nueva velocidad del coche que tiene dicha matricula
     * @param matricula
     * @param v
     * @return
     */
     boolean muestraVelocidad(String matricula, Integer v){
        Dialog.vDialogo("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");;
        return true;
    }

    /**
     * muestra un mensaje de advertencia indicando que se ha superado la velocidad maxima
     * @param matricula
     */
    void muestraExceso(String matricula){
        Dialog.vDialogo("¡CUIDADO! El coche con matricula " + matricula + " excede la velocidad máxima permitida (120km/h)");
    }
}
