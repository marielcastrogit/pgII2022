import javax.swing.*;
import java.awt.*;

/*
 * 5. Dibujar un círculo usando la función
drawRoundRect()
 */
public class Draw_A_Circle_2 extends JFrame {

    public Draw_A_Circle_2(){
        setTitle("Drawing a Circle");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRoundRect(40, 50, 90, 90, 200, 200);
    }

    public static void main(String[] args) {

       new Draw_A_Circle_2();

    }
}
