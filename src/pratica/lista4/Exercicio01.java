package pratica.lista4;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		// construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		// irá digitar um número e o programa deve exibir na tela a posição deste número
		// no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		// encontrado!” deve ser exibida na tela.

		// vetor inteiro 10 dadps
		// pesquisar dentro do vetor
		// usuario digita um numero
		// buscar posicao numer(usuario) no vetor caso contrario “Não foi
		// encontrado!”

		int numero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroUsuario;
		boolean achei = false;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numeroUsuario = leia.nextInt();

		for (int i = 0; i <= 9; i++) {
			// System.out.println(i);
			if (numeroUsuario == numero[i]) {
				System.out.println("Numero do Usuario: " + numeroUsuario + ". Posição no array:  " + (i + 1));
				achei = true;
			}

			}
			if (achei == false) {
				;

			System.out.println("Não foi encontrado!");
			
		}

	}

}
