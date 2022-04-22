import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
/*
 * 1. Usar java.awt y javax.swing con Path2D para
dibujar un triángulo

 */
public class Draw_A_Triangle_1 extends JPanel{
	public static void main (String [] args){
		 JFrame.setDefaultLookAndFeelDecorated(true);
		 JFrame frame = new JFrame("Triangulo con Path2D");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBackground(Color.white);
		 frame.setSize(200, 200);
		 Draw_A_Triangle_1 panel = new Draw_A_Triangle_1();
		 frame.add(panel);
		 frame.setVisible(true);
		 }
	public void paintComponent(Graphics g) {
		Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(50,
				0),
				 new Point2D.Double(100, 100), new Point2D.Double(0, 100));
				 Graphics2D g2d = (Graphics2D) g.create();
				 g2d.draw(triangleShape);
	}
}


class Triangle_Shape extends Path2D.Double {
	 public Triangle_Shape(Point2D... points) {
	 moveTo(points[0].getX(), points[0].getY());
	 lineTo(points[1].getX(), points[1].getY());
	 lineTo(points[2].getX(), points[2].getY());
	 closePath();
	 }
	}

