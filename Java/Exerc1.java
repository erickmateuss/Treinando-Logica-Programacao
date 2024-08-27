// Escrever um programa que receba dois n�meros e ao final mostre a soma,
// subtra��o, multiplica��o e a divis�o dos n�meros lidos.


package aula01;

import java.util.*;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Digite o primeiro número: ");
		int number1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int number2 = sc.nextInt();

		int soma = number1 + number2;

		int  subtracao;
		if(number1 > number2) {
			subtracao = number1 - number2;
		}else
			subtracao = number2 - number1;

		int  multiplicacao = number1 * number2;

		double divisao = ((double) number1 / number2);


		System.out.println("A soma entre os número " + number1 + " mais o número " + number2 + " é igual a " + soma);
		System.out.println("A subtração entre os número " + number1 + " mais o número " + number2 + " é igual a " + subtracao);
		System.out.println("A multiplicação entre os número " + number1 + " mais o número " + number2 + " é igual a " + multiplicacao);
		System.out.println("A divisão entre os número " + number1 + " mais o número " + number2 + " é igual a " + divisao);

    }
}