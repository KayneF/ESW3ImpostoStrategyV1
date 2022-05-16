package controller;

import java.util.Scanner;

public class ImpostoSaoPaulo implements Imposto{

	@Override
	public void calculoImposto() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a área total do terreno: ");
		int areaTotal = scan.nextInt();
		System.out.println("Digite o número de cômodos: ");
		int numComodos = scan.nextInt();
		
		double imposto = ((areaTotal*10) + numComodos*2);
		System.out.println("Valor do imposto para a Cidade de São Paulo: " + imposto);
		
		scan.close();
	}
	
	
}
