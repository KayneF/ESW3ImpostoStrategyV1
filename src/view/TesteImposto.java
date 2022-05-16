package view;

import controller.Imposto;
import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

public class TesteImposto {
	
	public static void main(String[] args) {
		
		Imposto imposto;
		
//		imposto = new ImpostoSaoPaulo();
//		imposto = new ImpostoBeloHorizonte();
//		imposto = new ImpostoPortoAlegre();
		imposto = new ImpostoCuritiba();
		
		imposto.calculoImposto();
	}
}
