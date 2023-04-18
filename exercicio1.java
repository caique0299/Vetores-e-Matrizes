package ArreyVetoreMatriz;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner entrada = new Scanner(System.in);

	        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 
	        int numProcurado, posicao = -1; 
	        System.out.println("Vetor: ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " "); 
	        }

	        System.out.print("\nDigite o número que você deseja encontrar: ");
	        numProcurado = entrada.nextInt(); 

	      
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numProcurado) {
	                posicao = i; 
	                break; 
	            }
	        }

	  
	        if (posicao != -1) {
	            System.out.println("\nO número " + numProcurado + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("\nO número " + numProcurado + " não foi encontrado!");
	        }

	        entrada.close();
	    }	
	}

