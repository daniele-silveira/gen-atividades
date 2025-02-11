package pratica.lista3_lacos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		// primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		// ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		// do programa.
		// No intervalo informado, mostre na tela todes os números que são múltiplos de
		// 3 e 5. Veja os exemplos abaixo:

		int numero1, numero2;

		Scanner Scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero inteiro: ");
		numero1 = Scanner.nextInt();

		System.out.println("Digite o segundo numero inteiro: ");
		numero2 = Scanner.nextInt();

		if (numero1 > numero2) {
			System.out.println("Intervalo é inválido");

		}

		System.out.println("Múltiplos de 3 e 5: ");
		for (int i = numero1; i <= numero2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
