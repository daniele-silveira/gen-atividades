package pratica.lista1;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite o Salario Bruto: ");
		float salarioBruto;
		salarioBruto = Scanner.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		float adicionalNoturno;
		adicionalNoturno = Scanner.nextFloat();
		
		System.out.println("Digite o valor de Horas Extras: ");
		float horasExtras;
		horasExtras = Scanner.nextFloat();
		
		System.out.println("Digite o valor de Desconto: ");
		float desconto;
		desconto = Scanner.nextFloat();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5)) - desconto;
		
		System.out.println("Salario Liquido: " + salarioLiquido);
		
		
		
				
		
	}

}
