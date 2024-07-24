package ibge;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA", "Maranhão"),
	CEARA("CE", "Ceará"),
	MATO_GROSSO_SUL("MS", "Mato Grosso do Sul");
	
	private String sigla;
	private String nome;

	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}	
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
