import java.util.Scanner;

import javax.swing.JOptionPane;

public class cuadrado_numero_negativo {

	public static void main(String[] args) {
		// LEER UN NUMERO Y OSTRAR SU CUADRADO REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN NMERO NEGATIVO
		Scanner entrada = new Scanner(System.in);
		
		int numero,cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
		
			while(numero>=0) {
				cuadrado = (int)Math.pow(numero, 2);
				JOptionPane.showMessageDialog(null, "el numero "+numero+"elevado al cuadrado es: ");
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite otro numero"));
			}
		
		
		
	}

}
