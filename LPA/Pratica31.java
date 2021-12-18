package br.ucsal;

import java.util.Scanner;

public class Pratica31 {

	/*Problema: elabore uma solução para construir dinamicamente uma sequencia de valores inteiros, crescentes, 
	 * pares, iniciada pelo valor 2, contendo 15 elementos. Considere que a sequencia deverá ser construída de forma 
	 * que cada valor da sequencia seja um elemento de um array unidimensional que será retornado de um método. 
	 * Ao final o array deverá ser impresso apresentando a sequencia elaborada.*/
	public static void main(String[] args) {
		int tamanhoDoVetor = 15;
		imprimir(sequencia(tamanhoDoVetor));
		
	}
	
	public static int[] sequencia(int tam) {
		int[] seq = new int[tam];
		for (int i = 0, num = 2; i < seq.length; i++, num+=2) {
			seq[i] = num;
		}
		return seq;
	}
	
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}	

}
	

