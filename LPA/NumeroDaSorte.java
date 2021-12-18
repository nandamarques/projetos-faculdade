package monitoriaLPA;

import java.util.Random;
import java.util.Scanner;

public class NumeroDaSorte {
	/*Crie uma classe de nome NumeroDaSorte e no seu m�todo main elabore um algoritmo em JAVA para ler 2 valores que 
	 * ser� referente a seu nome e ao n�mero da sorte, crie um m�todo que ir� pegar o nome do usu�rio 
	 * e dar um n�meroda sorte random de 1 at� 100, concatenando o valor de nome + n�mero da sorte.*/
	
	public static void main(String[] args) {
	String nome = nome();
	int numero = numeroDaSorte();
	imprimir(nome, numero);
	}  
	
	public static String nome() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe o seu nome: ");
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



