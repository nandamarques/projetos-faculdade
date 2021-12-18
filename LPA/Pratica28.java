package br.ucsal;

import java.util.Scanner;

public class Pratica28 {
	
	/*Problema: a escala Celsius possui o ponto zero na temperatura que a �gua congela e 100�C na temperatura que a �gua ferve. 
	 * A escala Fahrenheit tem o congelamento da �gua em 32�F e a ebuli��o em 212�F. 
	 * A escala Kelvin congela a �gua em 273 (K) e ferve a 373 K. 
	 * Fonte: http://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
	 * A partir do texto acima, crie um ConversorDeTemperatura na qual cada m�todo 
	 * dever� implementar o c�lculo necess�rio para convers�o espec�fica da temperatura. As convers�es s�o:
	 * (1) De Celsius para Kelvin; (2) De Kelvin para Celsius; (3) De Celsius para Fahrenheit; 
	 * (4) De Fahrenheit para Celsius; (5) De Kelvin para Fahrenheit; (6) De Fahrenheit para Kelvin. 
	 * � importante que:
	 * 1. Cada convers�o seja feita em um m�todo especifico.
	 * 2. O m�todo "main" dever� ser usado apenas para disparar o inicio da solu��o 
	 * 3. O m�todo "obterDados" dever� obter os dados do usu�rio necess�rios para efetuar as devidas convers�es de temperatura. 
	 * 4. N�o dever� ocorrer nenhuma instru��o de impress�o (System.out.print ...) em nenhum m�todo exceto nos m�todos "imprimir", 
	 * criados especificamente para essa finalidade.
	 * 5. Ao final, o algoritmo dever� apresentar o resultado.*/

	public static void main(String[] args) {
		double temperatura = obterDados(), resultado;
		int operacao = obterEscala();
		switch (operacao) {
		case 1: 
			resultado = celsiusKelvin(temperatura);
			break;
		case 2: 
			resultado = kelvinCelsius(temperatura);
			break;
		case 3: 
			resultado = celsiusFahrenheit(temperatura);
			break;
		case 4: 
			resultado = fahrenheitCelsius(temperatura);
			break;
		case 5: 
			resultado = Kelvinfahrenheit(temperatura);
			break;
		case 6: 
			resultado = Fahrenheitkelvin(temperatura);
			break;
		default:
			imprimir("Opera��o Inv�lida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);

	}
	
	public static double obterDados() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe a temperatura: ");
		return sc.nextDouble();
	}
	
	public static int obterEscala() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe a convers�o desejada:"
				+ "\n (1) De Celsius para Kelvin"
				+ "\n (2) De Kelvin para Celsius"
				+ "\n (3) De Celsius para Fahrenheit "
				+ "\n (4) De Fahrenheit para Celsius "
				+ "\n (5) De Kelvin para Fahrenheit"
				+ "\n (6) De Fahrenheit para Kelvin ");
		return sc.nextInt();
	}

	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	
	public static double  celsiusKelvin(double temperatura) {
		return temperatura + 273;
		
	}
	
	public static double  kelvinCelsius(double temperatura) {
		return temperatura - 273;
		
	}
	
	public static double celsiusFahrenheit(double temperatura) {
		return temperatura * 1.8 + 32;
		
	}
	
	public static double fahrenheitCelsius(double temperatura) {
		return (temperatura - 32) / 1.8;
		
	}
	
	public static double Kelvinfahrenheit(double temperatura) {
		return 1.8 * (temperatura - 273) + 32;
		
	}
	
	public static double Fahrenheitkelvin(double temperatura) {
		return (temperatura - 32) * 5 / 9 + 273;
		
	}

}


