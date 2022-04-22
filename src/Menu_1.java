import javax.swing.*;

/*
 * 7. Crear un menú desplegable usando JOptionPane
 */
public class Menu_1 {
	    public static void main(String[] args) {
	        String[] optionsToChoose = {"Uva", "Naranja", "Sandia", "Manzana", "Banana", "Ninguno de los listados"};

	        String frutaFavorita = (String) JOptionPane.showInputDialog(
	                null,
	                "Que fruta te gusta mas?",
	                "Selecciona",
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                optionsToChoose,
	                optionsToChoose[0]);

	        System.out.println("Has elegido la fruta: " + frutaFavorita);
	    }
	
}
