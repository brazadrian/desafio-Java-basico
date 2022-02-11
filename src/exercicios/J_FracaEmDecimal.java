package exercicios;

import java.util.Scanner;

public class J_FracaEmDecimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, den;
		double decimal;
		
		System.out.print("Digite o numerador: ");
		num = scan.nextInt();
		
		System.out.print("Digite o denominador: ");
		den = scan.nextInt();
		
		decimal = (double)num/(double)den;
		
		System.out.printf("O valor decimal da fração %d/%d é: %f", num, den, decimal);
		
		scan.close();
	}

}
