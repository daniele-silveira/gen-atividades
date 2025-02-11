package pratica.lista1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Elabore um algoritmo em Java que leia 4 notas de um participante, 
		 * em variáveis do tipo float e exiba na tela a média 
		 * final do participante. Veja o exemplo abaixo:
		 * 
		 */
		
		float media;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1;
		nota1 = Scanner.nextFloat();

		System.out.println("Digite a segunda nota: ");
		float nota2;
		nota2 = Scanner.nextFloat();

		System.out.println("Digite a terceira nota: ");
		float nota3;
		nota3 = Scanner.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		float nota4;
		nota4 = Scanner.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média final é: %.1f", media);

	}

}
