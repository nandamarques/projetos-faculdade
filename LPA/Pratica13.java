package br.ucsal;

import java.util.Scanner;

public class Pratica13 {
	
	/*Problema: Elabore uma solu��o em JAVA para ler o nome, a altura, o peso, 
	 * o endere�o completo 
	 * (separados por partes: rua, numero, bairro, cep, cidade, estado) e 
	 * a situa��o do usu�rio no cadastro (ativo / inativo) informados pelo usu�rio. 
	 * A solu��o deve retornar para 
	 * o usu�rio uma impress�o de sa�da contendo o nome e o 
	 * endere�o completo informado. Para essa solu��o, 
	 * cada elemento informado deve ser inserido em uma vari�vel espec�fica com o t�tulo CADASTRO.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scIntAndDouble = new Scanner(System.in);
		String nome, estado, cidade, bairro, rua;
		int numero, cep, cadastro;
		double altura, peso;
		System.out.println("Usu�rio, informe o seu nome: ");
		nome = sc.nextLine();
		System.out.println(nome + ", qual a sua altura?");
		altura = scIntAndDouble.nextDouble();
		System.out.print("Agora, por favor, informe o seu peso: ");
		peso = scIntAndDouble.nextDouble();
		System.out.println(nome + ", informe seu estado: ");
		estado = sc.nextLine();
		System.out.println("Agora informe a cidade: ");
		cidade = sc.nextLine();
		System.out.println(nome + ", informe seu bairro: ");
		bairro = sc.nextLine();
		System.out.println("Agora informe o nome da rua: ");
		rua = sc.nextLine();
		System.out.println("Estamos quase l�! Agora informe o n�mero da sua casa: ");
		numero = scIntAndDouble.nextInt();
		System.out.println("informe o seu CEP: ");
		cep = scIntAndDouble.nextInt();
		System.out.println("Por �ltimo, informe se o seu cadastro est� (1) ativo ou (2) inativo: ");
		cadastro = scIntAndDouble.nextInt();
		if (cadastro == 1) {
			System.out.println("Cadastro atualizado: " + nome + ", Endere�o: " + estado + ", " + cidade + ", " + cep + ", " + bairro + ", " + rua + ", " + numero);	
		} else {
			System.out.println(nome + ", primeiro ative seu cadastro antes de atualiz�-lo");
		}
		sc.close();
		scIntAndDouble.close();
	}

}

