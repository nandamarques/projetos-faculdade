package monitoriaLPA;

import java.util.Scanner;

public class JogoDaSorte {
	/*Crie uma classe de nome JogoDaSorte e no seu método main elabore um algoritmo em JAVA para ler 1 valor inteiro entre 0 e 10, 
	 * utilize uma variável já predefinida de um número da sorte ao seu critério. 
	 * Faça uma comparação com o número fornecido pelo usuário 
	 * e o numeroDaSorte definido por você, caso o usuário erre,
	 *  deverá ser concedido mais 2 tentativas de acerto, ao acabar as chances deverá exibir uma mensagem "ACABOU O JOGO"*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorInformado = 0, numeroDaSorte = 9, tentativas;
		
		System.out.println("Usuário, adivinhe o número da sorte: (Dica: ele está entre 0 e 10)");
		valorInformado = sc.nextInt();
		if (valorInformado != numeroDaSorte) {
			System.out.println("Tente novamente:");
			valorInformado = sc.nextInt();
			if (valorInformado == numeroDaSorte) {
				System.out.println("Parabéns! Você acertou");
			} else {
				for (tentativas = 0; tentativas < 1; tentativas++) {
					System.out.println("Última tentativa:");
					valorInformado = sc.nextInt();
					if (valorInformado == numeroDaSorte) {
						System.out.println("Parabéns! Você acertou!");
					}else {
						System.out.println("ACABOU O JOGO");
					}
				}
			}

		} else if(valorInformado == numeroDaSorte) {
			System.out.println("Parabéns! Você acertou!");
		} sc.close();
	}
}

