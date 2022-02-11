package exercicios;

import java.util.Scanner;

public class E_PrestacaoAtrasada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor, taxa, tempo, prestacao;
		
		System.out.print("Digite o valor da compra: ");
		valor = scan.nextDouble();
		
		System.out.print("Digite a taxa (% ao mês): ");
		taxa = scan.nextDouble();
		
		System.out.print("Digite o tempo (meses) de atraso: ");
		tempo = scan.nextDouble();
		
		prestacao = valor+(valor*(taxa/100)*tempo);
		
		System.out.printf("%nA diferença é de: %.2f%n", (prestacao-valor));
		System.out.printf("O total da sua dívida é de: %.2f", prestacao);
		
		scan.close();
	}

}
