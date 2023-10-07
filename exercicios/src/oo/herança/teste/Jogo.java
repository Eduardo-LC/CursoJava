package oo.herança.teste;

import oo.herança.Direcao;
import oo.herança.Heroi;
import oo.herança.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi j1 = new Heroi(10 , 10);
		Monstro j2 = new Monstro();
		
		j2.x = 10;
		j2.y = 10;
		
		j1.andar(Direcao.NORTE);
	
		
		System.out.println(j1.x);
		System.out.println(j1.y);
		System.out.println(j1.atacar(j2));
		
		System.out.println(j2.vida);
	}

}
