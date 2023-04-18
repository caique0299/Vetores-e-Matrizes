package ArreyVetoreMatriz;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        
        // Lendo as notas dos alunos
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do aluno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = entrada.nextDouble();
            }
        }
        
        // Calculando as médias dos alunos
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma/4;
        }
        
        // Exibindo as médias dos alunos
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d: %.1f\n", (i+1), medias[i]);
        }
        
        entrada.close();
    }
}
