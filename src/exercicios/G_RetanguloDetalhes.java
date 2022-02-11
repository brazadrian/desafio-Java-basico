package exercicios;

import java.util.Scanner;

public class G_RetanguloDetalhes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double base, altura, perimetro, area;
		
		System.out.print("Digite o valor da base do retângulo: ");
		base = scan.nextDouble();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		altura = scan.nextDouble();
		
		perimetro = base*2+altura*2;
		
		area = base*altura;
		
		System.out.println("O perímetro do retângulo é de: " + perimetro);
		System.out.println("A área do retângulo é de: " + area);
		
		scan.close();
	}

}
