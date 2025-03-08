package Lista1;

import java.util.Scanner;

/* Faça um programa que leia um vetor A com 15 elementos inteiros. Em seguida, construa
um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial
correspondente de cada elemento de A. Imprima na tela os vetores A e B. */

public class Questao1 {

    public static int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }
    
    public static int lerNumero() {
        Scanner s = new Scanner(System.in);
            System.out.println("Digite um numero:");
            int n = s.nextInt();
            return n;
    }
    
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];
        
        for (int i = 0; i < 15; i++) {
            A[i] = lerNumero();
        }
        
        for (int i = 0; i < 15; i++) {
            B[i] = fatorial(A[i]);
            System.out.println("!" + A[i] + " = " + B[i]);
        }
    }
}
