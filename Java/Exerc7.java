// Fa�a um programa que receba um valor que foi depositado e exiba o valor com rendimento ap�s um m�s. 
// Considere fixo o juro da poupan�a em 0.70% a. m.


package aula01;


import java.util.Scanner;

public  class Exerc7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor que você quer depositar: ");
        double deposito = sc.nextDouble();


        System.out.println("Digite quanto vai ser tempo de rendimento: ");
        int meses = sc.nextInt();

        final double taxaJuros = 0.70;

        double valorComJuros = deposito;

        for (int mes = 1; mes <= meses; mes++ ) {
            valorComJuros += valorComJuros * (taxaJuros / 100);
        }
        System.out.printf("Após %d mês, o valor com o rendimento será: R$ %.2f%n", meses, valorComJuros);

        sc.close();



    }

}