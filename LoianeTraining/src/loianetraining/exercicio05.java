package loianetraining;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        /* link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        
        Salvei exercicios para fazer na pasta cursoJavaLoianeGroner

         */
        /* Exercicio 5 fazer um programa que faça a transformação de metros para centimetros*/
        
        Scanner scan = new Scanner (System.in);
        
        // Parte para informa os números que serão convertidos.
        System.out.println("Informe o comprimento em metros: ");
        double metro = scan.nextDouble();
        
        System.out.println("O comprimento informado é: "  + metro + (" mts."));
             
        double conversao =  metro * 100;
        
        System.out.println("O resultado da conversão é: " + conversao + (" cm"));  
        
        
    }
}
