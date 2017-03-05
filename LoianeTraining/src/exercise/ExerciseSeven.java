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
public class ExerciseSeven {

    /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    7 - faça um programa que leia tres numeros e mostre o maior e o menor.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Infomre o segundo número: ");
        double num2 = input.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double num3 = input.nextDouble();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O número maior é num1: " + num1);
        } else if (num2 >= num3 && num2 >= num1) {
            System.out.println("O número maior é num2: " + num2);
        } else if (num3 >= num1 && num3 >= num1) {
            System.out.println("O número maior é num3: " + num3);
        }
        
         if (num1 <= num2 && num1 <= num3){
            System.out.println("O número menor é num1: " + num1);
        } else if (num2 <= num3 && num2 <= num1) {
            System.out.println("O número menor é num2: " + num2);
        } else if (num3 <= num1 && num3 <= num1) {
            System.out.println("O número menor é num3: " + num3);
        }

    }
}
