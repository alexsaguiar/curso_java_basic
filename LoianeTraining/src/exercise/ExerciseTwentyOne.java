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
public class ExerciseTwentyOne {

    /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        21 - um posto está vendendo o combustivel conforme a tabela abaixo:
        
        caso for alcool.
        - 20 lts desconto 3%.
        - acima de 20 lts desconto 5%.
    
        caso for gasolina.
        - 20 lts desconto 4%.
        - acima de 20 lts desconto 6%.
    
        Escreva um algoritimo que leia o numero de litros vendidos. 
        e o tipo de combustivo como sendo 'A' para alcool e 'G' para gasolina e
    faça o calculo do combustivel colocado no veículo.
        Lembrando que o preço da gasolina é R$ 2,50 e o alcool R$ 1,90 lts.
    
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade a abastecer: ");
        double litros = input.nextDouble();

        System.out.println("Escolha o combustivel ('a'-Alcool/ 'g'-Gasolina): ");
        String tipo = input.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percDesconto = 3;
                // caso for maior que 20 litros irá entrar a opção abaixo.
            } else {
                percDesconto = 5;
            }
            
            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            
            total = litros * precoGas;
        } 
        
        totalDesc = (total / 100) * percDesconto;
        
        double precoApagar = total - totalDesc;
        
        System.out.println("Valor total: " + total);
        System.out.println("Desconto: " + totalDesc);
        System.out.println("Valor a ser pago: " + precoApagar);
    }
}
