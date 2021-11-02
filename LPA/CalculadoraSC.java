package br.ucsal;

import java.util.Scanner;

public class CalculadoraSC {
	/*Problema: elabore uma solu��o para implementar uma calculadora das 04 opera��es b�sicas: 
	 * somar, dividir, subtrair e multiplicar utilizando a estrutura switch/case. 
	 * Nessa solu��o o usu�rio dever� informar apenas dois valores e escolher a opera��o que deseja realizar
	 *  em um menu de op��es elaborado com switch/case. Para essa solu��o, considere os seguintes crit�rios:
	 *  a) O usu�rio dever� informar valores iguais ou superiores a 1
	 *  b) No caso da divis�o � poss�vel que o resultado seja um valor decimal
	 *  c) Caso o usu�rio escolha uma opera��o diferente das disponibilizadas,
	 *   o resultado dever� ser valor inv�lido.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1 = 0, valor2 = 0;
		System.out.println("Usu�rio, informe a opera��o: \n(1) Somar \n(2) Subtrair \n(3) Multiplicar \n(4) Dividir ");
		int operacao = sc.nextInt();
		if (operacao >= 1 && operacao <= 4) {
			System.out.println("Informe dois valores iguais ou maiores que 1:");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
		} else {
			System.out.println("Opera��o inv�lida");
		}
		
		switch (operacao) {
		case 1:
			if (valor1 >= 1 && valor2 >= 1) {
				System.out.println("Resultado Final: " + (valor1 + valor2));
			} else {
				System.out.println("Valor informado fora do intervalo solicitado");
			}
			break;
		case 2:
			if (valor1 >= 1 && valor2 >= 1) {
				System.out.println("Resultado Final: " + (valor1 - valor2));
			} else {
				System.out.println("Valor informado fora do intervalo solicitado");
			}
			break;
		case 3:
			if (valor1 >= 1 && valor2 >= 1) {
				System.out.println("Resultado Final: " + (valor1 * valor2));
			} else {
				System.out.println("Valor informado fora do intervalo solicitado");
			}
			break;	
		case 4:
			if (valor1 >= 1 && valor2 >= 1) {
				System.out.println("Resultado Final: " + (valor1 / valor2));
			} else {
				System.out.println("Valor informado fora do intervalo solicitado");
			}
			break;
		} sc.close();

	}

}
