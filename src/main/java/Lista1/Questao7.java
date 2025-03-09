
package Lista1;

import java.util.Scanner;

/* Faça uma função que some os valores de dois vetores de tamanho N, ambos recebidos
por parâmetro, e retorne um outro vetor, também de tamanho N, com o resultado da soma
dos dois vetores, só que ao contrário */

public class Questao7 {
    
    public static void receberNumeros(int conjunto[][],int tamanho, Scanner scan) {
        for (int i = 0; i < 2; i++) {
            System.out.println("--- Conjunto numero " + (i + 1) + " ---");
            for (int j = 0; j < tamanho; j++) {
                System.out.println("Digite o " + (j + 1) + " numero: ");
                conjunto[i][j] = scan.nextInt();
            }
        }
    }
    
    public static void ordenarConjunto(int conjunto[][], int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < 2; j++) {  
                for (int k = 0; k < 2 - j; k++) {  
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
    
    public static int[] somarConjuntos(int conjunto[][], int tamanho) {
        int soma[] = new int [tamanho];
        for (int i = 0; i < tamanho; i++) {
            soma[i] = conjunto[0][i] + conjunto[1][i];
        }
        return soma;
    }
    
    public static void imprimirConjunto(int conjunto[], int tamanho) {
            System.out.println("| Soma |");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(conjunto[j] + " ");
            }
            System.out.println(" ");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        scan.nextLine();
        System.out.println("Qual vai ser o tamanho do conjunto?");
        int tamanho = scan.nextInt();
        scan.nextLine();
        
        int conjunto[][] = new int [2][tamanho];
        
        receberNumeros(conjunto, tamanho, scan);
        ordenarConjunto(conjunto, tamanho);
        int soma[] = somarConjuntos(conjunto, tamanho);
        imprimirConjunto(soma, tamanho);
        scan.close();
    }
}
