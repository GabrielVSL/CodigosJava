/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;

import java.util.Scanner;

/* Implemente um programa em Java que receba as informações NOME, SEXO e
DATA-NASCIMENTO de no mínimo 10 funcionários de uma determinada empresa e
apresente como resultados:

- Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os
funcionários.

- Ao final do relatório imprimir:
I - a quantidade total de funcionários
II - a quantidade e o percentual total de funcionários do sexo feminino
III - a quantidade e o percentual total de funcionários do sexo masculino
IV - a idade média geral dos funcionários
V - a idade média dos funcionários do sexo feminino
VI - a idade média dos funcionários do sexo masculino */

public class Questao3 {
    
    public static class Funcionario {
    String nome;
    String sexo;
    String dataNascimento;
    
    public Funcionario(String nome, String sexo, String data) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = data;
    }
    
    public static Funcionario cadastroFuncionario() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = s.nextLine();
        
        System.out.println("Digite seu sexo:");
        String sexo = s.nextLine();
        
        System.out.println("Digite sua data de nascimento:");
        System.out.println("dia:");
        int dia = s.nextInt();
        
        System.out.println("mes:");
        int mes = s.nextInt();
        
        System.out.println("ano:");
        int ano = s.nextInt();
        
        String data = ajustarData(dia, mes, ano);
        
        return new Funcionario(nome, sexo, data);
    }
    
    public static String ajustarData(int dia, int mes, int ano) {
        return dia + "/" + mes + "/" + ano;
    }
}
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantidade de funcionarios a serem cadastrados:");
        int funcionarios = scan.nextInt();
        
        Funcionario[] arrayFuncionarios = new Funcionario[funcionarios];
        
        for (int i = 0; i < funcionarios; i++) {
            System.out.println(" --- CADASTRO DO FUNCIONARIO " + (i + 1) + " ---");
            arrayFuncionarios[i] = Funcionario.cadastroFuncionario();
            System.out.println("\n");
        }
    }
}
