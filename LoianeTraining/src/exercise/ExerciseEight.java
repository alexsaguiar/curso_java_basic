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
public class ExerciseEight {
    
    
        /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    8 - faça um programa que pergunte o preço de tres produtos e informe qual produto você deve
    comprar, sabendo que a decisão é sempre o preço do produto mais barato.
     */
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o preço do produto 1: ");
        double preco1 = input.nextDouble();
        System.out.println("Informe o preço do produto 2: ");
        double preco2 = input.nextDouble();
        System.out.println("Informe o preço do produto 3: ");
        double preco3 = input.nextDouble();
        
        if (preco1 <= preco2 && preco1 <= preco3){
           System.out.println("O menor preço é do produto 1" + preco1);
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("O menor preço é do produto 2 " + preco2);
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("O menor preço é do produto 3 " + preco3);
        }
    }
}