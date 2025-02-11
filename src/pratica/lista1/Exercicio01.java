package pratica.lista1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	

		
		float novoSalario;
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite o salario atual: ");
		float salario;
		
		salario = Scanner.nextFloat();
		
		System.out.println("Digite o Abano: ");
		float abono;
		
		abono = Scanner.nextFloat();
		
		novoSalario = (salario + abono);
		
		System.out.println("O novo salario é de: " + novoSalario);
		
		
		
		

	}

}
