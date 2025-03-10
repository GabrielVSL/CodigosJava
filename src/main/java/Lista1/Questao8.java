/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;

/*    Matriz
    5  10 7  8
    13 4  1  3
    9  2  6  5
    10 7  4  9
 
 - Implemente um algoritmo que exiba a matriz transposta A
 - Implemente um algoritmo que exiba a soma dos quadrados da diagonal secundária
 - Implemente um algoritmo que faça a multiplicação desta matriz por uma constante C
 - Implemente um algoritmo que inverta a 3ª linha com a 3ª coluna
 */
public class Questao8 {
    // Implemente um algoritmo que exiba a matriz transposta A
    public static int[][] matrizTransposta(int matriz[][]) {
        int novaMatriz[][] = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                novaMatriz[i][j] = matriz[j][i];
            }
        }
        return novaMatriz;
    }
    
    public static void imprimirMatrizTransposta(int matrizTransposta[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    //Implemente um algoritmo que exiba a soma dos quadrados da diagonal secundária
    public static int quadradoDiagonalSecundaria(int matriz[][]) {
        int somaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > -1; j--) {
                somaTotal += (matriz[i][j] * matriz[i][j]);
                break;
            }
        }
        return somaTotal;
    }
    
    public static void main(String[] args) {
        int matriz[][] = new int [4][4];
        matriz [0] = new int[] {5,10,7,8};
        matriz [1] = new int[] {13,4,1,3};
        matriz [2] = new int[] {9,2,6,5};
        matriz [3] = new int[] {10,7,4,9};
        
        int matrizTransporta[][] = new int [4][4];
        matrizTransporta = matrizTransposta(matriz);
        imprimirMatrizTransposta(matrizTransporta);
        
        System.out.println(" ");
        
        System.out.println("A soma dos quadrados da diagonal secundaria e igual a" + quadradoDiagonalSecundaria(matriz));
    }
}
