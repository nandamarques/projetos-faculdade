package br.ucsal;

import java.util.Scanner;

public class Pratica12 {
	/*Problema: elabore uma calculadora para que a partir de 02 
	 * valores informados pelo usu�rio assim com a escolha da 
	 * opera��o que ser� realizada, o algoritmo apresente o resultado final. 
	 * Se o usu�rio n�o escolher nenhuma das 04 opera��es b�sicas: 
	 * somar, subtrair, dividir e multiplicar 
	 * o algoritmo dever� informar opera��o inv�lida.*/

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double valor1, valor2, resultadoFinal;
         char operacao;
         System.out.println("Usu�rio, digite o primeiro n�mero: ");
         valor1 = sc.nextDouble();
         System.out.println("Usu�rio, digite o segundo n�mero: ");
	     valor2 = sc.nextDouble();
		 System.out.println("Informe a opera��o: (a) Somar, (b) Subtrair, (c) Multiplica��o, (d) Divis�o");
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
			System.out.println("Opera��o Inv�lida");
			resultadoFinal = 0;
		 }
		 System.out.println("O resultado � " + resultadoFinal);
		 sc.close();
		}

	}

