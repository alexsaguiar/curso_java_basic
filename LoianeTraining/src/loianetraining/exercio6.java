package loianetraining;

import java.util.Scanner;

public class exercio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 6
        
        Faça um programa que peça o raio de um circulo, calcule e mostre sua área.       
                
         */
        
        System.out.println("Informe o raio do circulo: ");
        double raio = scan.nextDouble();
        System.out.println("O valor informado do circulo foi: " + raio);
        
        double area =  3.14 * raio * raio;
        /*
        outra forma de fazer o calculo:
        formula:
        double area = Math.PI * Math.pow(raio, 2);
        
        também pode utilizar a palavra reservada(constantes) do JAVA combinada com outras 
        contas como conseno, tangente, etc...
        */
        
        System.out.println("A área do circulo é: " + area + (" mts."));
    }

}
