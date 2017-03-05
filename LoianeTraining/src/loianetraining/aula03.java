package loianetraining;

import java.util.Scanner;

public class aula03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
            /*
            String primeiroNome = scan.next();
            int idade = scan.nextInt();
            double altura = scan.nextDouble();
            */
            
            // ler uma linha inteira
            System.out.println("Digite seu some completo: ");
            String nomeCompleto = scan.nextLine();
            System.out.println("Seu nome completo é:  " + nomeCompleto);
            
            // ler uma string
            System.out.println("Digite seu primeiro nome: ");
            String primeiroNome = scan.next();
            System.out.println("Seu primeiro nome é: " + primeiroNome);
            
            // ler um inteiro
            System.out.println("Digite a sua idade: ");
            int idade = scan.nextInt();
            System.out.println("Sua idade é: " + idade);
            
            // ler um número fracionado
            
            System.out.println("Digite a sua altura: ");
            double altura = scan.nextDouble();
            System.out.println("A sua altura é: " + altura);
          
            // leitura de todos os objetos na mesma linha
            System.out.println("digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estimação");
            String pNome = scan.next();
            int idad = scan.nextInt();
            byte filhos = scan.nextByte();
            double alt = scan.nextDouble();
            boolean temPet = scan.nextBoolean();
            
            System.out.println("Escreva seu primeiro nome: ");
            System.out.println("Seu primeiro nome é: " + pNome);
            
            System.out.println("Informe sua idade: ");
            System.out.println("Sua idade é: " + idad );
            
            System.out.println("Quantos filhos você tem: ");
            System.out.println("Quantidade de filhos: " + filhos);
            
            System.out.println("Informe sua altura: ");
            System.out.println("Sua altura é: " + alt);
            
            System.out.println("Possui animais de estimação ? ");
            System.out.println("Resposta: " + temPet);
     }
    
}
