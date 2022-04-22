/*
 * Agregue ActionListener a un JButton usando una
clase anónima
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonActionListener_1 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Marco con action listener");

        JLabel jLabel = new JLabel();
        jLabel.setBounds(50, 150, 350, 40);

        final JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);

        JButton jButton = new JButton("Enviar");
        jButton.setBounds(50, 100, 100, 30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jTextField.getText().equals(""))
                    jLabel.setText(jTextField.getText());
                else
                    jLabel.setText("Escriba algo: ");
            }
        });
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jTextField);
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}