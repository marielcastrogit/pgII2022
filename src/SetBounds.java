import java.awt.event.*;  
import javax.swing.*; 
/*
 * 9. Uso del Método SetBounds()
 */

public class SetBounds{  
public static void main(String[] args) {
	JFrame marco =new JFrame();  
	JButton boton =new JButton();
	JLabel etiqueta =new JLabel();  

	boton.setText("Presioname");
	boton.setBounds(30,100,150,68);  
	etiqueta.setBounds(60,60,200,300);  
	
	boton.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
		boton.setText("fui presionado");  
		}  
	});  
	marco.add(boton);
	marco.add(etiqueta);  
	marco.setSize(250,250);
	marco.setLocationRelativeTo(null);
	marco.setLayout(null);  
	marco.setVisible(true);   
	}
} 