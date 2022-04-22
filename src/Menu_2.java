import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * 8. Crear un menú desplegable usando JComboBox
 */

public class Menu_2 {
	public static void main(String[] args) {
        String[] opciones = {"Mango", "Naranja",
        		"Banano", "Mamones", "Guava", "Ninguno de los listados"
};

        JFrame jFrame = new JFrame();

        JComboBox<String> jComboBox = new JComboBox<>(opciones);
        jComboBox.setBounds(80, 50, 140, 20);

        JButton jButton = new JButton("Listo");
        jButton.setBounds(100, 100, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(90, 100, 400, 100);

        jFrame.add(jButton);
        jFrame.add(jComboBox);
        jFrame.add(jLabel);
        
        jFrame.setLayout(null);
        jFrame.setSize(350, 250);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fruta = "Has seleccionado " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
                jLabel.setText(fruta);
            }
        });

    }
}
