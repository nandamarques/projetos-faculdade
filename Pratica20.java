package br.ucsal;

public class Pratica20 {
	
	/*Problema: elabore uma solu��o para apresentar uma sequencia, constru�da dinamicamente, com os 12 primeiros
	 * valores m�ltiplos de 2, 
	 * com a vari�vel inicializada com valor 1,
	 * utilizando uma estrutura de repeti��o com teste no in�cio (while)*/

	public static void main(String[] args) {
		int multiplos = 1, num = 1;
		final int LIMITE = 12;
		
		while(multiplos <= LIMITE) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
				multiplos++;
			}
			num++;
		}
		
		System.out.println("\nFim da execu��o");

	}

}
