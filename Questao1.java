package br.ucsal;

import java.util.Scanner;
/* objetivo: retornar a quantidade de dias do m�s de um determinado ano*/
public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes, ano, qtdias = 0;
		System.out.println("Usu�rio, informe o ano: ");
		ano = sc.nextInt();
		if (ano >= 1900 && ano <= 2020) {
			System.out.println("Usu�rio, informe o m�s: (1) JAN, (2) FEV, (3) MAR, (4) ABR, (5) MAI, (6) JUN, (7) JUL, (8) AGO, (9) SET, (10) OUT, (11) NOV ou (12) DEZ. ");
			mes = sc.nextInt();
			
			switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				qtdias = 31;
				break;
			case 4: case 6: case 9: case 11:
				qtdias = 30;
				break;
			case 2:
				if ((ano % 400 == 0  || (ano % 4 == 0)) && (ano % 100 != 0)) {
					qtdias = 29;
				} else {
					qtdias = 28;
				}
				break;
			default:
				System.out.println("o m�s informado n�o � v�lido");
				break;		
			}
			if (qtdias > 0) {
				System.out.println("A quantidade de dias do m�s " + mes + " do ano " + ano + " � " + qtdias);
			}
		} else {
			System.out.println("O crit�rio para defini��o do ano n�o foi atendido. Tente novamente.");
		} sc.close();

	}

} 