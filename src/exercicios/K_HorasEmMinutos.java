package exercicios;

import java.util.Scanner;

public class K_HorasEmMinutos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hora, min;
		
		System.out.print("Digite que horas s�o: ");
		hora = scan.nextInt();
		
		min = hora*60;
		
		System.out.printf("Desde o come�o do dia, passaram-se: %d min.", min);
		
		scan.close();
	}

}
