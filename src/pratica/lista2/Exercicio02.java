package pratica.lista2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
		
		int numero;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero = Scanner.nextInt();
		
		
		if (numero % 2 == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
			
		if (numero > 0) {
	            System.out.println("Número Positivo");
	    } else if (numero < 0) {
	    		System.out.println("Número Negativo");
	    } else {
	           System.out.println("O número é neutro");
	       		
	
		}
		

	}

}
