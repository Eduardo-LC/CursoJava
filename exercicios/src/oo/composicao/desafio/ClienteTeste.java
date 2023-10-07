package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("NELSON");
		
		Compra compra1= new Compra();
		compra1.adicionarItem(1500,"TV", 3);
		compra1.adicionarItem(30,"Cabide", 6);
		
		Compra compra2= new Compra();
		compra2.adicionarItem(4550,"TV", 3);
		compra2.adicionarItem(37,"Cabide", 6);
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
			
	}

}
