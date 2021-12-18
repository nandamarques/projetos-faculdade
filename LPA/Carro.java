package monitoriaLPA;

import java.util.Scanner;

public class Carro {
	/*01 - Crie uma classe de nome Carro e no seu m�todo main elabore um algoritmo em JAVA para ler 2 valores 
	 * que ser� referente a marca do carro e o modelo, dever� ser criado tamb�m um m�todo que ser� chamado 
	 * na main para concatenar os 2 valores recebidos em apenas um. 
	 * Exemplo: 
	 * Marca do carro: Chevrolet
	 * modelo: Onix
	 * Valor concatenado: Chevrolet - Onix*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Usu�rio, informe a marca do carro e o modelo:");
		String marca = sc.nextLine(), modelo = sc.nextLine();
		imprimir(marca, modelo);

	}
	
	public static void imprimir(String marca, String modelo) {
		System.out.println(marca + " - " + modelo);
	}
	
}
