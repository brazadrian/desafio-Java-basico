package exercicios;

import java.util.Scanner;

public class C_MediaPonderada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double n1, n2, n3, n4, medPon;
		
		System.out.print("Digite o 1º valor: ");
		n1 = scan.nextDouble();
		
		System.out.print("Digite o 2º valor: ");
		n2 = scan.nextDouble();
		
		System.out.print("Digite o 3º valor: ");
		n3 = scan.nextDouble();
		
		System.out.print("Digite o 4º valor: ");
		n4 = scan.nextDouble();
		
		medPon = (n1*1+n2*2+n3*3+n4*4)/10;
		
		System.out.println(medPon);
		
		scan.close();
	}

}
