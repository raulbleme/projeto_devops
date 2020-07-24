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
@Table(name="itmn_equipamento")
public class ItmnEquipamento {

	@Column(name="id_equip")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hostname", length=50)
	private String hostname;
	
	@Column(name="ipaddr", length=15)
	private String ip;
	
	@OneToMany(mappedBy="idEquipamento", cascade=CascadeType.ALL)
	private List<ItmnEvento> evento;
		
	public ItmnEquipamento() {
		super();
	}

	public ItmnEquipamento(int id, String hostname, String ip, List<ItmnEvento> evento) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
		this.evento = evento;
	}
	
	public void setAll(int id, String hostname, String ip, List<ItmnEvento> evento) {
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
		this.evento = evento;
	}

	public String getAll() {
		return
				"ID do Equipamento: " + id + "\n" +
				"Hostname: " + hostname + "\n" +
				"IP: " + ip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public List<ItmnEvento> getEvento() {
		return evento;
	}

	public void setEvento(List<ItmnEvento> evento) {
		this.evento = evento;
	}
	
}
