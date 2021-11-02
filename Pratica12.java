package br.ucsal;

import java.util.Scanner;

public class Pratica12 {
	/*Problema: elabore uma calculadora para que a partir de 02 
	 * valores informados pelo usuário assim com a escolha da 
	 * operação que será realizada, o algoritmo apresente o resultado final. 
	 * Se o usuário não escolher nenhuma das 04 operações básicas: 
	 * somar, subtrair, dividir e multiplicar 
	 * o algoritmo deverá informar operação inválida.*/

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double valor1, valor2, resultadoFinal;
         char operacao;
         System.out.println("Usuário, digite o primeiro número: ");
         valor1 = sc.nextDouble();
         System.out.println("Usuário, digite o segundo número: ");
	     valor2 = sc.nextDouble();
		 System.out.println("Informe a operação: (a) Somar, (b) Subtrair, (c) Multiplicação, (d) Divisão");
		 operacao = sc.next().charAt(0);
		 if (operacao == 'a') {
			resultadoFinal = valor1 + valor2;
		 } else if (operacao == 'b') {
			resultadoFinal = valor1 - valor2;
		 } else if (operacao == 'c') {
			resultadoFinal = valor1 * valor2;
		 } else if (operacao == 'd') {
			resultadoFinal = valor1 / valor2;
		 } else {
			System.out.println("Operação Inválida");
			resultadoFinal = 0;
		 }
		 System.out.println("O resultado é " + resultadoFinal);
		 sc.close();
		}

	}

