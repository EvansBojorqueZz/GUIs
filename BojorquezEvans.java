import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BojorquezEvans extends JFrame {
    private JLabel myLabel;
    private JTextField textField;
    private JButton button;
    private JLabel resultLabel;

    public BojorquezEvans() {
        // Configuración de la ventana
        setTitle("Escriba un número");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Etiqueta inicial
        myLabel = new JLabel("Escriba un numero");
        add(myLabel);

        // Caja de texto para ingresar el número
        textField = new JTextField(10); // Campo de texto con ancho de 10 columnas
        add(textField);

        // Botón que, al presionarlo, muestra el número ingresado
        button = new JButton("Mostrar número");
        add(button);

        // Etiqueta para mostrar el número ingresado (inicialmente vacía)
        resultLabel = new JLabel();
        add(resultLabel);

        // Acción del botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto
                String inputText = textField.getText();

                // Mostrar el número en la etiqueta resultLabel
                resultLabel.setText("Número ingresado: " + inputText);
            }
        });

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de MyJFrame para mostrar la ventana
        new BojorquezEvans();
    }
}
