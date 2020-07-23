package br.com.projeto.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="itmn_alarme")
public class ItmnAlarme {

	@Column(name="id_alarme")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@OneToMany(mappedBy="idAlarme", cascade=CascadeType.ALL)
	private List<ItmnEvento> evento;
	
	@Column(name="descricao", length=200)
	private String descricao;

	public ItmnAlarme() {
		super();
	}

	public ItmnAlarme(int id, String nome, List<ItmnEvento> evento, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.evento = evento;
		this.descricao = descricao;
	}
	
	public void setAll(int id, String nome, List<ItmnEvento> evento, String descricao) {
		this.id = id;
		this.nome = nome;
		this.evento = evento;
		this.descricao = descricao;
	}
	
	public String getAll() {
			return "ID do Alarme: " + id + "\n" +
					"Nome: " + nome + "\n" +
					"Evento: " + evento + "\n" +
					"Descrição: " + descricao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ItmnEvento> getEvento() {
		return evento;
	}

	public void setEvento(List<ItmnEvento> evento) {
		this.evento = evento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
		
}
