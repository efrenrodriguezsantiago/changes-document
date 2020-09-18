import javax.swing.JOptionPane;

public class mostrar {

	public static void main(String[] args) {
		// pedir un numero N y mostrar todo los numeros de 1 al N
		int numero,i;
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
		
		i = 1;
		while(i<=numero) {
			System.out.println(i);
			i++;
			
			
		}
		
	}

}
