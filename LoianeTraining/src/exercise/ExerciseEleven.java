package exercise;

import java.util.Scanner;

public class ExerciseEleven {
       
  /*
      Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    11 - As organizações Tabajara resolveram aumentar o salário de seus funcionários 
    e lhe contrataram para fazerem o programa que calcule esse reajuste.
    
    Faça um programa que informe o salário do funcionario e o reajuste segundo a 
     seguinte critérios. Baseado no salário atual
    
    a - Salário até R$ 280,00 - reajuste de 20%.
    b - Salário de R$ 280,00  até R$ 700,00 - reajuste de 15%.
    c - Salário de R$ 700,00 até R$ 1500,00 - reajuste de 10%.
    d - Salário de R$ 1500,00 endiante - reajuste de 5%.
    
    Mostrar na tela as seguintes informações:
    
     - O salário antes do reajuste.
     - O percentual de reajuste aplicado.
     - O valor do aumento.
     - O novo salário após o aumento.
    
  */
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Este programa é destino para o cálculo do percentual ou reajuste do salário.");
        System.out.println("");
        System.out.println("Informe o valor do salário base: ");
        double salBase = input.nextDouble();
        System.out.println("");
        
        
        int taxa1 = 5;
        int taxa2= 10;
        int taxa3 = 15;
        int taxa4 = 20;
        
        double reajuste1 = (salBase * taxa1)/100;
        double reajuste2 = (salBase * taxa2)/ 100;
        double reajuste3 = (salBase * taxa3)/100;
        double reajuste4 = (salBase * taxa4)/100;
        
        double salAtual1 = (reajuste1 + salBase);
        double salAtual2 = (reajuste2 + salBase);
        double salAtual3 = (reajuste3 + salBase);
        double salAtual4 = (reajuste4 + salBase);
        
        if (salBase <= 279.99){
                // valor do reajuste neste valor é de 20%.
                System.out.println("O valor do salário base é " + "R$ " + salBase);
                System.out.println("A taxa utilizada foi " + taxa4 + "%.");
                System.out.println("O reajuste foi no valor de " + "R$ " + reajuste4);
                System.out.println("O valor do salário atual é " + "R$ " + salAtual4);
        } else if (salBase >= 280 && salBase <= 699.99) {
                // valor do reajuste neste valor é de 15%.
                System.out.println("O valor do salário base é " + "R$ " + salBase);
                System.out.println("A taxa utilizada foi " + taxa3 + "%.");
                System.out.println("O reajuste foi no valor de " + "R$ " + reajuste3);
                System.out.println("O valor do salário atual é " + "R$ " + salAtual3);
        } else if (salBase >= 700 && salBase <= 1499.99){
                // valor do reajuste neste valor é de 10%.
                System.out.println("O valor do salário base é " + "R$ " + salBase);
                System.out.println("A taxa utilizada foi " + taxa2 + "%.");
                System.out.println("O reajuste foi no valor de " + "R$ " + reajuste2);
                System.out.println("O valor do salário atual é " + "R$ " + salAtual2);            
        } else if (salBase >= 1500){
                // valor do reajuste neste valor é de 5%.
                System.out.println("O valor do salário base é " + "R$ " + salBase);
                System.out.println("A taxa utilizada foi " + taxa1 + "%.");
                System.out.println("O reajuste foi no valor de " + "R$ " + reajuste1);
                System.out.println("O valor do salário atual é " + "R$ " + salAtual1);  
        }
    }
}
        /* outra forma de fazer o exercicio
        
        System.out.println("Informe o Salario: ");
        Double salario = input.nextDouble();

        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario < 280 && <= 700){
           percentual = 15;
        } else if (salario > 700 && <= 1500){
           percentual = 10;
        } else if (salario >= 1500){
           percentual = 5;
        }            
        
        double aumento = (salario / 100) * percentual;
        double salarioAtual = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salario Atual: " + salarioAtual);
        

        */