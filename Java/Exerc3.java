// Escreva um programa que entre com um
// n�mero e o imprima caso seja maior do que 20.

package aula01;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 20) {
            System.out.println("O número " + numero + " é maior que 20!");
        }else
            System.out.println("O número " + numero + " é menor que 20!");
    }

}