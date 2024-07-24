package ibge;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 01),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 02),
	PIAUI ("PI", "Piauí", 03),
	MARANHAO ("MA", "Maranhão", 04),
	CEARA("CE", "Ceará", 05),
	MATO_GROSSO_SUL("MS", "Mato Grosso do Sul", 06);
	
	private String sigla;
	private String nome;
	private int	ibge;

	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
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

	public int getIbge() {
		return ibge;
	}

	public void setIbge(int ibge) {
		this.ibge = ibge;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
