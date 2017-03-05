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
public class ExerciseSeventeen {
    
    
            /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        17 - faça um programa que peça um número correspondente a um determinado
    ano e informe se o ano é bissexto ou não.
        */
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Entre com o ano: ");
        int ano = input.nextInt();
        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0) ){
            System.out.println("Este ano" + ano + " é Bissexto");
        } else  {
            System.out.println("Este ano" + ano + " não é Bissexto");
        }
    }
    
}
