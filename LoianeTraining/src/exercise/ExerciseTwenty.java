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
public class ExerciseTwenty {
    
            /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
        20 - Faça um programa que tenha cinco perguntas abaixo.
    
        1 - Telefonou para vitima hoje ?
        2 - Este no local do crime ? 
        3 - Mora perto da vitima? 
        4 - Já trabalhou com a vitima ?
        5 - devia para vitima ? 
    
        O programa deve no final emitir a classificação sobre a participação 
    da pessoa no crime. se a pessoa responder positivamente a duas questões 
    ele deve ser classificada como 'suspeita' entre tres ou quatro 'cumplice' 
    e cinco 'assassino'. caso contrario 'inocente'.
    */
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Responda com Sim ou Nao.");
        
        System.out.println("Telefonou para vítima hoje?");
        String resp1 = input.next();
            System.out.println("Esteve no local do crime?");
        String resp2 = input.next();
            System.out.println("Mora perto da vítima?");
        String resp3 = input.next();
            System.out.println("Já trabalhou com a vítima?");
        String resp4 = input.next();
            System.out.println("Devia para vítima?");
        String resp5 = input.next();
        
        int cont = 0;
        
        if (resp1.equalsIgnoreCase("Sim")){
            cont ++;
        }
        
        if (resp2.equalsIgnoreCase("Sim")){
            cont ++;
        }
        
        if (resp3.equalsIgnoreCase("Sim")){
            cont ++;
        }
        
        if (resp4.equalsIgnoreCase("Sim")){
            cont ++;
        }
        
        if (resp5.equalsIgnoreCase("Sim")){
            cont ++;
        }
        
        if (cont == 2){
            System.out.println("Suspeita.");
        } else if (cont ==3 ||  cont == 4){
            System.out.println("Cúmplice.");
        } else if (cont == 5){
            System.out.println("Assassino.");
        } else if (cont == 0 || cont == 1){
            System.out.println("Inocente.");
        }
        
    }
    
}
