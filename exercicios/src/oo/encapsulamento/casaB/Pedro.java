package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	//Ana mae = new Ana();
	
	void testeAcessos () {
		
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		 
		//System.out.println(segredo); private da outra classe
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); // só é transmitido por herança e não instanciado
		System.out.println(new Ana().todosSabem);
		
		
	}

}
