package exercicios;

import java.util.Scanner;

public class G_RetanguloDetalhes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double base, altura, perimetro, area;
		
		System.out.print("Digite o valor da base do ret�ngulo: ");
		base = scan.nextDouble();
		
		System.out.print("Digite o valor da altura do ret�ngulo: ");
		altura = scan.nextDouble();
		
		perimetro = base*2+altura*2;
		
		area = base*altura;
		
		System.out.println("O per�metro do ret�ngulo � de: " + perimetro);
		System.out.println("A �rea do ret�ngulo � de: " + area);
		
		scan.close();
	}

}
