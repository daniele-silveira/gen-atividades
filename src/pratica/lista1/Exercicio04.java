package pratica.lista1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		numero1 = Scanner.nextFloat();
		
		System.out.println("Digite o valor 2: ");
		numero2 = Scanner.nextFloat();
		
		System.out.println("Digite o valor 3: ");
		numero3 = Scanner.nextFloat();
		
		System.out.println("Digite o valor 4: ");
		numero4 = Scanner.nextFloat();
		
		float calculo = (numero1*numero2)-(numero3*numero4);
		
		System.out.println("Diferença entre os produtos: " + calculo);
		
		
		
		
	}
}
