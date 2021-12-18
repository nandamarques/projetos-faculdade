package br.ucsal;

public class Pratica33 {
	/*Problema: na matemática, a Sucessão de Fibonacci (ou Sequência de Fibonacci), 
	 * é uma sequência de números inteiros, começando normalmente por 0 e 1, 
	 * na qual, cada termo subsequente corresponde à soma dos dois anteriores. 
	 * Fonte: https://pt.wikipedia.org/wiki/Sequencia_de_Fibonacci.
	 * Diante da explicação, elabore uma solução para preencher um array unidimensional 
	 * com uma sequencia com os 30 primeiros valores inteiros, positivos de uma sequencia fibonacci. 
	 * Lembrando que a sequencia inicia com 0 e 1.*/
	public static void main(String[] args) {
			int tamanhoDoVetor = 30;
			imprimir(sequenciaFibonacci(tamanhoDoVetor));
			
		}
		
		public static int[] sequenciaFibonacci(int tam) {
			int[] seq = new int[tam];
			seq[0] = 0;
			seq[1] = 1;
			for (int i = 2; i < seq.length; i++) {
				seq[i] = seq[i-1] + seq[i-2];
			}
			return seq;
		}
		
		public static void imprimir(int[] v) {
			for (int i = 0; i < v.length; i++) {
				System.out.print(v[i] + " ");
			}
		}
}
