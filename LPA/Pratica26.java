package br.ucsal;

import java.util.Scanner;

public class Pratica26 {
	/*Problema: elabore uma Progressão Aritmética de valores inteiros, positivos, iniciada com o valor 10 e razão 6, 
	 * na qual o valor limite da sequencia será informado pelo usuário (executor), obedecendo aos seguintes critérios:
	 * (1) O valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
	 * (2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer solicitando o valor, 
	 * até que seja informado dentro do intervalo definido. 
	 * (3) A sequencia só será construída quando o usuário informar o valor dentro do intervalo correto.
	 * Com base no texto acima:
	 * a) Apresente a sequencia formada
	 * b) Calcule a quantidade de elementos da sequencia
	 * c) Calcule a média aritmética do primeiro e último valor da sequencia.
	 * d) Identifique a quantidade de números pares existentes na sequencia
	 * e) Identifique a quantidade de números ímpares existentes na sequencia
	 * f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia
	 * g) Calcule a soma de todos os elementos da sequencia 
	 * h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 respectivamente, 
	 * quando for possível.
	 * Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int RAZAO = 6, VALOR_MINIMO = 50, VALOR_MAXIMO = 100, PRIMEIRO_ELEM_MP = 4, SEGUNDO_ELEM_MP = 10, PESO1 = 4, PESO2 = 6;
		int valorInformado = 0, elementos = 0, valorInicial = 10, primeiroElemento = 0, ultimoElemento = 0, pares = 0, impares = 0, impares3 = 0, soma = 0;
		double mediaPonderada = 0, termo4 = 0, termo10 = 0;
		boolean validar = false;

		while(validar == false) {
			System.out.println("Usuário, informe o valor limite num intervalo fechado de 50 a 100: ");
			valorInformado = sc.nextInt();
			if(valorInformado >= VALOR_MINIMO && valorInformado <= VALOR_MAXIMO) {
				validar = true;
			}
		}
		primeiroElemento = valorInicial;
		System.out.println("a) ");
		for (; valorInicial <= valorInformado; valorInicial += RAZAO) {
			System.out.print(valorInicial + " ");
			soma += valorInicial;
			ultimoElemento = valorInicial;
			if (valorInicial % 2 == 0) {
				pares++;
			} else if (valorInicial % 2 != 0){
				impares++;
			} else if (valorInicial % 3 == 0 && valorInicial % 2 != 0) {
				impares3++;
			}
			elementos++;

			if(elementos == 4) {
				termo4 = valorInicial;
			} else if(elementos == 10) {
				termo10 = valorInicial;
			}

		}
		

		System.out.println("\nb) Quantidade de elementos: " + elementos);
		System.out.println("c) (" + primeiroElemento + " + " + ultimoElemento + ") / 2 = " 
				+ (primeiroElemento + ultimoElemento) / 2);
		System.out.println("d) A quantidade de pares é: " + pares);
		System.out.println("e) A quantidade de ímpares é: " + impares);
		System.out.println("f) A quantidade de ímpares divisíveis por 3 é: " + impares3);
		System.out.println("g) A soma de todos os elementos da sequência é: " + soma);

		if (termo4 > 0 && termo10 > 0) {

			mediaPonderada = (termo4 * PESO1 + termo10 * PESO2)/(PESO1 + PESO2);
			System.out.println("h) A média ponderada do 4º e do 10º termos da sequência, com peso 4 e 6, respectivamente é: " + mediaPonderada);
		} else {
			System.out.println("Não é possível calcular a média ponderada dessa sequência.");
		}

		sc.close();
	}
}