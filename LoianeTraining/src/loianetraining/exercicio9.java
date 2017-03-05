package loianetraining;

import java.util.Scanner;

public class exercicio9 {
   
            /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 9
     
        Faça um programa que peça a temperatura em graus farenhait, transforme 
    e mostre a temperatura em graus celsius. 
        formula --  C = (5*(F-32)/9)  ou °C = (°F − 32) ÷ 1, 8
                
         */
    
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Está calor hoje ? ");
        System.out.println("Vamos fazer a transformação dos tipos de temperatura entre graus Fahrenhait e Celsius ?");
        System.out.println("Nos informe a temperatura em Farenhait: ");
        double farenhait = scan.nextDouble();
        
        double transformacao = (5*(farenhait - 32)/9);
        
        System.out.println("Resultado em Celsius é: " + transformacao + "°." );
        
    }
    
    
}
