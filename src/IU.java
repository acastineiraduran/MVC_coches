import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU {
    private JPanel panel1;
    private JButton bCrear;
    private JTextField tModelo;
    private JTextField tMatricula;
    private JLabel eModelo;
    private JLabel eMatricula;
    private JButton button1;
    private JButton button2;
    private JButton btnBuscar;

    public IU() {
        bCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.crearCoche(tModelo.getText(),tMatricula.getText());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarVelocidad(tMatricula.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.aumentarVelocidad(tMatricula.getText());
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            /**
             * Cuando se clicka ese boton se ejcuta el metodo y se le manda el texto de matricula
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.buscarCoche(tMatricula.getText());
            }
        });
    }

    /**
     * inicializa la gui
     */

    public static void crearVentana() {
        JFrame frame = new JFrame("Ventana coches");
        frame.setContentPane(new IU().panel1);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}
