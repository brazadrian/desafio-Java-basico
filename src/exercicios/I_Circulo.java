package exercicios;

import java.util.Scanner;

public class I_Circulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		double raio, perimetro, area, pi = 3.14;
		
		System.out.print("Digite o valor do raio (cm): ");
		raio = scan.nextDouble();
		
		perimetro = 2*pi*raio;
		
		area = pi*Math.pow(raio, 2);
		
		System.out.printf("O Per�metro do c�rculo � de: %.2f%n cm;", perimetro);
		System.out.printf("A �rea do c�rculo � de: %.2f cm�.", area);
		
		scan.close();
	}
}