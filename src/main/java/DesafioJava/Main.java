/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafioJava;

import java.util.Scanner;

/**
 *
 * @author Tecnologia
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jogo = 0;
        
        while (jogo != 4) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Adivinhe o numero");
            System.out.println("2 - Adivinhe o numero");
            System.out.println("3 - Adivinhe o numero");
            System.out.println("4 - Sair\n");
            System.out.println("Digite sua opcao:");
            jogo = scan.nextInt();
            switch (jogo) {
                case 1: Adivinha.jogo();
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                default: System.out.println("Numero incorreto, digite novamnete uma das opcoes validas!");
            }
        }
    }
    
}
