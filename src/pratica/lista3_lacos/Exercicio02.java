package pratica.lista3_lacos;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		// mostre na tela quantos números são pares e quantos número são ímpares. Veja o
		// exemplo abaixo:

		Scanner scanner = new Scanner(System.in);

		int numero;
		int pares = 0;
		int impares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " número inteiro: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

		}
		System.out.println("Total Pares: " + pares);
		System.out.println("Total Impares: " + impares);

	}

}
