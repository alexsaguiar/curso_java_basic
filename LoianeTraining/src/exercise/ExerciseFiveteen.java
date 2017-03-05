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
public class ExerciseFiveteen {
    
    
        /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        15 - faça um programa que peça tres lados de um triangulo.  O programa 
    deve informar se é um triangulo. Verificar os tipos do triangulo como
    equilatero,  isosceles ou escaleno.
    
    dicas
    - tres lados formam um triangulo quando a soma de quaisquer  dois lados 
    forem maior que o terceiro.
    - equilatero = tres lados iguais.
    - isosceles = quaisquer dois lados iguais.
    - escaleno = tres lados diferentes.
        */
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com lado 1: ");
        int lado1 = input.nextInt();
        System.out.println("Entre com o lado 2: ");
        int lado2 = input.nextInt();
        System.out.println("Entre com o lado 3:");
        int lado3 = input.nextInt();
        
        if (((lado1 + lado2) > lado3 ) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
            // tipos de triangulos
            if (lado1 == lado2 && lado1 ==  lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero.");
            } else if (lado1 != lado2 && lado1 !=  lado3 && lado2 != lado3){
                System.out.println("Triângulo Escaleno.");
            } else if (lado1 == lado2 || lado1 ==  lado3 || lado2 == lado3){
                System.out.println("Triângulo Isosceles.");
            }
                
            
            
            
            
        } else {
            System.out.println("Não forma um triangulo.");
        }
    }
    
}
