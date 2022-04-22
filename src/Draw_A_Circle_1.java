import javax.swing.*;
import java.awt.*;
/*
 * 4. Dibujar un círculo con la función 
 * drawOval() 
 */
public class Draw_A_Circle_1  extends JFrame {

    public Draw_A_Circle_1(){
        setTitle("Dibujando un circulo");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(150, 150, 100, 100);

    }

    public static void main(String[] args) {

       new Draw_A_Circle_1();

    }
}

