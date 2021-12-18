package br.ucsal;

public class Pratica25 {
/*Problema: elabore uma sequencia dinamicamente de anos bissextos no intervalo fechado de 1900 a 2032.*/
	public static void main(String[] args) {
		for (int i = 1900; i <= 2032; i++) {
			if ((i % 400 == 0  || (i % 4 == 0)) && (i % 100 != 0)) {
				System.out.print(i + " ");
			}
		}

	}

}
