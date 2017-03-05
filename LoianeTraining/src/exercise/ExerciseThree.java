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
public class ExerciseThree {
    
        /*
    Exercise in Site http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    3 - faça um programa verificar se uma letra digita é F ou M. Conforme  a letra escrever
    f- feminino, m - masculino , sexo inválido.
    */
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      
        System.out.println("Escolha a letra M ou F para seu sexo: ");
        String sexo = input.nextLine();
 
        switch (sexo){
            case "m": System.out.println("Seu sexo é Masculino"); break;
            case "f": System.out.println("Seu sexo é Feminino"); break;
            default : System.out.println("Escolha a letra correta ao seu sexo.");
            
            
        /* Também pode ser feito da seguinte maneira 
            utilizando o . (ponto) depois da variavel  para chamar a classe 
            especifica do java para a comparação de Strings.
            pode ser tanto:
            -  sexo.equals (faz lembrando que se colocar letra minuscula ele ira ler só lebra minuscula) 
            - sexo.equalsIgnoreCase (sendo que tanto faz se colocar letra minuscula ou maiuscula)
            
        if(sexo.equalsIgnoreCase ("m")){
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase ("f")){
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
            }
         */
        }
       
    }
}
