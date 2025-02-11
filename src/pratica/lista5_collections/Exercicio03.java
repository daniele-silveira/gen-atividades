package pratica.lista5_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {
	public static void main(String[] args) {

		// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
		// Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
		// teclado 10 valores inteiros não repetidos e adicione-os individualmente na
		// Collection Set. Em seguida, faça o que se pede:
		// Mostre na tela todos os elementos da Collection Set, utilizando a Classe
		// Iterator.

		Set<Integer> valores = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número inteiro " + i + ":");
			Integer valor = leia.nextInt();
			valores.add(valor);

		}
		leia.close();
		
//		for (Integer valor : valores) {
//			System.out.println(valor);
//		}

		
		//percorre cada item da lista
		Iterator<Integer> iValores = valores.iterator();

		while (iValores.hasNext()) {
            System.out.println("Lista dados Set: " + iValores.next());
		}

	}

}
