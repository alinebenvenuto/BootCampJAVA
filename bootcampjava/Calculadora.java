package bootcampjava;

public class Calculadora {

	public static void soma(double num1, double num2) {
		
		double resultado = num1 + num2;
	
		System.out.println("\n-A soma de " + num1+ " + "+ num2+ " é: "+ resultado);
	}
	
	public static void subtracao(double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("\n-A subtração de " + num1+ " - "+ num2+ " é: "+ resultado);
	}
	
	public static void multiplicacao(int num1, int num2){
		int resultado = num1 * num2;
		System.out.println("\n-A multiplicação de " + num1+ " - "+ num2+ " é: "+ resultado);
	}
	
	public static void divisao(int num1, int num2) {
		int resultado = num1 / num2;
		System.out.println("\n-A divisao de " + num1+ " - "+ num2+ " é: "+ resultado);
		
	}
	
}


