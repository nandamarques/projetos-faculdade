package br.ucsal;

import java.util.Scanner;

public class PrimeiroCodigo {

	/* Objetivo: obter dois valores do usuário executor, 
	 * efetuar a soma e apresentar o 
	 * resultado final
	 * Sempre usar a instrução scanner */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int valor1, valor2, resultado;
		System.out.println("Usuário, informe o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Usuário, informe o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println("O usuário informou os valores " + valor1 + " e " + valor2);
		resultado = valor1 + valor2;
		System.out.println("O resultado da soma é " + resultado);

	}

}
