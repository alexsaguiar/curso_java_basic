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
public class ExerciseTen {
    
    
        /*
    Exercicio do site  http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
   10 - Faça um programa que pergunte em que turno você estuda. Peça para informe m-matutino, v-vespertino ou n-noturno.
    Imprima a mensagem bom dia, boa tarde, boa noite ou então opção inválida conforme o caso.
    */
    
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
    

       
       System.out.println("Nos informe em que período você estuda ? Sendo, (M) para matutino, (V) para vespertino,");
       System.out.println("e por fim (N) para noturno. Em qual desses período você se encaixa ?");
       System.out.println(" Lembrando que as opção deve ser maiúsculas.");
       String periodo = input.next();
       
       System.out.println("");
       
       switch(periodo){
           
           case "m": System.out.println("Você estuda no perído Matutino. "); break;
           case "v": System.out.println("Você estuda no perído Vespertino."); break;
           case "n": System.out.println("Você estuda no perído Noturno. "); break;
           case "M": System.out.println("Você estuda no perído Matutino. "); break;
           case "V": System.out.println("Você estuda no perído Vespertino."); break;
           case "N": System.out.println("Você estuda no perído Noturno. "); break;
           default : System.out.println("Opção inválida. Retorne e verifique se foi digitado correto."); 
       }
    }
}
 


//pode fazer esse exercicio com a conversao de String utilizando o metodo '.IqualsIgnoreCase' na condicional de if

/*
        if(periodo.equalsIgnoreCase ("m")){
            System.out.println("Matutino");
        } else if (perido.equalsIgnoreCase ("v")){
            System.out.println("Vespertino");
        } else if (perido.IqualsIgnoreCase ("n")) {
            System.out.println("Noturno");
            }
*/