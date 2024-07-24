package lanchonete;

import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarSucoNoBalcao();
	}
}
