package oo.herança.teste;


import oo.herança.desafio.Civic;
import oo.herança.desafio.Ferrari;

public class TesteCarro  {
	
	public static void main(String[] args) {
		
		Civic c = new Civic();
		Ferrari f = new Ferrari();
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		f.ligarTurbo();
		f.ligarAr();
		f.acelerar();
		f.acelerar();
		f.acelerar();
		f.velocidadeDoAr();
		
		System.out.println(f.toString());
		System.out.println(f.velocidadeDoAr());
	
			
	}

}
