package br.ucsal;

public class Pratica36 {

	/*Problema: elabore uma solução para preencher dinamicamente um array bidimensional de tamanho 3 x 5 
	 * com uma sequencia crescente de 15 valores inteiros, pares iniciados por 8. 
	 * O array deve ser retornado em um método específico, cujos parâmetros serão os valores 
	 * que irão definir o seu tamanho.*/


		public static void main(String[] args) {
			imprimir(arrBi(3, 5));

		}

		public static int[][] arrBi(int linha, int coluna) {
			int[][] arr = new int [linha][coluna];
			for (int i = 0, num = 8; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++, num+=2) {
					arr[i][j] = num;
				}


			}
			return arr;
		}

		public static void imprimir(int[][] arr) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();

			}
		}


	}
