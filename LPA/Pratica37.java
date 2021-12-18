package br.ucsal;

public class Pratica37 {
	
	/*Problema: elabore uma solução para que um método retorne um array bidimensional com tamanho 5x8 
	 * que deverá ser preenchido com valores inteiros formando uma sequencia Fibonacci iniciada com 0 e 1. 
	 * O array retornado deverá ser passado como parâmetro para um outro método que vai retornar um novo array 
	 * do tipo String contendo os mesmos valores do array recebido no parâmetro, porém preenchidos 
	 * com zeros a esquerda de forma que todos os elementos tenham uma quantidade padronizada de 9 unidades.
	 * Ex: 000000000, 000000001, 000000001 ... 102334155*/

	public static void main(String[] args) {
		int[][] temp = obterSequenciaFibonacci(5, 8);
		//imprimir(temp);
		imprimir(obterSequenciaFibonacci(temp));
	}
	
	public static String[][] obterSequenciaFibonacci(int[][] arr){
		String[][] arrBid = new String[arr.length][arr[0].length];
		for (int il = 0; il < arrBid.length; il++) {
			for (int ic = 0; ic < arrBid[il].length; ic++) {
				arrBid[il][ic] = preencherZero(arr[il][ic], 9);
			}
		}
		return arrBid;
	}

	
	public static int[][] obterSequenciaFibonacci(int l, int c){
		int[][] arrBid = new int[l][c];
		for (int il = 0, a = 0, b = 1; il < arrBid.length; il++) {
			for (int ic = 0; ic < arrBid[il].length; ic++) {
				arrBid[il][ic] = a;
				a = a + b;
				b = a - b;
			}
		}
		return arrBid;
	}
	
	public static void imprimir(int[][] arrBid) {
		for (int l = 0; l < arrBid.length; l++) {
			for (int c = 0; c < arrBid[l].length; c++) {
				System.out.print(arrBid[l][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void imprimir(String[][] arrBid) {
		for (int l = 0; l < arrBid.length; l++) {
			for (int c = 0; c < arrBid[l].length; c++) {
				System.out.print(arrBid[l][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static String preencherZero(int valor, int padrao) {
		String zero = "";
		for (int i = 0; i < (padrao - (valor + "").length()); i++) {
			zero += "0";
		}
		return zero + valor;
	}
	
}

