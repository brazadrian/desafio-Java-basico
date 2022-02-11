package exercicios;

import java.util.Scanner;

public class A_Aritmetica3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3, media;
		
		System.out.print("Digite o 1º número: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o 2º número: ");
		n2 = scan.nextInt();
		
		System.out.print("Digite o 3º número: ");
		n3 = scan.nextInt();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("A média entre aritmética entre os valores digitados é: " + media);
		
		scan.close();
	}

}
