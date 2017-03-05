package loianetraining;

import java.util.Scanner;

public class exercicio10 {

    /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 10
    
        Faça um programa que peça a temperatura em graus celsius e transforme  e 
    mostre em graus fahrenhait
    formula --  °F = °C × 1, 8 + 32
                
    */
    
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();
        
        double formula = (celsius * 1.8) + 32;
        
        System.out.println("O resultado em Fahrenhait é: " + formula + "º");
        
    }
}
