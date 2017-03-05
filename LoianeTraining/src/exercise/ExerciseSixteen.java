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
public class ExerciseSixteen {

    /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        16 - Faça um programa que faça o calculo da raizes da equação de segundo 
    grau. formula - ax2 + bx + c.
        Faça a introdução pedindo os valores do a, b, c.
        opção: 
        a - Se o valor de 'A' for igual a zero '0' não informe para não progredir
    e não passar para as demais questões.
        b - se o delta for negativa então não terá uma raiz real então peça
    ao o usuario para encerrar o programa.
        c - se o delta for igual a zero '0' a equação possui uma raiz informe ao usuario.
        d - se delta for positivo, a equação possui duas raizes então informe ao usuario.
     
     */
    //  refazer programa verificar erro 6-2-17
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do número da variável A: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação de Segundo Grau.");
        } else {

            System.out.println("Informe o valor do número da variável B: ");
            double b = input.nextDouble();
            System.out.println("Informe o valor do número da variável C: ");
            double c = input.nextDouble();
            
            double delta = (b*b)  - (4*a*c); 
            
            if (delta < 0){
                System.out.println("Delta negativo");
            }else {
                // o Math.squart ou Math.sqrt para fazer o calculo da raiz quadrada
                double x1 = ((-b) + Math.sqrt (delta)) / (2*a);
                double x2 = ((-b) - Math.sqrt (delta)) / (2*a);   
                
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }
    }
}
