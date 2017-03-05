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
public class ExerciseTwentTwo {
    
    
    
    // verificar erros pois só falta a parte de escolha da maça
    
    
    
            /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        22 - Informações do programa sendo de uma fruteira.
    
                        até 5kg                  acima de 5kg
        morango     R$ 2,50                      R$ 2,20
        maçã        R$ 1,80                      R$ 1,50
    
        Se o cliente comprar acima de 8kg em frutas ou valor ultrapassar de 
    R$ 25,00 receberá um desconto de 10% de desconto.
        Escreva o algoritimo para ler a quantidade em kg do morando e da maçã.
        informe o valor da compra.
        */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                        
       System.out.println("Escolha o produto (maca/morango): ");
       String produto = input.next();
       
        boolean morango = true;
        boolean maca = false;
        
       switch(produto){
           case "morango" : System.out.println("** Produto Morango **"); break;
           case "maca" : System.out.println ("** Produto Maçã **"); break;
           default : System.out.println("** Produto inválido. Verifique o código **");           
       }
       
       System.out.println("Informe o peso do produto: ");
       double peso = input.nextDouble();       
       
       // valores para peso menor que 5kg
       double valorMorango1 = 2.50;
       double valorMaca1 = 1.80;
       // valores para peso maior que 5kg
       double valorMorango2 = 2.20;
       double valorMaca2 = 1.50;
                         
       double preco1 = (peso * valorMorango1);
       double preco2 = (peso * valorMorango2);
       double preco3 = (peso * valorMaca1);
       double preco4 = (peso * valorMaca2);
              
       double desconto1 = (preco1 * 8)/100;
       double desconto2 = (preco2 * 8)/100;
       double desconto3 = (preco3 * 8)/100;
       double desconto4 = (preco4 * 8)/100;
              
       double total1 = (preco1 - desconto1);
       double total2 = (preco2 - desconto2);
       double total3 = (preco3 - desconto3);
       double total4 = (preco4 - desconto4);
       
        if (peso <= 5  || produto == "morango"){
           System.out.println("Produto: " + produto);
           System.out.println("Valor unitário:       R$ "  + valorMorango1);
           System.out.println("O valor do produto:   R$ " + preco1);
           System.out.println("Desconto:             R$ " + desconto1);
           System.out.println("Total:                R$ " + total1);
       } else if (peso >= 6 || produto == "morango"){
           System.out.println("Produto:              " + produto);
           System.out.println("Valor unitário:       R$ " + valorMorango2);
           System.out.println("O valor do produto:   R$ " + preco2);
           System.out.println("Desconto:             R$ " + desconto2);
           System.out.println("Total:                R$ " + total2);
       } else if (peso <= 5 && produto == "maca"){
           System.out.println("Produto: " + produto);
           System.out.println("Valor unitário:       R$ "  + valorMaca1);
           System.out.println("O valor do produto:   R$ " + preco3);
           System.out.println("Desconto:             R$ " + desconto3);
           System.out.println("Total:                R$ " + total3);
       }   else if (peso >= 6 && produto == "maca"){
           System.out.println("Produto: " + produto);
           System.out.println("Valor unitário:       R$ "  + valorMaca2);
           System.out.println("O valor do produto:   R$ " + preco4);
           System.out.println("Desconto:             R$ " + desconto4);
           System.out.println("Total:                R$ " + total4);
       }
        
    }
}
 