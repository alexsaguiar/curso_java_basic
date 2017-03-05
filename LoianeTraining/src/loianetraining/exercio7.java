package loianetraining;

import java.util.Scanner;

public class exercio7 {
        /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 7
        
        Faça um programa que calcule a area de um quadrado,  em seguida mostre o dobro desta area para o usuario.      
                
         */
    
         public static void main (String [] args) {
             
             Scanner input = new Scanner (System.in);
             
             System.out.println("Informe o valor do lado A do quadrado: " );
             double ladoA = input.nextDouble();
             System.out.println("Informe o valor do lado B do quadrado: ");
             double ladoB = input.nextDouble();
             System.out.println("O valor do lado A é:  " + ladoA + " mts." );
             System.out.println("O valor do lado B é:  " + ladoB + " mts." );
             
             double soma = ladoA * ladoB;
             double resultado = soma * 2;
             
             /*
             outra forma de fazer o calculo.
             formula:
             double area  = Math.pow(lado, 2);
             não esquecer de fazer a multiplicação por dois para chegar ao dobro da area.
             no System.out.println("O valor do dobro da área do quadrado é: " + (area * 2)+ " mts.");
             */
             
             System.out.println("A área do quadrado é: "  + soma + " mts.");
             System.out.println("O valor do dobro da área do quadrado é: " + resultado + " mts.");
             
             
         }
}
