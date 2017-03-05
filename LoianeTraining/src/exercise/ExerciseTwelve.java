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
public class ExerciseTwelve {

    /*
      Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    12 - Faça um program que faça uma folha de pagamento.
        Sabendo que os desconto do imposto de Renda (IR), que depende do salario
    bruto.
    Desconto do sindicato 3%.
    Desconto FGTS  11% do salário  bruto, sendo este valor depositado pela empresa e não do funcionario
    
    O programa devera perguntar ao usuário o valor e quantidade da hora trabalhada verificar se utiliza o vale transporte
    
    - Desconto do IR 5%.
    - Desconto do inss sabendo que é 8%
    - Desconto do vale transporte que é de 6%.
    Sabendo:
    
    Se o salário bruto for abaixo de R$ 900,00 será isento
    Se o salário bruto for até de R$ 1500,00 será descontado 5%
    Se o salário bruto for até de R$ 2500,00 será descontado 10%
    Se o salário bruto for acima de R$ 2500,00 será descontado 20% .
    
    Mostre como se fosse um relatório.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Folha de pagamento.");
        System.out.println("");
        System.out.print("Informe o valor da hora trabalhada: R$ ");
        double valorHora = scan.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhada: ");
        double horaTrab = scan.nextDouble();
        System.out.print("Utiliza vale-transporte (sim ou nao): ");
        String valeTransp = scan.next();
        boolean sim = true;
        boolean nao = false;
        System.out.println("");

        double salBruto = (valorHora * horaTrab);
        double sindicato = (salBruto * 3) / 100;
        double inss = (salBruto * 10) / 100;
        double fgts = (salBruto * 11) / 100;
        double transporte = (salBruto * 6) / 100;
        double taxa1 = (salBruto * 5) / 100;
        double taxa2 = (salBruto * 10) / 100;
        double taxa3 = (salBruto * 20) / 100;

        double salarioLiq1 = (salBruto - sindicato - inss - taxa1 - transporte);
        double salarioLiq2 = (salBruto - sindicato - inss - taxa2 - transporte);
        double salarioLiq3 = (salBruto - sindicato - inss - taxa3 - transporte);
        
        double descIsento = (sindicato - inss - transporte);
        double desconto1 = (sindicato + inss + taxa1 + transporte);
        double desconto2 = (sindicato + inss + taxa2 + transporte);
        double desconto3 = (sindicato + inss + taxa3 + transporte);

        System.out.println("Salário Bruto:           R$ " + salBruto);
        System.out.println("Desc. Sindical:          R$ " + sindicato);
        System.out.println("Desc. INSS:              R$ " + inss);
        System.out.println("Acresc. FGTS:            R$ " + fgts);
        switch (valeTransp) {
            case "sim":
                System.out.println("Vale-Transporte 6%: R$ " + transporte);
                break;
            default:
                System.out.println("Transporte por Responsabilidade do funcionário.");
        }
        
        if (salBruto <= 900) {
            System.out.println("Total de Descontos:      R$ " + descIsento);
            System.out.println("Valor do salário inferior a R$ 900,00 o IR será isento");
        } else if (salBruto > 900 || salBruto <= 1500) {
            System.out.println("Desc. taxa 5% IR:        R$ " + taxa1);
            System.out.println("Total de Descontos:      R$ " + desconto1);
            System.out.println("Salário Liq. :           R$ " + salarioLiq1);
        } else if (salBruto > 1500 || salBruto <= 2500) {
            System.out.println("Desc. taxa 10% IR:       R$ " + taxa2);
            System.out.println("Total de Descontos:      R$ " + desconto2);
            System.out.println("Salário Liq. :           R$ " + salarioLiq2);
        } else if (salBruto > 2500) {
            System.out.println("Desc. taxa 20% IR:       R$ " + taxa3);
             System.out.println("Total de Descontos:     R$ " + desconto3);
            System.out.println("Salário Liq. :           R$ " + salarioLiq3);
            
            
        }
    }
}
