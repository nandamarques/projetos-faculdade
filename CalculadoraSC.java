package br.ucsal;

import java.util.Scanner;

public class CalculadoraSC {
	/*Problema: elabore uma solução para implementar uma calculadora das 04 operações básicas: 
	 * somar, dividir, subtrair e multiplicar utilizando a estrutura switch/case. 
	 * Nessa solução o usuário deverá informar apenas dois valores e escolher a operação que deseja realizar
	 *  em um menu de opções elaborado com switch/case. Para essa solução, considere os seguintes critérios:
	 *  a) O usuário deverá informar valores iguais ou superiores a 1
	 *  b) No caso da divisão é possível que o resultado seja um valor decimal
	 *  c) Caso o usuário escolha uma operação diferente das disponibilizadas,
	 *   o resultado deverá ser valor inválido.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1 = 0, valor2 = 0;
		System.out.println("Usuário, informe a operação: \n(1) Somar \n(2) Subtrair \n(3) Multiplicar \n(4) Dividir ");
		int operacao = sc.nextInt();
		if (operacao >= 1 && operacao <= 4) {
			System.out.println("Informe dois valores iguais ou maiores que 1:");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
		} else {
			System.out.println("Operação inválida");
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
