/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loianetraining;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class execiciosOperadores {

    /* link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        
        Salvei exercicios para fazer na pasta cursoJavaLoianeGroner

     */
    public static void main(String[] args) {

        System.out.println("Exercício do curso JAVA do site da Loiane.training.");
        
        // 1 fazer o "Ola mundo"
        System.out.println("++ Inicio do app ++");
        System.out.println("\"Ola Mundo!\"");
        System.out.println("-- fim do app --");
        System.out.println("");

        // 2 faça um programa que peça um  numero e entao mostre a mensagem 
        // que mostre -  O numero digitado foi: __.
        System.out.println("++ Inicio do app ++");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qualquer número inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número digitado foi: " + numero);
        System.out.println("-- fim do app --");
        System.out.println("");

        // 3 faça um programa que peça dois numeros e que faz a soma.
        System.out.println("++ Inicio do app ++");
        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();
        System.out.println("O números digitados foram: " + numero1 + numero2);
        int soma = numero1 + numero2;
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("-- fim do app --");
        System.out.println("");
                
        // 4 faça um programa que peça quatro notas bimestras e mostre a média.
        
        System.out.println("Coloque abaixo os valores das notas bimestrais de 0 a 10.");
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Informe a quarta nota: ");
        double nota4 = scan.nextDouble();
        System.out.println("As notas do bimestre foram: ");
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("Quarta nota: " + nota4);
        
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média das notas bimestrais são: " + media);
        
        // 5 apartir do exercicio 5 irei fazer um app para cada exercicio 
        
    }
}
