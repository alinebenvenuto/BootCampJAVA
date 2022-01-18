package bootcampjava;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.print("Exercício - Calculadora\n");
		Calculadora.soma(25,25);
		Calculadora.subtracao(10, 5);
		Calculadora.multiplicacao(10, 2);
		Calculadora.divisao(20, 10);
		
		//Cálculo da Área
		System.out.print("\nExecício - Cáculo das ÁREAS");
		double areaQuadrado = CalculoArea.area(3);
		System.out.print("\n- Àrea do quadrado: "+ areaQuadrado);
		
		double areaRetangulo = CalculoArea.area(2, 2);
		System.out.print("\n- Àrea do triângulo: "+ areaRetangulo);
		
		double areaTrapezio = CalculoArea.area(10, 5, 2);
		System.out.print("\n- Àrea do trapézio: "+ areaTrapezio);
	}

}
