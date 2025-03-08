package Lista1;

/* Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A.
Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são
par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar. */


public class Questao2 {
    
    public static void main(String[] args) {
        int[] A = {2,3,4,9,8,7,6,11,31,55};
        int[] ParImpar = new int [2];
    
        ParImpar[0] = 0;
        ParImpar[1] = 0;
        
        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                ParImpar[0]++;
            } else {
                ParImpar[1]++;
            }
        }
        System.out.println("A quantidade de numero pares e de: " + ParImpar[0]);
        System.out.println("A quantidade de numero impares e de: " + ParImpar[1]);
    }
    
}
