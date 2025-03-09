
package Lista1;

import java.util.Scanner;

/* Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem
crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto (N deve ser lido do teclado) */

public class Questao6 {
    
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
            
            int maior = Integer.MIN_VALUE;
            int meio = 0;
            int menor = Integer.MAX_VALUE;
            
            // Maior e Mneor
            for (int j = 0; j < 3; j++) {
                if (conjunto[i][j] > maior) {
                    maior = conjunto[i][j];
                }
                else if (conjunto[i][j] < menor) {
                    menor = conjunto[i][j];
                }
                else if (maior < conjunto[i][j] && conjunto[i][j] < menor) {
                    meio = conjunto[i][j];
                }
            }
            // Meio
            for (int j = 0; j < 3; j++) {
                if (conjunto[i][j] != maior && conjunto[i][j] != menor) {
                    meio = conjunto[i][j];
                }
            }
                conjunto[i][0] = menor;
                conjunto[i][1] = meio;
                conjunto[i][2] = maior;
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
