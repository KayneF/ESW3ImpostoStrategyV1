package controller;

import java.util.Scanner;

public class ImpostoBeloHorizonte implements Imposto{

	@Override
	public void calculoImposto() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a área total do terreno: ");
		int areaTotal = scan.nextInt();
		System.out.println("Digite o número de quartos: ");
		int numQuartos = scan.nextInt();

		double imposto = ((areaTotal*7) + numQuartos*4);
		System.out.println("Valor do imposto para a Cidade de Belo Horizonte: " + imposto);
		
		scan.close();
	}
}
