package br.com.projeto.model;

import java.util.Date;

public class CarregarEventos {

	private Date data;
	private String nome;
	private String hostname;
	
	public CarregarEventos() {
		super();
	}

	public CarregarEventos(Date data, String nome, String hostname) {
		super();
		this.data = data;
		this.nome = nome;
		this.hostname = hostname;
	}

	public void setAll(Date data, String nome, String hostname) {
		this.data = data;
		this.nome = nome;
		this.hostname = hostname;
	}

	public String getAll() {
		return
				"Data: " + data + "\n" +
				"Nome: " + nome + "\n" +
				"Hostname: " + hostname;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
}
