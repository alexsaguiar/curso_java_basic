package loianetraining;

import java.util.Scanner;

public class exercicio12 {
   
        /*
        link dos exercicios 
        http://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        ----------------------------------------------------------------------------
        Salvei exercicios para fazer. Na pasta cursoJavaLoianeGroner
        ----------------------------------------------------------------------------
        
        Exercicio 12
        tendo como dados de entrada a altura de uma pessoa construa um algaritimo
    que calcule seu peso ideal. Usando a seguinte formula:
    Formula -- (72.7*altura) - 58.
    
    */
    
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Informe a sua altura: ");
        double altura = scan.nextDouble();
        
        double formula = (72.7*altura) - 58;
        
        System.out.println("O peso ideal para sua altura é : " + formula);
    }
}
