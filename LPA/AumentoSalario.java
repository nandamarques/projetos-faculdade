package monitoriaLPA;

import java.util.Scanner;

public class AumentoSalario {
	/*elabore um algoritmo em JAVA para ler 1 valor que ser� referente ao Sal�rio, 
	 *e dever� ser calculado o aumentoSalarial de 4% desse valor a cada 4 meses no per�odo de 1 ano. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, salarioFinal, aumentoSalarial = 0.04;
		System.out.println("Usu�rio, informe o seu sal�rio: ");
		salario = sc.nextDouble();
		System.out.println("Segue a estimativa do seu sal�rio com aumento salarial de 4% n�s pr�ximos 4, 8 e 12 meses:");

		for (int dia = 30; dia <= 365; dia += 120) {
			salarioFinal = salario + (salario * aumentoSalarial);
			System.out.println(salarioFinal);
			aumentoSalarial += 0.04;
		}
	 
 
		sc.close();
	}

}
