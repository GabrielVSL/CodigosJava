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
    
    static int feminino = 0;
    static int masculino = 0;
    static int idadeTotalFeminino = 0;
    static int idadeTotalMasculino = 0;
    
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
        
        System.out.println("Qual o seu genero?");
        System.out.println("Digite 'F' para feminino e 'M' para masculino");
        String sexo = s.nextLine();
        validarSexo(sexo);
        
        System.out.println("Digite sua data de nascimento:");
        System.out.println("dia:");
        int dia = s.nextInt();
        
        System.out.println("mes:");
        int mes = s.nextInt();
        
        System.out.println("ano:");
        int ano = s.nextInt();
        
        String data = ajustarData(dia, mes, ano);
        SomarIdade(ano, sexo);
        
        return new Funcionario(nome, sexo, data);
    }
    
    public static String ajustarData(int dia, int mes, int ano) {
        return dia + "/" + mes + "/" + ano;
    }
    
    public static void validarSexo(String sexo){
        if (sexo.charAt(0) == 'f' || sexo.charAt(0) == 'F') {
            feminino++;
        }
        else if (sexo.charAt(0) == 'm' || sexo.charAt(0) == 'M') {
            masculino++;
        }
    }
}
    
    public static String imprimirFuncionario(Funcionario funcionario){
        return "Nome: " + funcionario.nome + "\nSexo: " + funcionario.sexo + "\nData de Nascimento: " + funcionario.dataNascimento + "\n";
    }
    
    public static int porcentualFeminino(int funcionarios){
        return (100 / funcionarios) * feminino;
    }
    
    public static int porcentualMasculino(int funcionarios){
        return (100 / funcionarios) * masculino;
    }
    
    public static int mediaIdadeFuncionarios(int funcionarios){
        return (idadeTotalFeminino + idadeTotalMasculino) / funcionarios;
    }
    
    public static int mediaIdadeFeminino(){
        return idadeTotalFeminino / feminino;
    }
    
    public static int mediaIdadeMasculino(){
        return idadeTotalMasculino / masculino;
    }
    
    public static void SomarIdade(int ano, String sexo) {
        if (sexo.charAt(0) == 'f' || sexo.charAt(0) == 'F') {
            idadeTotalFeminino += (2025 - ano);
        }
        else if (sexo.charAt(0) == 'm' || sexo.charAt(0) == 'M') {
            idadeTotalMasculino += (2025 - ano);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int funcionarios = 0;
        
        while (funcionarios < 10){
            System.out.println("Quantidade de funcionarios a serem cadastrados:");
            funcionarios = scan.nextInt();
            
            if (funcionarios < 10) {
                System.out.println("O numero de funcionarios deve ser no minimo 10!\n");
            }
        }
        
        Funcionario[] arrayFuncionarios = new Funcionario[funcionarios];
        
        //Cadastrar
        for (int i = 0; i < funcionarios; i++) {
            System.out.println(" --- CADASTRO DO FUNCIONARIO " + (i + 1) + " ---");
            arrayFuncionarios[i] = Funcionario.cadastroFuncionario();
            System.out.println(" ");  
        }
        
        //Lista dos Funcionarios
        System.out.println("FUNCIONARIOS:\n");
        for (int i = 0; i < funcionarios; i++) {
            System.out.println(imprimirFuncionario(arrayFuncionarios[i]));           
        }
        
        //Quantidade de Funcionarios
        System.out.println("funcionarios totais: " + funcionarios + "\n");
        
        //Percentual feminino
        System.out.println("A quantidade de funcionarias e de: " + feminino);
        System.out.println("Porcentual de: " + porcentualFeminino(funcionarios) + "%\n");
        
        //Percentual masculino
        System.out.println("A quantidade de funcionarios e de: " + masculino);
        System.out.println("Porcentual de: " + porcentualMasculino(funcionarios) + "%\n");
        
        //Idade Media Funcionarios
        System.out.println("A media de idade dos funcionarios e de: " + mediaIdadeFuncionarios(funcionarios));
        
        //Idade Media Feminino
        System.out.println("\nA media de idade feminina e de: "+ mediaIdadeFeminino());
        
        //Idade Media Masculino
        System.out.println("\nA media de idade masculina e de: "+ mediaIdadeMasculino());
    }
}
