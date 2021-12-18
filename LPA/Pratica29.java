package br.ucsal;

import java.util.Scanner;

public class Pratica29 {

	/*Problema: elabore uma solu��o para construir um conversor de moedas no qual, em um m�todo espec�fico chamado 
	 * "obterdados", o usu�rio dever� informar o valor que ser� convertido, a moeda de origem desse valor e a moeda
	 *  para a qual ser� convertida. Considere os valores de convers�o os seguintes: a) 1 real equivale a 0,18 d�lares 
	 *  americanos; b) 1 real equivale a 0,16 euros; c) 1 real equivale a 0,13 libras esterlinas.
	 *  As possibilidades de convers�o s�o: 
	 *  1) real para d�lar americano; 
	 *  2) real para euro; 
	 *  3) real para libra esterlina;
	 *  4) d�lar americano para real; 
	 *  5) euro para real; 
	 *  6) libra esterlina para real; 
	 *  7) d�lar americano para euro; 
	 *  8) euro para d�lar americano; 
	 *  9) libra esterlina para d�lar americano; 
	 *  10) d�lar americano para libra esterlina; 
	 *  11) euro para libra esterlina; 
	 *  12) libra esterlina para euro.
	 *  Para a solu��o dever ser considerado que:
	 *  1. Cada convers�o seja feita em um m�todo especifico
	 *  2. O m�todo "main" dever� ser usado apenas para disparar o inicio da solu��o 
	 *  3. O m�todo "obterDados" dever� obter os dados do usu�rio necess�rios para efetuar 
	 *  as devidas convers�es de temperatura. 
	 *  4. N�o dever� ocorrer nenhuma instru��o de impress�o (System.out ....) 
	 *  em nenhum m�todo exceto nos m�todos "imprimir", criados especificamente para essa finalidade.*/

	public static void main(String[] args) {
		double vlr = obterDados(), resultado;
		int moeda = obterMoeda();
		switch (moeda) {
		case 1: 
			resultado = realDolar(vlr);
			break;
		case 2: 
			resultado = realEuro(vlr);
			break;
		case 3: 
			resultado = realLibra(vlr);
			break;
		case 4: 
			resultado = dolarReal(vlr);
			break;
		case 5: 
			resultado = euroReal(vlr);
			break;
		case 6: 
			resultado = libraReal(vlr);
			break;
		case 7: 
			resultado = dolarEuro(vlr);
			break;
		case 8: 
			resultado = euroDolar(vlr);
			break;
		case 9: 
			resultado = libraDolar(vlr);
			break;
		case 10: 
			resultado = dolarLibra(vlr);
			break;
		case 11: 
			resultado = euroLibra(vlr);
			break;
		case 12: 
			resultado = libraEuro(vlr);
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
		imprimir("Usu�rio, informe o valor a ser convertido: ");
		return sc.nextDouble();
	}

	public static int obterMoeda() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe a convers�o desejada:"
				+ "\n (1) De Real para D�lar"
				+ "\n (2) De Real para Euro"
				+ "\n (3) De Real para Libra"
				+ "\n (4) De D�lar para Real"
				+ "\n (5) De Euro para Real"
				+ "\n (6) De Libra para Real"
				+ "\n (7) De D�lar para Euro"
				+ "\n (8) De Euro para D�lar"
				+ "\n (9) De Libra para D�lar"
				+ "\n (10) De D�lar para Libra"
				+ "\n (11) De Euro para Libra"
				+ "\n (12) De Libra para Euro");
		return sc.nextInt();
	}

	public static void imprimir(double arg) {
		System.out.println(arg);
	}

	public static void imprimir(String arg) {
		System.out.println(arg);
	}

	public static double  realDolar(double vlr) {
		return vlr * 0.18;

	}

	public static double  realEuro(double vlr) {
		return vlr * 0.16;

	}

	public static double realLibra(double vlr) {
		return vlr * 0.13;

	}

	public static double dolarReal(double vlr) {
		return vlr/0.18;

	}
	
	public static double euroReal(double vlr) {
		return vlr/0.16;

	}
	
	public static double libraReal(double vlr) {
		return vlr/0.13;

	}
	
	public static double dolarEuro(double vlr) {
		return vlr * 0.89;

	}
	
	public static double euroDolar(double vlr) {
		return vlr/0.89;

	}
	
	public static double libraDolar(double vlr) {
		return vlr * 1.34;

	}
	
	public static double dolarLibra(double vlr) {
		return vlr/1.34;

	}
	
	public static double euroLibra(double vlr) {
		return vlr * 0.84;

	}
	
	public static double libraEuro(double vlr) {
		return vlr/0.84;

	}

}
