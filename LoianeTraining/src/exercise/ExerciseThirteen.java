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
public class ExerciseThirteen {
    
    /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    13 - Faça um programa que peça um numero que relacione com os dias da semana
    (ex. 1 - segunda,  2 - terça, etc) caso não coincida digite valor invalido
    */

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número correspondente ao dia da semana (1 - 7): ");
        int dias = input.nextInt();
        
        switch(dias){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda - feira"); break;
            case 3: System.out.println("Terça - feira"); break;
            case 4: System.out.println("Quarta - feira"); break;
            case 5: System.out.println("Quinta - feira"); break;
            case 6: System.out.println("Sexta - feira"); break;
            case 7: System.out.println("Sábado"); break;
            default : System.out.println("Valor inválido. Verifique o numero digitado.");
        }
    }
}
