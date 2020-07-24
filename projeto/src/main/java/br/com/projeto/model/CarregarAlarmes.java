package br.com.projeto.model;

public class CarregarAlarmes {

	private String nome;
	private long qtde;
	
	public CarregarAlarmes() {
		super();
	}

	public CarregarAlarmes(String nome, long qtde) {
		super();
		this.nome = nome;
		this.qtde = qtde;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getQtde() {
		return qtde;
	}
	public void setQtde(long qtde) {
		this.qtde = qtde;
	}
}
