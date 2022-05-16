package controller;

import java.util.Scanner;

public class ImpostoPortoAlegre implements Imposto{

	@Override
	public void calculoImposto() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a área total do terreno: ");
		int areaTotal = scan.nextInt();
		
		System.out.println("O terreno tem garagem? (S/N) ");
		String temGaragem = scan.nextLine();
		scan.nextLine();
		
		if(temGaragem == "s" || temGaragem == "S") {
			System.out.println("Digite a área total do garagem: ");
			int areaGaragem = scan.nextInt();
			double imposto = ((areaTotal*7.5) + areaGaragem*2.5);
			System.out.println("Valor do imposto para a Cidade de Porto Alegre com garagem: " + imposto);
		} 
		else {
			double imposto = (areaTotal*8);
			System.out.println("Valor do imposto para a Cidade de Porto Alegre sem garagem: " + imposto);
		}
		
		scan.close();
	}
}
