//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

package aula01;

import java.util.*;

public  class Exerc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos litros foram abastecidos: ");
        int litrosAbastecidos = sc.nextInt();

        System.out.println("Quantos quilometros foram rodados: ");
        int quilometroRodados = sc.nextInt();

        double consumoMedio = (double) litrosAbastecidos / quilometroRodados;



        System.out.printf("O consumo médio do automóvel é %.2f km/l1%n", consumoMedio);

        sc.close();

    }
}