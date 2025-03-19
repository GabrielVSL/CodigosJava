package DesafioJava;

import java.util.Random;
import java.util.Scanner;

/*

 */
public class Adivinha {
    
    public static int numAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Gera um numero aleatorio entre 0 e 99
        return numeroAleatorio;
    }
    
    public static int difPositiva(int numero) {
        Random random = new Random();
        int diferencaPositiva = 5 + random.nextInt(6);
        return numero - diferencaPositiva;
    }
    
    public static int difNegativa(int numero) {
        Random random = new Random();
        int diferencaNegativa = 5 + random.nextInt(6);
        return numero + diferencaNegativa;
    }
    
    public static int receberNum() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva sua tentativa:");
        int numero = scan.nextInt();
        return numero;
    }
    
    public static boolean numeroIgual(int numAleatorio, int numTentativa) {
        if (numAleatorio == numTentativa) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void jogo() {
        int numAleatorio = numAleatorio();
        int numTentativa = 100;
        
        int difNegativa = numAleatorio - 50;
        if (numAleatorio - difNegativa < 0) {
            difNegativa = 0;
        }
        
        int difPositiva = numAleatorio + 50;
        if (numAleatorio + difPositiva > 99) {
            difPositiva = 99;
        }
        System.out.println("Tente descobrir o numero aleatorio!");
        while (numeroIgual(numAleatorio, numTentativa) == false) {
            numTentativa = receberNum();
            if (numTentativa != numAleatorio) {
                System.out.println("Numero errado!");
                System.out.println("O numero Aleatorio esta entre " + difNegativa + " e " + difPositiva);
                
                difNegativa = difNegativa(difNegativa);
                if (difPositiva > numAleatorio) {
                    difPositiva = numAleatorio;
                    difPositiva--;
                }
                
                difPositiva = difPositiva(difPositiva);
                if (difPositiva < numAleatorio) {
                    difPositiva = numAleatorio;
                    difPositiva++;
                }
                
            }
        }
        System.out.println("Voce acertou!");
        System.out.println("o numero aleatorio eh: " + numAleatorio);
    }
    
}
