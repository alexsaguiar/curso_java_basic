package loianetraining;

import java.util.Scanner;

public class exercicio11 {
    
    
    /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 11
    
    Faça um programa que peça dois números inteiro e um real.
    Calcule e mostre:
    a -  o produto do dobro do primeiro com a metade do segundo.
    b - a soma do triplo do primeiro com o terceiro.
    c - o terceiro elevado ao cubo.
    
    */
    
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Informe o primeiro número inteiro: ");
        int primeiro = scan.nextInt();
        System.out.print("Informe o segundo número inteiro: ");
        int segundo = scan.nextInt();
        System.out.print("informe o terceiro e último número real: ");
        double terceiro = scan.nextDouble();
    
        double produto = (primeiro * primeiro + (segundo/2));
        double soma = (primeiro ^ 3) + terceiro;
        //outra forma da soma = primeio * 3 + terceiro;
        //outra forma da soma =  Math.pow(primeiro, 3);
        double elevado = (terceiro * terceiro * terceiro);
               
        System.out.println("O resultado do produto do dobro do primeiro com a metade do segundo número é: " + produto);
        System.out.println("O resultado do triplo do primeiro com o terceiro número é: " + soma);
        System.out.println("O resultado do terceiro número ao cubo é: " + elevado);
        
    }
}
