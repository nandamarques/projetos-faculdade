package br.ucsal;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double eletrodomestico1, eletrodomestico2, valorIntermediario = 0, valorFinal = 0;
        System.out.println("Usu�rio, informe o valor do primeiro eletrodom�stico adquirido: ");
        eletrodomestico1 = sc.nextDouble();
        System.out.println("Usu�rio, informe o valor do segundo eletrodom�stico adquirido: ");
        eletrodomestico2 = sc.nextDouble();
        double valorDaCompra = eletrodomestico1 + eletrodomestico2; 
        System.out.println("O total da compra foi: " + valorDaCompra);
		if (valorDaCompra >= 200 && valorDaCompra < 1000) {
			valorIntermediario = 0.2 * valorDaCompra;
		    valorFinal = valorDaCompra - valorIntermediario;
		    System.out.println("Voc� recebeu um desconto de 20%! O valor final � " + valorFinal);
		} 
		else if (valorDaCompra >= 1000) {
			valorIntermediario = 0.25 * valorDaCompra;
			valorFinal = valorDaCompra - valorIntermediario;
			System.out.println("Voc� recebeu um desconto de 25%! O valor final � " + valorFinal);
		} else {
		System.out.println("N�o h� desconto para a compra. O valor final � " + valorDaCompra);
		}
		sc.close();
	}
}

