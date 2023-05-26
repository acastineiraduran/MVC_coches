import javax.swing.*;

/**
 * Contiene metodos que disparan ventanas con mensajes para el usuario
 */
public class Dialog extends JDialog{
    private JPanel panel1;
    private JLabel eVelocidad;


    /**
     * inicializa
     */
    public Dialog(){
        setContentPane(panel1);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * muestra un mensaje por pantalla
     * @param mensajito que queremos que se muestre por pantalla
     */
    public static void vDialogo(String mensajito){
        Dialog dialogo = new Dialog();
        dialogo.pack();
        dialogo.eVelocidad.setText(mensajito);
        dialogo.setVisible(true);
    }
}
