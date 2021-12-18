package br.ucsal;

import java.util.Arrays;
import java.util.Scanner;

public class Pratica34 {
	
	/*Problema: elabore uma solução com os métodos abaixo, respeitando as assinaturas definidas para cada método, 
	 * para retornar um aluno (nome e índice) a partir de um vetor de nomes. Além disso, imprima a sequencia 
	 * de  alunos formada e inserida no vetor. Para isso, construa os métodos conforme os itens a seguir:
	 * 1) crie um método chamado "obterNomes" << public static String[] obterNomes(int tam) >> para retornar 
	 * um array unidimensional preenchido com os nomes de 06 alunos de uma turma. 
	 * A quantidade de alunos deverá ser recebida no parâmetro do método (tamanho do vetor).
	 * 2) crie um método chamado
	 * "obterNomePeloIndice" << public static String obterNomePeloIndice(int indice, String[] nomes) >> 
	 * para etornar o nome do aluno a partir do índice informado no parâmetro do método.
	 * 3) crie um método chamado 
	 * "obterIndicePeloNome" << public static Integer obterIndicePeloNome(String nome, String[] vet) >> 
	 * para retornar o índice que corresponde a posição do aluno cujo nome foi recebido no parâmetro do método 
	 * 4) crie um método chamado "imprimir" << public static void imprimir(String s) >> 
	 * para imprimir um dado qualquer do tipo String recebido no parâmetro do método.
	 * 5) crie um método chamado "imprimir" << public static void imprimir(int n) >> 
	 * para imprimir um dado qualquer do tipo int recebido no parâmetro do método.
	 * 6) crie um método chamado "imprimir" << public static void imprimir(String[] s) >> 
	 * para imprimir todos os elementos de um vetor do tipo String recebido no parâmetro do método.
	 * 7) crie o método "main" para executar em uma sequencia lógica todos os métodos para 
	 * obter os resultados solicitados.  */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ve = obterNomes(6);
		imprimir(ve);
		imprimir("Digite o índice pelo qual deseja buscar o nome: (0 a 5) ");
		int indice = sc.nextInt();
		if( indice >= 0 && indice <= 5) {
			imprimir(obterNomePeloIndice(indice, ve));
		} else {
			imprimir("Opção Inválida. Tente novamente.");
		}
		
		imprimir("Digite o nome pelo qual deseja buscar o índice: ");
		String nomeAluno = sc.next();
		imprimir(obterIndicePeloNome(nomeAluno, ve));
		
	}
	
	
	
	public static String[] obterNomes(int tam) {
		String[] nomes = new String[tam];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nomes.length; i++) {
			imprimir("Digite o nome do aluno " + (i+1) + ": ");
			nomes[i] = sc.next();
		}
		return nomes;
	}
	
	public static String obterNomePeloIndice(int indice, String[] nomes) {
		return nomes[indice];
	}
	
	public static Integer obterIndicePeloNome(String nome, String[] vet) {
		int i = 0;
		for(; !nome.equalsIgnoreCase(vet[i]); i++){ 
	}
	     return i;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(int n) {
		System.out.println(n);
	}
	
	public static void imprimir(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");		
		}
	}
	
}
