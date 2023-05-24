import javax.swing.*;

public class Dialog extends JDialog{
    private JPanel panel1;
    private JLabel jdVelocidad;
    private JLabel jdAtributos;

    /**
     * parametros para iniciar la clase
     */
    public Dialog(){
        setContentPane(panel1);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * ventana que muestra el mensaje al cambiar la velocidad
     * @param mensajito
     */
    public static void vDialogo(String mensajito){
        Dialog dialogo = new Dialog();
        dialogo.pack();
        dialogo.jdVelocidad.setText(mensajito);
        dialogo.setVisible(true);
    }

    /**
     * ventana que muestra al buscar un coche
     * @param mensajito
     */
    public static void atributosDialogo(String mensajito){
        Dialog dialogo = new Dialog();
        dialogo.pack();
        dialogo.jdVelocidad.setText(mensajito);
        dialogo.setVisible(true);
    }
}
