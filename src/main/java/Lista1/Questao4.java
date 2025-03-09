
package Lista1;

import java.util.Scanner;

/* Faça um método que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a
letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, se for
‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). Faça um programa que leia
3 notas de N alunos e acione o procedimento para cada aluno (N deve ser lido do teclado). */

public class Questao4 {
    
    public static double receberNotas() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva sua nota: ");
        double nota = scan.nextInt();
        scan.nextLine();
        return nota;
        
    }
    
    public static void mediaAritimetica(double aluno[][], int alunos) {
        double notaTotal = 0;
        
        for (int i = 0; i < alunos; i++) {
            System.out.println("--- Aluno " + (i + 1) + " ---");
            for (int j = 0; j < 3; j++) {
                notaTotal += aluno[i][j];
            }
            System.out.println("A media aritimetica das notas e: " + notaTotal / 3);
        }
    }
    
    public static void mediaPonderada(double aluno[][], int alunos) {
        double notaTotal = 0;
        
        for (int i = 0; i < alunos; i++) {
            notaTotal = 0;
            System.out.println("--- Aluno " + (i + 1) + " ---");
            
            notaTotal += aluno[i][0] * 5;
            notaTotal += aluno[i][1] * 3;
            notaTotal += aluno[i][2] * 2;
            System.out.println("A media aritimetica das notas e: " + notaTotal / 10);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos que irao calcular as notas: ");
        int alunos = scan.nextInt();
        scan.nextLine();
        
        double aluno[][] = new double [alunos][3];
        
        for (int i = 0; i < alunos; i++) {
            System.out.println("--- ALUNO " + (i + 1) + " ---");
            for (int j = 0; j < 3; j++) {
                System.out.println("--- Prova " + (j + 1) + " ---");
                aluno[i][j] = receberNotas();
            }
        }
        
        String letra;
        System.out.println("Digite 'P' para fazer a media ponderada\nDigite 'A' para fazer a media aritimetica");
        letra = scan.nextLine();
        switch (letra) {
            case "A":
                mediaAritimetica(aluno, alunos);
                break;
            case "P":
                mediaPonderada(aluno, alunos);
                break;
            default:
                System.out.println("Opcao incorreta");
        }
    }
}
