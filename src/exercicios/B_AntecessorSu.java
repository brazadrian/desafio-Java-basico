package exercicios;

import java.util.Scanner;

public class B_AntecessorSu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, numA, numS;
	
		System.out.print("Digite um valor qualquer: ");
		num = scan.nextInt();
		
		numA = num-1;
		numS = num+1;
		
		
		System.out.printf("Número: %d;%nSucessor: %d;%nAntecessor: %d.", num, numA, numS);
		
		scan.close();
	}

}
