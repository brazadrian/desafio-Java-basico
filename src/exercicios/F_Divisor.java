package exercicios;

import java.util.Scanner;

public class F_Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		
		
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.print("Digite o primeiro valor: ");
		b = scan.nextInt();
		
		c = a/b;
		
		d = a%b;
		
		System.out.printf("Dividendo: %d", a);
		System.out.printf("%nDivisor: %d", b);
		System.out.printf("%nQuociente: %d", c);
		System.out.printf("%nResto: %d", d);
		
		scan.close();
	}

}
