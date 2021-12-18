package br.ucsal;

import java.util.Scanner;

public class Pratica27 {
	
	/*Problema: elabore uma solução para construir uma calculadora com quatro operações básicas. 
	 * Cada operação deverá ser construída em um método específico. 
	 * A impressão dos resultados deve estar centralizada em um método chamado "imprimir" 
	 * e o método "main" deve ser utilizado apenas para iniciar a execução da solução. 
	 * Para essa solução, o usuário deverá informar 02 valores (podem ser decimais), 
	 * em um metodo especifico "obterDados" e escolher qual a operação que deseja realizar
	 * em um método chamado "obterOperacao": somar, subtrair, dividir e multiplicar*/

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
			imprimir("Operação Inválida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);
	}
	
	public static double obterDados() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe um valor: ");
		return sc.nextDouble();
	}
	
	public static int obterOperacao() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe a operação desejada:"
				+ "\n (1) Soma "
				+ "\n (2) Subtração "
				+ "\n (3) Multiplicação "
				+ "\n (4) Divisão ");
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
