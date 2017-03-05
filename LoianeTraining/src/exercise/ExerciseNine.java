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
public class ExerciseNine {
    
    /*
    Exercicio do site  http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    9- Faça um programa que peça três números e coloque em ordem decrescente
     
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva três números para que possamos fazer a comparação e coloca-los"
                + "em ordem decrescente");
        
        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.println("Informe o terceiro número: ");
        double num3 = input.nextDouble();
        // 1  possibilidade
        if (num1 <= num2 && num1 <= num3 && num2 <= num3 ){
            System.out.println(num3 + " - "+  num2 + " - " + num1);
            
        } else if (num1 <=num2 && num1 <= num3 && num3 <= num2){
            System.out.println(num2 + " - " + num3 + " - " + num1);
            
        //2 possibilidade
        } else if (num2 <=num1 && num2 <= num3 && num1 <= num3) {
            System.out.println(num3 + " - " + num1 + " - " + num2);
        
        } else if (num2 <=num1 && num2 <= num3 && num3 <= num1) {
            System.out.println(num1 + " - " + num3 + " - " + num2);
       
        //3 possibilidade
        } else if (num3 <=num1 && num3 <= num2 && num1 <= num2) {
            System.out.println(num2 + " - " + num1 + " - " + num3);
           
        } else if (num3 <=num1 && num3 <= num2 && num2 <= num1) {
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }
}
