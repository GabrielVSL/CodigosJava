
package DesafioJava;

import java.util.Random;
import java.util.Scanner;

/**

 */

public class SuporteTecnico {
    
    static String[] resposta = {
        "Ola! Estamos analisando o seu problema e logo retornamos com uma solucao",
        "Agradecemos seu contato, Em breve forneceremos uma atualização",
        "Seu caso esta em andamento. Por favor, aguarde enquant investigamos",
        "Verificamos a questao e estamos trabalhnado para resolver o mais rapido possivel",
        "Obrigado pela paciencia! Estamos verificando a situação e voltamos em breve",
        "Seu problema foi registrado. Um dos nossos tecnicos entrara em contato em breve",
        "Estamos com o seu caso em andamento. Obrigado por aguardar",
        "Verificamos e estamos aplicando a correcao. Pedimos desculpas pela inconveniencia",
        "O problema foi indentificado e estamos finalizando a solucao",
        "Ja recebemos sua solicitacao e estamos cuidando disso agora"
    };
    
    public static String RespostaAleatoria(int numAleatorio) {
        return resposta [numAleatorio];
    }
    
    public static int RandomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }
    
    public static void Jogo() {
        String frase = " ";
        Scanner scan = new Scanner(System.in);
        while (!frase.equalsIgnoreCase("tchau")) {
            System.out.println("Escreva sua pergunta: ");
            frase = scan.nextLine();
            int numAleatorio = RandomNum();
            if (frase.equalsIgnoreCase("tchau")) {
                System.out.println("saindo...\n");
                break;
            }
            System.out.println(RespostaAleatoria(numAleatorio));
        }
    }
}
