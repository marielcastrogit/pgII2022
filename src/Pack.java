import java.awt.*;
import javax.swing.*;
/*
 * 10. Uso del Método Pack()
 */
public class Pack extends JFrame {
   public Pack() {
	   
      setTitle("Botones usando el metodo pack()");
      setLayout(new FlowLayout());
      setButton();

  
      pack();
     
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   void setButton() {
      for(int i=1; i < 9; i++) {
         add(new JButton("Click en el boton n°" +i));
      }
   }
   public static void main(String args[]) {
      new Pack();
   }
}