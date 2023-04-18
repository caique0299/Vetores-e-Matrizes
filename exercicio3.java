package ArreyVetoreMatriz;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        Scanner entrada = new Scanner(System.in);

        // Preenchendo a matriz com os valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Exibindo todos os elementos da diagonal principal
        System.out.print("\nElementos da Diagonal Principal:\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Exibindo todos os elementos da diagonal secundária
        System.out.print("\n\nElementos da Diagonal Secundária:\n");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        // Exibindo a soma dos elementos da diagonal principal
        System.out.print("\n\nSoma dos Elementos da Diagonal Principal:\n" + somaDiagonalPrincipal);

        // Exibindo a soma dos elementos da diagonal secundária
        System.out.print("\n\nSoma dos Elementos da Diagonal Secundária:\n" + somaDiagonalSecundaria);
    }
}
