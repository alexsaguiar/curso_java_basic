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
public class ExerciseSix {

    /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    6 - faça um programa que leita tres numeros e mostre o maior deles.
    
    
    exercicio ok corrigido
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = input.nextDouble();
        System.out.println("informe o terceiro número: ");
        double num3 = input.nextDouble();
         
        if (num1 >= num2 && num1 >= num3){
            System.out.println("O número maior é num1: " + num1);
        } else if (num2 >= num3 && num2 >= num1) {
            System.out.println("O número maior é num2: " + num2);
        } else if (num3 >= num1 && num3 >= num1) {
            System.out.println("O número maior é num3: " + num3);
        }
    }

}
