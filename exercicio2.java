package ArreyVetoreMatriz;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

    int[] vetor = new int[10]; // vetor com os números
    int soma = 0, numPares = 0; // variáveis para armazenar a soma dos números e a quantidade de números pares
    double media = 0.0; // variável para armazenar a média dos números

    // lê os números digitados pelo usuário e armazena no vetor
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Digite o " + (i+1) + "º número: ");
        vetor[i] = entrada.nextInt();

        soma += vetor[i]; // soma os números
        if (vetor[i] % 2 == 0) {
            numPares++; // conta a quantidade de números pares
        }
    }

    System.out.println("\nElementos nos índices ímpares:\n");
    for (int i = 1; i < vetor.length; i += 2) {
        System.out.print(vetor[i] + " "); // exibe os elementos nos índices ímpares
    }

    System.out.println("\n\nElementos pares:\n");
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] % 2 == 0) {
            System.out.print(vetor[i] + " "); // exibe os elementos pares
        }
    }

    media = (double) soma / vetor.length; // calcula a média
    System.out.println("\n\nSoma: " + soma);
    System.out.printf("\nMédia: %.2f", media);

    entrada.close();
}
}
