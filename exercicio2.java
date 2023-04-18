package ArreyVetoreMatriz;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

    int[] vetor = new int[10]; 
    int soma = 0, numPares = 0; 
    double media = 0.0; 

    
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Digite o " + (i+1) + "º número: ");
        vetor[i] = entrada.nextInt();

        soma += vetor[i]; 
        if (vetor[i] % 2 == 0) {
            numPares++; 
        }
    }

    System.out.println("\nElementos nos índices ímpares:\n");
    for (int i = 1; i < vetor.length; i += 2) {
        System.out.print(vetor[i] + " "); 
    }

    System.out.println("\n\nElementos pares:\n");
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] % 2 == 0) {
            System.out.print(vetor[i] + " "); 
        }
    }

    media = (double) soma / vetor.length; 
    System.out.println("\n\nSoma: " + soma);
    System.out.printf("\nMédia: %.2f", media);

    entrada.close();
}
}
