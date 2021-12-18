package monitoriaLPA;

import java.util.Random;
import java.util.Scanner;

public class NumeroDaSorte {
	/*Crie uma classe de nome NumeroDaSorte e no seu método main elabore um algoritmo em JAVA para ler 2 valores que 
	 * será referente a seu nome e ao número da sorte, crie um método que irá pegar o nome do usuário 
	 * e dar um númeroda sorte random de 1 até 100, concatenando o valor de nome + número da sorte.*/
	
	public static void main(String[] args) {
	String nome = nome();
	int numero = numeroDaSorte();
	imprimir(nome, numero);
	}  
	
	public static String nome() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe o seu nome: ");
		return sc.nextLine();
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(String nome, int numero) {
		System.out.println(nome + " " + numero);
	}
	
	public static int numeroDaSorte() {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100) + 1;
		return (numero);
	}

}



