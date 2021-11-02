package monitoriaLPA;

import java.util.Scanner;

public class JogoDaSorte {
	/*Crie uma classe de nome JogoDaSorte e no seu m�todo main elabore um algoritmo em JAVA para ler 1 valor inteiro entre 0 e 10, 
	 * utilize uma vari�vel j� predefinida de um n�mero da sorte ao seu crit�rio. 
	 * Fa�a uma compara��o com o n�mero fornecido pelo usu�rio 
	 * e o numeroDaSorte definido por voc�, caso o usu�rio erre,
	 *  dever� ser concedido mais 2 tentativas de acerto, ao acabar as chances dever� exibir uma mensagem "ACABOU O JOGO"*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorInformado = 0, numeroDaSorte = 9, tentativas;
		
		System.out.println("Usu�rio, adivinhe o n�mero da sorte: (Dica: ele est� entre 0 e 10)");
		valorInformado = sc.nextInt();
		if (valorInformado != numeroDaSorte) {
			System.out.println("Tente novamente:");
			valorInformado = sc.nextInt();
			if (valorInformado == numeroDaSorte) {
				System.out.println("Parab�ns! Voc� acertou");
			} else {
				for (tentativas = 0; tentativas < 1; tentativas++) {
					System.out.println("�ltima tentativa:");
					valorInformado = sc.nextInt();
					if (valorInformado == numeroDaSorte) {
						System.out.println("Parab�ns! Voc� acertou!");
					}else {
						System.out.println("ACABOU O JOGO");
					}
				}
			}

		} else if(valorInformado == numeroDaSorte) {
			System.out.println("Parab�ns! Voc� acertou!");
		} sc.close();
	}
}

