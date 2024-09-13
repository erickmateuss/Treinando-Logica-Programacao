// Escrever um programa que leia o nome de um aluno e
// as notas das tr�s provas que ele obteve no semestre.
// No final informar o nome do aluno e a sua m�dia (aritm�tica).


package aula01;

import java.util.Scanner;

public  class Exerc4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.next().toUpperCase();


        System.out.println("Digite a nota que o aluno obteve no semestre: ");
        double notaAluno1 = sc.nextDouble();
        System.out.println("Digite a nota que o aluno obteve no semestre: ");
        double notaAluno2 = sc.nextDouble();
        System.out.println("Digite a nota que o aluno obteve no semestre: ");
        double notaAluno3 = sc.nextDouble();

        double mediaAluno = (notaAluno1 + notaAluno2 + notaAluno3) / 3;

        System.out.println("A média aritmética do aluno " + nomeAluno + " com as notas \n" + notaAluno1 + ",\n " + notaAluno2+ ",\n " + notaAluno3 + "\n o aluno ficará com a média de: " + mediaAluno );




        sc.close();


    }
}