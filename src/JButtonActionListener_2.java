import javax.swing.*;
/*
 * 12. Agregue ActionListener a JButton usando
Anonymous Class y Lambda
 */

public class JButtonActionListener_2 {
    static JTextField jTextField;
    static JLabel jLabel;

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Clase anonima y lambda");

        jLabel = new JLabel();
        jLabel.setBounds(50, 150, 350, 40);

        jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);

        JButton jButton = new JButton("Listo");
        jButton.setBounds(50, 100, 100, 30);

        jButton.addActionListener(e -> buttonPressed());
        
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jTextField);
        
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    static void buttonPressed() {
        if (!jTextField.getText().equals("")) {
            jLabel.setText(jTextField.getText());
        } else {
            jLabel.setText("Escriba algo: ");
        }
    }
}