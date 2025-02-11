package pratica.lista3_lacos;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa.

		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int idadeMenor21 = 0;
		int idadeMaior50 = 0;

		while (true) {
			System.out.print("Digite a idade (ou um número negativo para sair): ");
			idade = leia.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				idadeMenor21++;
			} else if (idade > 50) {
				idadeMaior50++;
			}
		}

		leia.close();

		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior50);
	}
}