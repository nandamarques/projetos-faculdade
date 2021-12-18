package br.ucsal;

public class Pratica33 {
	/*Problema: na matem�tica, a Sucess�o de Fibonacci (ou Sequ�ncia de Fibonacci), 
	 * � uma sequ�ncia de n�meros inteiros, come�ando normalmente por 0 e 1, 
	 * na qual, cada termo subsequente corresponde � soma dos dois anteriores. 
	 * Fonte: https://pt.wikipedia.org/wiki/Sequencia_de_Fibonacci.
	 * Diante da explica��o, elabore uma solu��o para preencher um array unidimensional 
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
