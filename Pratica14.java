package br.ucsal;

import java.util.Scanner;

public class Pratica14 {
	/*Problema: Elabore uma solução para que, a partir de 03 
	valores inteiros aleatórios não repetidos informados pelo usuário 
	em um intervalo fechado de 10 a 90, seja apresentado qual o maior e 
	qual o menor dos três valores, utilizando apenas estrutura de decisão.
	Para isso, considere que:
	a) Caso algum valor informado esteja fora do intervalo ou repetido
	o resultado apresentado deve ser "valores incorretos"*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int valor1, valor2, valor3, maiorValor, menorValor;
        System.out.println("Usuário, informe 3 valores não repetidos num intervalo fechado de 10 a 90: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt(); 
        System.out.println("Os números informados foram " + valor1 + ", " + valor2 + " e " + valor3);
        if (valor1 >= 10 && valor1 <= 90 && valor2 >= 10 && valor2 <= 90 && valor3 >= 10 && valor3 <= 90) {
    		if (valor1 > valor2 && valor2 > valor3) {
    			maiorValor = valor1;
    			menorValor = valor3;
    		    System.out.println("O maior valor é " + maiorValor + " e o menor valor é " + menorValor);
    		} else if (valor2 > valor1 && valor1 > valor3) {
    			maiorValor = valor2;
    			menorValor = valor3;
    			System.out.println("O maior valor é " + maiorValor + " e o menor valor é " + menorValor);
    		} else if (valor3 > valor2 && valor2 > valor1) {
    			maiorValor = valor3;
    			menorValor = valor1;
    			System.out.println("O maior valor é " + maiorValor + " e o menor valor é " + menorValor);
    		} else if (valor1 > valor3 && valor3 > valor2) {
    			maiorValor = valor1;
    			menorValor = valor2;
    			System.out.println("O maior valor é " + maiorValor + " e o menor valor é " + menorValor);
    		} else if (valor2 > valor3 && valor3 > valor1) {
    			maiorValor = valor2;
    			menorValor = valor1;
    			System.out.println("O maior valor é " + maiorValor + " e o menor valor é " + menorValor);
    		} else {
    			System.out.println("Valores repetidos. Tente Novamente");
    		}
        } else {
        	System.out.println("Valores fora do intervalo solicitado");
        } sc.close();
		}
	}