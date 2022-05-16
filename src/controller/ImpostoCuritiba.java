package controller;

import java.util.Scanner;

public class ImpostoCuritiba implements Imposto{
	
	@Override
	public void calculoImposto() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a área total do terreno: ");
		int areaTotal = scan.nextInt();
		System.out.println("Digite a idade do imóvel: ");
		int idadeImovel = scan.nextInt();
		
		if(idadeImovel > 50) {
			double imposto = ((areaTotal*5) + (idadeImovel*3));
			System.out.println("Valor do imposto para a Cidade de Curitiba com imóvel com mais de 50 anos: " + imposto);
		}
		else if(idadeImovel < 20) {
			double imposto = ((areaTotal*5) + (idadeImovel*2));
			System.out.println("Valor do imposto para a Cidade de São Paulo com imóvel com menos de 50 anos: " + imposto);
		}
		else {
			double imposto = ((areaTotal*5) + (idadeImovel*2.5));
			System.out.println("Valor do imposto para a Cidade de São Paulo com imóvel entre 20 e 50 anos: " + imposto);
		}
		scan.close();
	}

}
