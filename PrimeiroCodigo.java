package br.ucsal;

import java.util.Scanner;

public class PrimeiroCodigo {

	/* Objetivo: obter dois valores do usu�rio executor, 
	 * efetuar a soma e apresentar o 
	 * resultado final
	 * Sempre usar a instru��o scanner */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int valor1, valor2, resultado;
		System.out.println("Usu�rio, informe o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Usu�rio, informe o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println("O usu�rio informou os valores " + valor1 + " e " + valor2);
		resultado = valor1 + valor2;
		System.out.println("O resultado da soma � " + resultado);

	}

}
