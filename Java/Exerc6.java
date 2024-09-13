// Elaborar um programa que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em d�lar (US$). 
// O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio.

package aula01;

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor em dolar para a conversão: ");
        double dolar = sc.nextDouble();


        System.out.println("Digite a cotação do dolar: ");
        double cotacao = sc.nextDouble();


        double real = dolar * cotacao;

        System.out.printf("Valor em dolar convertido: %.2f $", dolar);
        System.out.printf("O valor da cotação é de: %.2f ", cotacao);
        System.out.printf("A quantidade em real é de: %.2f ", real);






        sc.close();


    }
}