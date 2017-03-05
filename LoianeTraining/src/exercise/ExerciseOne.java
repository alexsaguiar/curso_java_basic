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
public class ExerciseOne {
    
    /*
     1 - Exercise do Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    Faça um programa que peça dois números e imprima o maior deles.
    */
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        double num1 = input.nextDouble();
        System.out.println("Informe outro número: ");
        double num2 = input.nextDouble();
        
        if (num1 > num2){
            System.out.println("O número maior é: " + num1);
        } else {
            System.out.println("O número maior é: " + num2);
        }
    }
}
