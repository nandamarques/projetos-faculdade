package br.ucsal;

import java.util.Scanner;

public class Pratica27 {
	
	/*Problema: elabore uma solu��o para construir uma calculadora com quatro opera��es b�sicas. 
	 * Cada opera��o dever� ser constru�da em um m�todo espec�fico. 
	 * A impress�o dos resultados deve estar centralizada em um m�todo chamado "imprimir" 
	 * e o m�todo "main" deve ser utilizado apenas para iniciar a execu��o da solu��o. 
	 * Para essa solu��o, o usu�rio dever� informar 02 valores (podem ser decimais), 
	 * em um metodo especifico "obterDados" e escolher qual a opera��o que deseja realizar
	 * em um m�todo chamado "obterOperacao": somar, subtrair, dividir e multiplicar*/

	public static void main(String[] args) {
		executar();
	}
	
	public static void executar() {
		double primeiroValor = obterDados(), segundoValor = obterDados(), resultado;
		int operacao = obterOperacao();
		switch (operacao) {
		case 1: 
			resultado = somar(primeiroValor, segundoValor);
			break;
		case 2: 
			resultado = subtrair(primeiroValor, segundoValor);
			break;
		case 3: 
			resultado = multiplicar(primeiroValor, segundoValor);
			break;
		case 4: 
			resultado = dividir(primeiroValor, segundoValor);
			break;
		default:
			imprimir("Opera��o Inv�lida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);
	}
	
	public static double obterDados() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe um valor: ");
		return sc.nextDouble();
	}
	
	public static int obterOperacao() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe a opera��o desejada:"
				+ "\n (1) Soma "
				+ "\n (2) Subtra��o "
				+ "\n (3) Multiplica��o "
				+ "\n (4) Divis�o ");
		return sc.nextInt();
	}

	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	
	public static double somar(double v1, double v2) {
		return v1 + v2;
		
	}
	
	public static double subtrair(double x1, double x2) {
		return x1 + x2;
		
	}
	
	public static double multiplicar(double y1, double y2) {
		return y1 * y2;
		
	}
	
	public static double dividir(double a1, double b2) {
		return a1 / b2;
		
	}

}
