import java.util.Scanner;

import javax.swing.JOptionPane;

public class calificaciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir 5 calificaciones 	de alumnos y decir al final si ahy algun reprobado
		
		int calificacion=0;
		boolean reprobado = false;
		
		for(int i=1;i<=10;i++) {
			calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un la calificacion: "));
		
		if(calificacion < 5){//si el numero es negativo
			reprobado = true;
		}
		}
		if(reprobado == true){//si el numero es negativo
			System.out.println("si existe al menos un alumno reprobado: ");
		}
		else {
			System.out.println("no existe un alumnoo reprobado: ");
		}
	}

}
