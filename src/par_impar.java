import javax.swing.JOptionPane;

public class par_impar {

	public static void main(String[] args) {
		// LEER UN NUMERO HASTA QUE SE INTRODUZCA UN 0 PARA CADA UNO INDICAR SI ES PAR O IMPAR
		
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
		
			while(numero!=0) {
				if(numero %2 ==0){
					System.out.println("el numero "+numero+" es par");
				}
				else {
					System.out.println("el numero "+numero+" es impar");
				}
				numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite otro numero"));	
				
			} 
		   
		

	}

}
