package monitoriaLPA;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int valor1, valor2, valor3, maiorValor;
        System.out.println("Usuário, informe 3 valores não repetidos num intervalo de 10 a 90: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt(); 
        System.out.println("Os números informados foram " + valor1 + ", " + valor2 + " e " + valor3);
        if (valor1 > 10 && valor1 < 90 && valor2 > 10 && valor2 < 90 && valor3 > 10 && valor3 < 90) {
    		if (valor1 > valor2 && valor2 > valor3) {
    			maiorValor = valor1;
    		    System.out.println("O maior valor é " + maiorValor);
    		} else if (valor2 > valor1 && valor1 > valor3) {
    			maiorValor = valor2;
    			System.out.println("O maior valor é " + maiorValor);
    		} else if (valor3 > valor2 && valor2 > valor1) {
    			maiorValor = valor3;
    			System.out.println("O maior valor é " + maiorValor);
    		} else if (valor1 > valor3 && valor3 > valor2) {
    			maiorValor = valor1;
    			System.out.println("O maior valor é " + maiorValor);
    		} else {
    			System.out.println("Valores repetidos. Tente Novamente");
    		}
        } else {
        	System.out.println("Valores fora do intervalo solicitado");
        } sc.close();

    		}
}

