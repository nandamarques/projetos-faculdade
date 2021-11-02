package br.ucsal;

public class Pratica20 {
	
	/*Problema: elabore uma solução para apresentar uma sequencia, construída dinamicamente, com os 12 primeiros
	 * valores múltiplos de 2, 
	 * com a variável inicializada com valor 1,
	 * utilizando uma estrutura de repetição com teste no início (while)*/

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
		
		System.out.println("\nFim da execução");

	}

}
