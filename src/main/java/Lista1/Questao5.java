
package Lista1;

import java.util.Scanner;

/* A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados
sobre o salário e número de filhos. Faça um método que leia esses dados para um número
não determinado de pessoas, calcule e exiba a média de salário da população (a condição
de parada pode ser um flag ou a quantidade N). Faça um programa que acione o método. */

public class Questao5 {
    
    static double populaçãoTotal = 0;
    static double salarioTotal = 0;
    
    public static void coletarSalario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva seu salario: ");
        double salario = scan.nextDouble();
        salarioTotal += salario;
    }
    
    public static double coletarNumFilhos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva a quantidade de filhos: ");
        double filhos = scan.nextInt();
        populaçãoTotal += filhos + 1;
        return filhos;
    }
    
    public static double calcularMediaSalario() {
        return salarioTotal / populaçãoTotal;
    }
    
    public static void main(String[] args) {
        
        boolean flag = false;
        int numPessoa = 0;
        double numFilhos = 0;
        
        while (flag == false){
            numPessoa++;
            System.out.println("--- Informacoes Pessoa " + (numPessoa) + " ---");
            coletarSalario();
            numFilhos = coletarNumFilhos();
            if (numFilhos == 0) {
                flag = true;
            }
        }
        System.out.printf("A média salarial dessa população é de: %.2f\n", calcularMediaSalario());
    }
}
