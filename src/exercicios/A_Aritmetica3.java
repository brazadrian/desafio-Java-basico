package exercicios;

import java.util.Scanner;

public class A_Aritmetica3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3, media;
		
		System.out.print("Digite o 1� n�mero: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		n2 = scan.nextInt();
		
		System.out.print("Digite o 3� n�mero: ");
		n3 = scan.nextInt();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("A m�dia entre aritm�tica entre os valores digitados �: " + media);
		
		scan.close();
	}

}
