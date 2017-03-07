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
public class ExerciseTwentyThree {

    /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        23 - Valores para o programa.
    
                    até 5kg       acima de 5kg
    file duplo     4,90           5,80
    alcatra        5,90           6,80
    picanha        6,90           7,80
    
    
    para atender todos os clientes. cada cliente poderar levar apenas um dos 
    tipos da carne da promoção. porem nao ha limite da quantidade por cliente.
        se a compra for feita no cartao do mercado tera desconto de 5%.
        Escreva um programa que peça a quantidade da carne  e formule um cupom 
    fiscal, contendo informações da compra, sendo:
     - o tipo e quantidade da carne
     - preço total.
     - tipo de pagamento
     - valor do desconto.
    
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tipo da Carne: ");
        System.out.println("Tipos");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        int tipo = input.nextInt();

        System.out.println("Entre com a quantidade (kg): ");
        double quantidade = input.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {
            System.out.println(quantidade + " Filé Duplo.");

            if (quantidade < 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }

        } else if (tipo == 2) {
            System.out.println(quantidade + " Alcatra.");

            if (quantidade < 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }

        } else if (tipo == 3) {
            System.out.println(quantidade + " Picanha.");

            if (quantidade < 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }
        }
        
        double total = quantidade * precoKg;
        System.out.println(quantidade + "Kg * " + precoKg +  " = " + total);
        
        System.out.println("Compra no cartão? Digite 1 para sim.");
        int cartao = input.nextInt();
        
        if (cartao == 1){
                double desconto =(total/100) * 5;
                System.out.println("Desconto de " + desconto); 
                System.out.println("Valor a pagar = " + (total - desconto));
        } else {
            System.out.println("Valor a pagar = " + total);
        }
            
    }
}
