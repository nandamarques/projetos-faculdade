package br.ucsal;

public class Pratica23 {
	/*Problema: elaborar uma sequencia decrescente de valores inteiros, positivos, ímpares, divisíveis por 3, 
	 * iniciada pelo número 99, contendo 15 elementos. 
	 * Utilize a estrutura do/while para solucionar esse problema.*/

	public static void main(String[] args) {
		int valorSequencia = 99, num = 0;
		do {
			if (valorSequencia % 3 == 0 && valorSequencia % 2 != 0) {
				num++;
				System.out.print(valorSequencia + " ");
			}
			valorSequencia--;
		} while (num < 15);

	}

}
