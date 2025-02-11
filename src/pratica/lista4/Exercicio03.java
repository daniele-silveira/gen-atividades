package pratica.lista4;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//			Todos os elementos da Diagonal Principal
//			Todos os elementos da Diagonal Secundária
//			A Soma de todos os elementos da Diagonal Principal
//			A Soma de todos os elementos da Diagonal Secundária

		// TODO Auto-generated method stub

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int totalDiagonal1 = 0;
		int totalDiagonal2 = 0;

		for (int linha = 0; linha <= 2; linha++) {
			System.out.println(matriz[linha][linha]);
			totalDiagonal1 += matriz[linha][linha];

		}
		System.out.println("O total da soma da diagonal é de: " + totalDiagonal1);
		for (int linha = 0; linha <= 2; linha++) {
			for (int coluna = 2; coluna >= 0; coluna--) {
				System.out.println("Linha: " + linha + " Coluna: " + coluna);

				if (linha + coluna == 2) {
					System.out.println(
							"Linha: " + linha + " Coluna: " + coluna + " Valor da Posição: " + matriz[linha][coluna]);
					totalDiagonal2 += matriz[linha][coluna];

				}

			}
		}
		System.out.println("Total da soma da diagonal é de: " + totalDiagonal2);
	}
}
