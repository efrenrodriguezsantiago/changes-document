import java.util.Scanner;

import javax.swing.JOptionPane;

public class positivo_negativo {

	public static void main(String[] args) {
		// LEER UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO EL PROCESO SE REPETIRAHASTA QUE SE INTRODUZCA UN 0
		Scanner entrada = new Scanner(System.in);
		
		int numero,cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
		
			while(numero!=0) {
				if(numero >0){
					System.out.println("el numero "+numero+" es positivo");
				}
				else {
					System.out.println("el numero "+numero+" es negativo");
				}
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite otro numero"));	
				
			}
			
		
	}

}
