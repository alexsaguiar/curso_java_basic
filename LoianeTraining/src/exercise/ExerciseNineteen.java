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
public class ExerciseNineteen {
    
            /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        19 - faça um programa que peça dois numeros e pergunte qual a operação 
    ele deseja fazer. Deve informar se é par ou impar e também se é positivo ou 
    negativo.
        */
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com primeiro número: ");
        int num1 = input.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        int num2 = input.nextInt();
        
        System.out.println("Escolha o tipo da operação + - / *");
        String operacao = input.next();
        
        
        double resultado = 0;
        // Flag variavel
        boolean valida = true;
        
        switch (operacao){
            case "+" : resultado = num1 + num2; break;
            case "-" : resultado = num1 - num2; break;
            case "*" : resultado = num1 * num2; break;
            case "/" : resultado = num1 / num2; break;
            default : System.out.println("Operação inválida");
            valida = false;  // flag 
        }
        
        if (valida){
            if ( resultado >= 0){
                System.out.println("positivo");
            } else {
                System.out.println("Negativo");
            }
        }
        
        if (resultado % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
