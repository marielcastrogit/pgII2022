import javax.swing.*;
import java.awt.*;
/*
 * 3. Dibujar un tri�ngulo con
drawLine()
 */
public class Draw_A_Triangle_3 extends JComponent {
	 protected void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        g.drawLine(120, 130, 280, 130);
	        g.drawLine(120, 130, 200, 65);
	        g.drawLine(200, 65, 280, 130);
	    }

	    public Dimension getPreferredSize() {
	        return new Dimension(500, 300);
	    }


	    public static void main(String[] args) {

	        JFrame jFrame = new JFrame();
	        jFrame.add(new Draw_A_Triangle_3());
	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        jFrame.pack();
	        jFrame.setVisible(true);
	    }
}
