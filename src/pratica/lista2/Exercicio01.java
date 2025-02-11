package pratica.lista2;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		int valorA, valorB, valorC;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("DIgite o valor A: ");
		valorA = Scanner.nextInt();
		Scanner.nextLine();
		
		System.out.println("DIgite o valor B: ");
		valorB = Scanner.nextInt();
		Scanner.nextLine();
		
		System.out.println("Digite o valor C: ");
		valorC = Scanner.nextInt();
		Scanner.nextLine();
		
		if (valorA + valorB > valorC) {
			System.out.println("A Soma de A + B é Maior do que C");
		}else if (valorA + valorB < valorC) {
			System.out.println("A Soma de A + B é Menor do que C");	
		}else {
			System.out.println("A Soma de A + B é Igual a C");
			
			
		}
		
		
		

		
	}

}
