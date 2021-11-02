package br.ucsal;

import java.util.Scanner;

public class Pratica13 {
	
	/*Problema: Elabore uma solução em JAVA para ler o nome, a altura, o peso, 
	 * o endereço completo 
	 * (separados por partes: rua, numero, bairro, cep, cidade, estado) e 
	 * a situação do usuário no cadastro (ativo / inativo) informados pelo usuário. 
	 * A solução deve retornar para 
	 * o usuário uma impressão de saída contendo o nome e o 
	 * endereço completo informado. Para essa solução, 
	 * cada elemento informado deve ser inserido em uma variável específica com o título CADASTRO.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scIntAndDouble = new Scanner(System.in);
		String nome, estado, cidade, bairro, rua;
		int numero, cep, cadastro;
		double altura, peso;
		System.out.println("Usuário, informe o seu nome: ");
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
		System.out.println("Estamos quase lá! Agora informe o número da sua casa: ");
		numero = scIntAndDouble.nextInt();
		System.out.println("informe o seu CEP: ");
		cep = scIntAndDouble.nextInt();
		System.out.println("Por último, informe se o seu cadastro está (1) ativo ou (2) inativo: ");
		cadastro = scIntAndDouble.nextInt();
		if (cadastro == 1) {
			System.out.println("Cadastro atualizado: " + nome + ", Endereço: " + estado + ", " + cidade + ", " + cep + ", " + bairro + ", " + rua + ", " + numero);	
		} else {
			System.out.println(nome + ", primeiro ative seu cadastro antes de atualizá-lo");
		}
		sc.close();
		scIntAndDouble.close();
	}

}

