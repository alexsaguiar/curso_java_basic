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
public class ExerciseTwo {
    
    /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    2 - Faça um programa que peça um valor  e informe se é positivo ou negativo.
    */

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser análisado: ");
        double valor = input.nextDouble();
        
        if (valor >= 0){
            System.out.println("Valor é positivo" + valor);       
        } else {
            System.out.println("Valor é negativo" + valor);
        }
        
    }
}
