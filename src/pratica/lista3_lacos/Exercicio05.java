package pratica.lista3_lacos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		// o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		// números digitados, que sejam positivos. Veja o exemplo abaixo:

		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int total = 0;

		do {
			System.out.print("(Digite um numero inteiro (ou 0 para sair): ");
			numero = leia.nextInt();

			if (numero > 0) {
				total += numero;
			}

		} while (numero != 0);

		leia.close();

		System.out.println("Total: " + total);

	}
}
