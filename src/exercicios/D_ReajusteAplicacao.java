package exercicios;

import java.util.Scanner;

public class D_ReajusteAplicacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double saldo, saldoNovo;
		
		System.out.print("Digite o saldo de sua aplica��o: ");
		saldo = scan.nextDouble();
		
		saldoNovo = saldo + saldo*0.025;
		 
		System.out.print("O seu novo saldo � de: " + saldoNovo);
		
		scan.close();
	}

}
