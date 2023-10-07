package oo.herança.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		super(350);
	}
	
	

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	
	}

	@Override
	public void ligarAr() { 
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
		
	}

}
