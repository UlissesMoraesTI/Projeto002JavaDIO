package lanchonete.atendimento.cozinha;

public class Almoxarife {
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO ENTRADA");
	}
	
	private void controlarSaida() {
		System.out.println("CONTROLANDO SAIDA");
	}
	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("TROCANDO O GAS");
	}	
}
