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
public class ExerciseFour {
    
            /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    4 - faça um programa verificar se uma letra digitada é vogal ou uma consoante.
    */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma letra: ");
        String letra = input.nextLine();
        
        switch (letra){
            case "a": System.out.println("A letra digitada é uma vogal."); break;
            case "e": System.out.println("A letra digitada é uma vogal."); break;
            case "i": System.out.println("A letra digitada é uma vogal."); break;
            case "o": System.out.println("A letra digitada é uma vogal."); break;
            case "u": System.out.println("A letra digitada é uma vogal."); break;
            case "A": System.out.println("A letra digitada é uma vogal."); break;
            case "E": System.out.println("A letra digitada é uma vogal."); break;
            case "I": System.out.println("A letra digitada é uma vogal."); break;
            case "O": System.out.println("A letra digitada é uma vogal."); break;
            case "U": System.out.println("A letra digitada é uma vogal."); break;
            default : System.out.println("A letra digitada é uma consoante"); 
            
            /*outra maneira de resolver este exercicio
            if (letra.equalsIgnoreCase("a")) || letra.equalsIgnoreCase("3")) ||
            letra.equalsIgnoreCase("i")) || letra.equalsIgnoreCase("o")) ||
            letra.equalsIgnoreCase("u")){
            System.out.println("E vogal")
          
            } else {
             System.out.println("É consoante");
            } 
            
            
            
            outra maneira
            
            if (letra.length() > 1){
                System.out.println("Não é uma letra válida");
            } else {
            
                    switch (letra){
            case "a": 
            case "e": 
            case "i": 
            case "o": 
            case "u": 
            case "A": 
            case "E": 
            case "I": 
            case "O": 
            case "U": System.out.println("A letra digitada é uma vogal."); break;
            default : System.out.println("A letra digitada é uma consoante"); 
            }
            */
        }
    }
}
