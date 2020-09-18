import java.util.Scanner;

import javax.swing.JOptionPane;

public class diez_numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir 10 numeros y mostrar al final si se ha introducido alguno negativo
		int numero=0;
		boolean hay_negativos = false;
		
		for(int i=1;i<=10;i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numeros"));
		
		if(numero < 0){//si el numero es negativo
			hay_negativos = true;
		}
		}
		if(hay_negativos == true){//si el numero es negativo
			System.out.println("si existe al menos un numero negativo: ");
		}
		else {
			System.out.println("no existe un numero negativo: ");
		}
		
	}

}
