/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ExerciseFive {
    
   /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    5 - faça um programa para a leitura de duas notas parciais  de um aluno.
    o programa deve calcular a media alcançada de pelo aluno e apresentar.
    - mostrar mensagem 'aprovado' se caso o valor for maior ou igual a 7.
    - mostrar mensagem 'reprovado' se a nota for menor a 7.
    - mostrar 'aprovado com distinção' se a nota for igual a 10.
    */
    
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = input.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1 + nota2)/2;
        
        if(media >= 7 && media <= 9){
            System.out.println("Aprovado");
        } else if (media < 7){
            System.out.println("Reprovado");
        } else if (media >= 10){
            System.out.println("Aprovado com Distinção");
        }
        
        /*  outra forma de resolver 
         if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7){
            System.out.println("Reprovado");
        }
        */
    }
}
