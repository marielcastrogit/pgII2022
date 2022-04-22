import java.awt.*;
import javax.swing.*;

/*
 * 2. Usa java.awt, javax.swing y drawPolygon para
dibujar un triángulo
 */

public class Draw_A_Triangle_2 extends JPanel {
    public void paintComponent(Graphics g) {
        int [] x = {50,100,0};
        int [] y = {0,100,100};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Dibujando un triangulo con drawPolygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 200);
      
        Draw_A_Triangle_2 panel = new Draw_A_Triangle_2();
        frame.add(panel);
        frame.setVisible(true);
    }
}
