package lanchonete.area.cliente;

public class Cliente {
	
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	
	public void escolherSuco() {
		System.out.println("ESCOLHENDO A BEBIDA");			
	}
	
	public void fazerPedido() {
		System.out.println("FAZENDO PEDIDO");
	}
	
	public void pagarConta() {
		consultarSaldoNoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	
	private void consultarSaldoNoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
}
