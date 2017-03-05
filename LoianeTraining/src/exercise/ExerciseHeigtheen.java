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
public class ExerciseHeigtheen {
    
            /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        18 - faça um programa que peça um numero e informe se é par ou impar.
        dica 
        -  utilize o operadore modulo '%' para saber o resto da divisão
        */
    
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int numero  = input.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Número par ");
        } else {
            System.out.println("Número Impar.");
        }
    }
}
