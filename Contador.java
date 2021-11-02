package monitoriaLPA;

public class Contador {
	/*Crie uma classe de nome Contador e no seu método main elabore um algoritmo em JAVA para contar quais números de 0 a 100 
	 * que são primos e quais são pares, deverá ser imprimido na tela o número e o seu tipo, exemplo: "2 - Par"*/

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			if (i == 2) {
				System.out.println(i + " - Primo e Par");
			} else if (i % 2 == 0) {
				System.out.println(i + " - Par ");
			} else if (i % 1 == 0 && i % i == 0 && i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 7 != 0 && i % 8 != 0 && i % 9 != 0 && i % 11 != 0) {
				System.out.println(i + " - Primo ");
			} else {
				System.out.println(i + " - Não é par nem primo");
			}
		}

	}

}
