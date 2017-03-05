/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleDecisao;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Codicional {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        /**/
        
        System.out.println("Qual a sua idade ? ");
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("É maior de idade.");
            
        }else {
            System.out.println("Não é maior de idade.");
        }
        
        
        
    }
}
