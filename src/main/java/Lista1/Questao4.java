
package Lista1;

import java.util.Scanner;


public class Questao4 {
    
    public static double receberNotas() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva sua nota: ");
        double nota = scan.nextInt();
        return nota;
    }
    
    public static double mediaAritimetica(double nota[]) {
        double notaTotal = 0;
        
        for (int i = 0; i < 3; i++) {
            notaTotal += nota[i];
        }
        return notaTotal/3;
    }
    
    public static double mediaPonderada(double nota[]) {
        double notaTotal = 0;
        notaTotal += nota[0] * 5;
        notaTotal += nota[1] * 3;
        notaTotal += nota[2] * 2;
        
        return notaTotal / 10;
    }
    
    public static void main(String[] args) {
        double nota[] = new double [3];
        
        System.out.println("Vamos calcular suas notas");
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Prova " + (i + 1) + " ---");
            nota[i] = receberNotas();
        }
        
        Scanner scan = new Scanner(System.in);
        String letra;
        System.out.println("Digite 'P' para fazer a media ponderada\nDigite 'A' para fazer a media aritimetica");
        letra = scan.nextLine();
        switch (letra) {
            case "A": System.out.println("A media aritimetica das duas notas e: " + mediaAritimetica(nota));
                break;
            case "P": System.out.println("A media ponderada das duas notas e: " + mediaPonderada(nota));
                break;
            default:
                System.out.println("Opcao incorreta");
        }
    }
}
