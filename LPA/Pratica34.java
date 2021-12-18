package br.ucsal;

import java.util.Arrays;
import java.util.Scanner;

public class Pratica34 {
	
	/*Problema: elabore uma solu��o com os m�todos abaixo, respeitando as assinaturas definidas para cada m�todo, 
	 * para retornar um aluno (nome e �ndice) a partir de um vetor de nomes. Al�m disso, imprima a sequencia 
	 * de  alunos formada e inserida no vetor. Para isso, construa os m�todos conforme os itens a seguir:
	 * 1) crie um m�todo chamado "obterNomes" << public static String[] obterNomes(int tam) >> para retornar 
	 * um array unidimensional preenchido com os nomes de 06 alunos de uma turma. 
	 * A quantidade de alunos dever� ser recebida no par�metro do m�todo (tamanho do vetor).
	 * 2) crie um m�todo chamado
	 * "obterNomePeloIndice" << public static String obterNomePeloIndice(int indice, String[] nomes) >> 
	 * para etornar o nome do aluno a partir do �ndice informado no par�metro do m�todo.
	 * 3) crie um m�todo chamado 
	 * "obterIndicePeloNome" << public static Integer obterIndicePeloNome(String nome, String[] vet) >> 
	 * para retornar o �ndice que corresponde a posi��o do aluno cujo nome foi recebido no par�metro do m�todo 
	 * 4) crie um m�todo chamado "imprimir" << public static void imprimir(String s) >> 
	 * para imprimir um dado qualquer do tipo String recebido no par�metro do m�todo.
	 * 5) crie um m�todo chamado "imprimir" << public static void imprimir(int n) >> 
	 * para imprimir um dado qualquer do tipo int recebido no par�metro do m�todo.
	 * 6) crie um m�todo chamado "imprimir" << public static void imprimir(String[] s) >> 
	 * para imprimir todos os elementos de um vetor do tipo String recebido no par�metro do m�todo.
	 * 7) crie o m�todo "main" para executar em uma sequencia l�gica todos os m�todos para 
	 * obter os resultados solicitados.  */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ve = obterNomes(6);
		imprimir(ve);
		imprimir("Digite o �ndice pelo qual deseja buscar o nome: (0 a 5) ");
		int indice = sc.nextInt();
		if( indice >= 0 && indice <= 5) {
			imprimir(obterNomePeloIndice(indice, ve));
		} else {
			imprimir("Op��o Inv�lida. Tente novamente.");
		}
		
		imprimir("Digite o nome pelo qual deseja buscar o �ndice: ");
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
