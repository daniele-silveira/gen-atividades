package pratica.lista6_filas;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02Stack {
	public static void main(String[] args) {

		/*
		 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo livro na pilha.
		 * Deve solicitar o nome do livro. 2: Listar todos os livros da Pilha 3: Retirar
		 * um livro da pilha 0: O programa deve ser finalizado. Caso a pilha esteja
		 * vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a
		 * pilha está vazia.
		 */

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();
		int opcao;

		do {
			System.out.println("\n        MENU       ");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.print("Entre com a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome do livro: ");
				String livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("Livro adicionado à pilha!");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("Clientes na fila: " + pilha);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					String livroRemovido = pilha.pop();
					System.out.println(livroRemovido + " foi removido(a) da fila.");
					System.out.println("Clientes na fila: " + pilha.pop());
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida! Digite opção '1', '2', '3', ou '0' para sair");
			}
		} while (opcao != 0);
		leia.close();

	}
}
