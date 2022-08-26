import java.util.Scanner;

public class SomarDoisNumeros {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		//variaveis
		int soma;
		int x;
		int y;
		
		//coletar dados
		System.out.print("Digite o primeiro numero: ");
		x = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		y = sc.nextInt();
		
		//calular
		soma= x + y;
		
		//resultado
		System.out.println("Resultado da soma: " + soma);
		
		
	}
	
}