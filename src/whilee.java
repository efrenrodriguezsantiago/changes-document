import java.util.Scanner;

public class whilee {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		//-----------incrementa de 1 al 10
		
		int i =1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		//-------------------decrementa de 10 al 1
		int l = 10;
		
		while (l>=1) {
			System.out.println(l);
			l--;
	}
		//------------------------------
		//cuantos numeros quire copiar en pantalla
		int j = 1,contador;
		
		System.out.println("digite cuantos numeros quiere en pantalla");
		contador = entrada.nextInt();
		
		while(j<=contador) {
			
		System.out.println(j);
		j++;
		}
		//el while primero analiza despues se ejecuta
		
}
}