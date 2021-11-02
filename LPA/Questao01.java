package br.ucsal;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double valor1, valor2, mediaPonderada;
        System.out.println("Usuário, digite o primeiro valor num intervalo de 0 a 10: ");
        valor1 = sc.nextDouble();
        System.out.println("Usuário, digite o segundo valor num intervalo de 0 a 10: ");
	     valor2 = sc.nextDouble();
	     if (valor1 >= 0 && valor1 <= 10 && valor2 >= 0 && valor2 <= 10) { 
	    	 mediaPonderada = ((valor1 * 3.8) + (valor2 * 6.2))/ (3.8 + 6.2);
	    	 if (mediaPonderada >= 6) {
				 System.out.println("Aprovado! Sua média é final " + mediaPonderada);
			 } else {
				 System.out.println("Reprovado. Sua média final é " + mediaPonderada);
			 }  
	     } else {
			 System.out.println("Valor incorreto informado");
		 }
		 
		 sc.close();

	}

}
