package pratica.lista2;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		int qtde;
		float valor_total= 0;
		float preco;
		String produto = "";
		
		
		System.out.println("Faça seu pedido: ");
        System.out.println("1 - Cachorro Quente - R$ 10.00");
        System.out.println("2 - X-Salada - R$ 12.00");
        System.out.println("3 - X-Bacon - R$ 14.00");
        System.out.println("4 - Bauru - R$ 11.00");
        System.out.println("5 - Refrigerante - R$ 5.00");
        System.out.println("6 - Suco de Laranja - R$ 6.00");
		
        
        System.out.print("Digite o código do produto: ");
		opcao = leia.nextInt();
		
		System.out.print("Digite a quantidade desejada: ");
        qtde = leia.nextInt();

		
		switch (opcao) {
        	case 1:
        		produto = "Cachorro Quente";
        		valor_total = qtde * 10.00f;
        		break;
        	case 2:
        		produto = "X-Salada";
        		valor_total = qtde * 12.00f;
        		break;
			case 3:
				produto = "X-Bacon";
				valor_total = qtde * 14.00f;
				break;
			case 4:
				produto = "Bauru";
				valor_total = qtde * 11.00f;
				break;
			case 5:
				produto = "Refrigerante";
				valor_total = qtde * 5.00f;
				break;
			case 6:
				produto = "Suco de Laranja";
				valor_total = qtde * 6.00f;
				break;
			default:
				System.out.println("Opçoes de 1 a 6");
				
				
				
								
			}
		System.out.println("Você comprou " + qtde + " unidade(s) de " + produto);
        System.out.println("Valor total da compra: R$: " +  valor_total);
		
	}

}
