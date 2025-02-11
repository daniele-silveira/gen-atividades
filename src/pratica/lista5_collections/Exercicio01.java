package pratica.lista5_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe String. O programa deverá solicitar ao usuário, que ele digite via
		 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em
		 * seguida, faça o que se pede: Mostre na tela todas as cores que foram
		 * adicionadas. Mostre na tela todas as cores que foram adicionadas ordenadas em
		 * ordem crescente.
		 *
		 *
		 */
		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a cor: " + i + ":");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		leia.close();
		

		//percorre cada item da lista

		for (String cor : cores) {
			System.out.println("Cores adicionadas:" + cor);

		}
		
		System.out.println("Nomes ordenados em ordem crescente: ");
		cores.sort(null);
		System.out.println(cores);

	}

}
