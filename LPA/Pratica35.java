package br.ucsal;

import java.util.Scanner;

public class Pratica35 {
	/*Problema: elabore uma solução para calcular a quantidade de dias de vida do usuário. 
	 * Para isso use um método para informar a quantidade de dias de vida do primeiro ano, outro
	 *  para a quantidade de dias de vida dos anos intermediários, um para identificar os dias do mês 
	 *  e um para retornar a quantidade de dias de vida do ano atual.
	 *  OBS: Considere os anos bissextos no período.*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Usuário, informe o ano de nascimento: ");
		int anoNasc = sc.nextInt();
		int nDiasAno1 = diasPrimeiroAno(diasDoMes(anoNasc));
		System.out.print("Informe o ano atual: ");
		int anoAtual = sc.nextInt();
		int nDiasAnoAtual = diasAnoAtual(diasDoMes(anoAtual));
		int nDiasAnosDoMeio = diasAnosDoMeio(anoNasc, anoAtual);
		int nDiasVividos = nDiasAno1 + nDiasAnosDoMeio + nDiasAnoAtual;
		System.out.print("Seus dias vividos foram: " +  nDiasVividos);
	}
	
	
	public static int diasPrimeiroAno(int[] diasDoMes) {
		int diasPosteriores = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o mês de nascimento: ");
		int mes = sc.nextInt();
		System.out.print("Informe o dia do nascimento: ");
		int dia = sc.nextInt();
		for (int i = mes; i < diasDoMes.length; i++) {
			diasPosteriores += diasDoMes[i];
		}
		int diasRestoMes = diasDoMes[mes - 1] - dia;
		int diasPrimeiroAno = diasPosteriores + diasRestoMes;
		return diasPrimeiroAno;
	}
	
	
	public static int diasAnosDoMeio(int ano, int anoAtual) {
		int bissextos = 0, naoBissextos = 0, resultado;
		for (int i = ano + 1; i <= anoAtual - 1; i++) {
			if ((i % 400 == 0  || (i % 4 == 0)) && (i % 100 != 0)) {
				bissextos++;
			}else {
				naoBissextos++;
			}
		}
		bissextos = bissextos * 366;
		naoBissextos = naoBissextos * 365;
		resultado = bissextos + naoBissextos;
		return resultado;
	}
	

	public static int[] diasDoMes(int ano) {
		int[] diasDoMes = new int[12];
		diasDoMes[0] = 31;
		if ((ano % 400 == 0  || (ano % 4 == 0)) && (ano % 100 != 0)) {
			diasDoMes[1] = 29;
		} else {
			diasDoMes[1]= 28;
		}
		diasDoMes[2] = 31;
		diasDoMes[3] = 30;
		diasDoMes[4] = 31;
		diasDoMes[5] = 30;
		diasDoMes[6] = 31;
		diasDoMes[7] = 31;
		diasDoMes[8] = 30;
		diasDoMes[9] = 31;
		diasDoMes[10] = 30;
		diasDoMes[11] = 31;
		return diasDoMes;
	}
	
	
	public static int diasAnoAtual(int[] diasDoMes) {
		int diasMesesAnteriores = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Agora informe o mês atual: ");
		int mesAtual = sc.nextInt();
		System.out.print("Por fim, o dia atual:");
		int diaAtual = sc.nextInt();
		for (int i = 0; i < mesAtual - 1; i++) {
			diasMesesAnteriores += diasDoMes[i];
		}
		int diasAnoAtual = diasMesesAnteriores + diaAtual;
		return diasAnoAtual;
		
		}
}



