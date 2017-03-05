package loianetraining;

import java.util.Scanner;

public class exercicio13 {
    
            /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 13
        Faça um programa que pergunte quanto você ganhe por hora e o número 
    de horas trabalhadas no mês.
        - Calcule e mostre o total do salario no refeido mês, sabendo que são 
    descontados 11% para o imposto de renda, 8% para o INSS e 5% para o sindicato.
        - faça um programa que nos dê:
        a - quanto pagou ao INSS.
        b - quanto pagou ao sindicato.
        c - o salario liquido.
            
        d - calcule o desconto e o salario liquido,  conforme a tabela abaixo.
    
        + salario bruto : R$ - IR(11%) : R$ - INSS(8%) R$ - sindicato(5%) : R$ = salario liquido
    
    */

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual o valor da sua hora trabalhada: ");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas por mês você tem trabalhado: ");
        double horaMes = scan.nextDouble();
        
        double salarioBruto = valorHora * horaMes;   
        System.out.println("Total dos ganhos mensal Bruto: R$" + salarioBruto);
        
        double descIr = (salarioBruto * 11)/100;
        System.out.println("Valor a ser descontado referente ao Imposto de Renda: R$ " + descIr);
        
        double descInss = (salarioBruto * 8)/100;
        System.out.println("Valor a ser descontado referente ao INSS: R$ " + descInss);
        
        double descSindicato = (salarioBruto * 5)/100;
        System.out.println("Valor a ser descontado referente ao Sindicato: R$ " + descSindicato);
        
        double totalDesconto = (descIr + descInss + descSindicato);
        System.out.println("Totais de descontos: R$ " + totalDesconto);
        
        double salarioLiquido = (salarioBruto - totalDesconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        
    }
}
