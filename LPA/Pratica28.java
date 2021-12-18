package br.ucsal;

import java.util.Scanner;

public class Pratica28 {
	
	/*Problema: a escala Celsius possui o ponto zero na temperatura que a água congela e 100ºC na temperatura que a água ferve. 
	 * A escala Fahrenheit tem o congelamento da água em 32°F e a ebulição em 212°F. 
	 * A escala Kelvin congela a água em 273 (K) e ferve a 373 K. 
	 * Fonte: http://www.infoescola.com/fisica/conversao-de-escalas-termometricas/
	 * A partir do texto acima, crie um ConversorDeTemperatura na qual cada método 
	 * deverá implementar o cálculo necessário para conversão específica da temperatura. As conversões são:
	 * (1) De Celsius para Kelvin; (2) De Kelvin para Celsius; (3) De Celsius para Fahrenheit; 
	 * (4) De Fahrenheit para Celsius; (5) De Kelvin para Fahrenheit; (6) De Fahrenheit para Kelvin. 
	 * É importante que:
	 * 1. Cada conversão seja feita em um método especifico.
	 * 2. O método "main" deverá ser usado apenas para disparar o inicio da solução 
	 * 3. O método "obterDados" deverá obter os dados do usuário necessários para efetuar as devidas conversões de temperatura. 
	 * 4. Não deverá ocorrer nenhuma instrução de impressão (System.out.print ...) em nenhum método exceto nos métodos "imprimir", 
	 * criados especificamente para essa finalidade.
	 * 5. Ao final, o algoritmo deverá apresentar o resultado.*/

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
			imprimir("Operação Inválida");
			resultado = 0;
			break;
		}
		
		imprimir(resultado);

	}
	
	public static double obterDados() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe a temperatura: ");
		return sc.nextDouble();
	}
	
	public static int obterEscala() {
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe a conversão desejada:"
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


