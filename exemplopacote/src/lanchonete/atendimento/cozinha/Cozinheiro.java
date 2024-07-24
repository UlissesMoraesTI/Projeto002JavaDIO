package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONADO LANCHE NATURAL");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONADO SUCO DE LARANJA NATURAL");
	}
	
	private void prepararSuco() {
		System.out.println("PREPARANDO SUCO DE LARANJA NATURAL");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
