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
public class ExerciseFourteen {

    /*
    http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
    
    14 - faça um programa que leia duas notas de um aluno e faça a media para 
    que ele se encaixa nas seguintes situações:
    
    - 9 a 10  nota A
    - 7.5 a 9 nota B
    - 6 a 7.5 nota C
    - 4 a 6   nota D
    - 4 a 0   nota E
    
    deve aparecer entre a,b,c "Aprovado" e d,e "Reprovado"
    
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = input.nextDouble();
        System.out.println("informe a segunda nota do aluno: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media < 4) {
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento) {
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno está Aprovado.");
                break;
            case "D":
            case "E":
                System.out.println("Aluno está Reprovado.");
                break;
        }
    }

}
