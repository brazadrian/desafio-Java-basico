package exercicios;

import java.util.Scanner;

public class H_Triangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double b, h, area; 
		
		System.out.print("Digite a base do tri�ngulo: ");
		b = scan.nextDouble();
		
		System.out.print("Digite a altura do tri�ngulo: ");
		h = scan.nextDouble();
		
		area = (b*h)/2;
		
		System.out.println("A �rea do tri�ngulo � de: " + area);
		
		
		
		scan.close();
		
	}

}
