package loianetraining;

import java.util.Scanner;

public class exercicio8 {
    
        /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 8
        
        Faça um programa que pergunte quanto você ganha por hora e o número 
    de horas trabalhada no mês. Calcule e mostre o  total do seu salário no referido mês.
                
         */
    
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Informe o valor de sua hora trabalhada: R$ ");
        double valorHora = scan.nextDouble();
        System.out.print("Informe o número de horas trabalha no mês: ");
        double horaMes = scan.nextDouble();
                
        double resultado = valorHora * horaMes;
        
        System.out.println("Resultado em valor das horas trabalhadas no mês: R$ " + resultado);
        
    }
}
