
package Lista1;

import java.util.Scanner;

/* Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem
crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto (N deve ser lido do teclado) */

public class Questao6Simples {
    
    public static void receberNumeros(int conjunto[][], int conjuntos, Scanner scan) {
        for (int i = 0; i < conjuntos; i++) {
            System.out.println("--- Conjunto numero " + (i + 1) + " ---");
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o " + (j + 1) + " numero: ");
                conjunto[i][j] = scan.nextInt();
            }
        }
    }
    
    public static void ordenarConjunto(int conjunto[][], int conjuntos) {
        for (int i = 0; i < conjuntos; i++) {
            // Ordenação simples (Bubble sort) para os 3 números
            for (int j = 0; j < 2; j++) {  // Como temos 3 números, vamos rodar apenas 2 vezes
                for (int k = 0; k < 2 - j; k++) {  // Vamos até o último índice não ordenado
                    if (conjunto[i][k] > conjunto[i][k + 1]) {
                        // Troca os valores
                        int temp = conjunto[i][k];
                        conjunto[i][k] = conjunto[i][k + 1];
                        conjunto[i][k + 1] = temp;
                    }
                }
            }
        }
    }
    
    public static void imprimirConjuntos(int conjunto[][], int conjuntos) {
        for (int i = 0; i < conjuntos; i++) {
            System.out.println("| Conjunto " + (i + 1) + " |");
            for (int j = 0; j < 3; j++) {
                System.out.print(conjunto[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas sequencias serao digitadas?");
        
        int conjuntos = scan.nextInt();
        int conjunto[][] = new int [conjuntos][3];
        
        receberNumeros(conjunto, conjuntos, scan); 
        ordenarConjunto(conjunto, conjuntos);
        imprimirConjuntos(conjunto, conjuntos);
    }
}
