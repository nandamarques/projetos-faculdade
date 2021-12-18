package br.ucsal;

public class Pratica24 {
	
	/*Problema: a sequencia Fibonacci é uma sequência de números inteiros que iniciando por 0 e 1 tem os termos 
	 * subsequentes correspondes à soma dos dois anteriores. 
	 * Dessa forma, elabore uma solução para imprimir uma sequencia Fibonacci 
	 * contendo os 20 primeiros valores de uma sequencia fibonacci utilizando a estrutura do / while.*/

	public static void main(String[] args) {
		int valor1 = 0, valor2 = 1, valor3 = 0, contarElementos = 1;
		do {
			System.out.print(valor1 + " ");
			valor3 = valor1 + valor2;
			valor1 = valor2;
			valor2 = valor3;
			contarElementos++;
			
		} while (contarElementos < 20);

	}

}
