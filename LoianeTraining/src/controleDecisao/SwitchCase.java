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
public class SwitchCase {

    /*
    aula do loiane.training Curso java basico 15
    
    Switch e Case
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número relacionado ao dia da semana entre 1 - 7: ");

        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default : System.out.println("Informe um número da semana válido.");
        }
    }
}
