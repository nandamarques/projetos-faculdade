package br.ucsal;

public class Vetor {
	/* Problema: criar e preencher em método um vetor de 5 elementos, onde 
	 * cada posição desse vetor será preenchida com as idades dos alunos da turma
	 * de Engenharia de Software, são: 19, 21, 23, 18 e 20 */
	
	public static void main(String[] args) {
		int[] v = ObterIdades();
		imprimir(v);
		imprimir(" ");
		imprimir(obterNomes());
		imprimir(" ");
		imprimir(obterMatriculas());
	}
	
	public static int[] ObterIdades() {
		int[] conjuntoIdades = {19, 21, 23, 18, 20};
		return conjuntoIdades;
				
	}
	
	public static String[] obterNomes() {
		String[] nomes = new String[5];
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "Jose";
		nomes[3] = "Simone";
		nomes[4] = "Rosa";
		return nomes;
	}
	
	public static String[] obterMatriculas() {
		String[] matriculas = new String[5];
		matriculas[0] = "484845";
		matriculas[1] = "401020";
		matriculas[2] = "343434";
		matriculas[3] = "121212";
		matriculas[4] = "656565";
		return matriculas;
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}

	public static void imprimir(int[] v) {
		System.out.print(v[0] + " " + v[1]);
	}
	
	// Imprime todos os elementos do vetor
	public static void imprimir1(int[] v) {
		int i = 0;
		while(i < v.length) {
			System.out.print(v[i] + " ");
			i++;
		}
	}
	
	public static void imprimir(String[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
			
		}
	}
	
	public static void imprimir1(String[] v) {
		System.out.print(v[0] + " " + v[1]);
	}
	

}
