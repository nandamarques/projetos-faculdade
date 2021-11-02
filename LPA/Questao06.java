package br.ucsal;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int elementos = 0, i = 19, iFinal = 0;
		for (; i <= 500; i += 4, elementos++) {
			System.out.print(i + " ");
			iFinal = 500 - 4;
		}
		soma = (elementos/2) * (i + iFinal);
		System.out.println("\nA soma de todos os elementos é: " + soma);
		

		sc.close();

	} 

}
