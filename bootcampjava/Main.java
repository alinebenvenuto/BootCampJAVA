package bootcampjava;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.print("Exerc�cio - Calculadora\n");
		Calculadora.soma(25,25);
		Calculadora.subtracao(10, 5);
		Calculadora.multiplicacao(10, 2);
		Calculadora.divisao(20, 10);
		
		//C�lculo da �rea
		System.out.print("\nExec�cio - C�culo das �REAS");
		double areaQuadrado = CalculoArea.area(3);
		System.out.print("\n- �rea do quadrado: "+ areaQuadrado);
		
		double areaRetangulo = CalculoArea.area(2, 2);
		System.out.print("\n- �rea do tri�ngulo: "+ areaRetangulo);
		
		double areaTrapezio = CalculoArea.area(10, 5, 2);
		System.out.print("\n- �rea do trap�zio: "+ areaTrapezio);
	}

}
