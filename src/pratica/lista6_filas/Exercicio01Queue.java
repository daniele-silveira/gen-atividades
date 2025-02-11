package pratica.lista6_filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Queue {
    public static void main(String[] args) {
        /*
         * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo
         * string, para organizar uma fila por ordem de chegada dos Clientes de um
         * Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1:
         * Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente. 2:
         * Listar todos os Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O
         * programa deve ser finalizado. Caso a fila esteja vazia, o programa deverá
         * informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
         */

        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n        MENU       ");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String cliente = leia.nextLine();
                    fila.add(cliente);
                    System.out.println(cliente + " foi adicionado(a) à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Clientes na fila: " + fila);
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia! Nenhum cliente para retirar.");
                    } else {
                        String clienteRemovido = fila.poll();
                        System.out.println(clienteRemovido + " foi removido(a) da fila.");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Digite opção '1', '2', '3' ou '0' para sair.");
            }
        } while (opcao != 0);

        leia.close();
    }
}