package br.ucsal;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		double v1 = obterNota(),
				v2 = obterNota(),
				v3 = obterNota(),
				v4 = obterNota(),
				v5 = obterNota(),
				v6 = obterNota();
		double media1 = primeiraUnidade(v1, v2, v3), 
				media2 = segundaUnidade(v4, v5, v6),
				media = mediaFinal(media1, media2);
		
		imprimir(resultadoFinal(media));

	}
	
	public static double obterNota() {
		Scanner sc = new Scanner(System.in);
		double valorInformado = 0;
		while (true) {
			imprimir("Usuário, informe valor num intervalo fechado de 0 a 10:");
			valorInformado = sc.nextDouble();
			if (valorInformado > 0 && valorInformado <= 10) {
				return valorInformado;
			}
		} 
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}


	public static double  primeiraUnidade(double v1, double v2, double v3) {
		return ((v1 * 2) + (v2 * 3) + (v3 * 5)) / (2 + 3 + 5);

	}
	
	public static double  segundaUnidade(double v1, double v2, double v3) {
		return ((v1 * 3) + (v2 * 3) + (v3 * 4)) / (3 + 3 + 4);

	}
	
	public static double  mediaFinal(double v1, double v2) {
		return (v1 + v2) / 2;

	}
	
	public static String  resultadoFinal(double v1) {
		if (v1 >= 6) return "APROVADO";
		else return "REPROVADO";

	}



}


