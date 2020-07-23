package br.com.projeto.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="itmn_evento")
public class ItmnEvento {

	@Column(name="num_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numSeq;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@Column(name="data_evt")
	private Date data;
	
	@JsonIgnoreProperties("evento")
	@ManyToOne
	private ItmnEquipamento idEquipamento;
	
	@JsonIgnoreProperties("evento")
	@ManyToOne
	private ItmnAlarme idAlarme;
	
	public String getAll() {
		return
				"Número: " + numSeq + "\n" +
				"Data do Evento: " + data + "\n" +
				"ID do Equipamento: " + idEquipamento + "\n" +
				"ID do Alarme: " + idAlarme;
	}
	
	public ItmnEvento() {
		super();
	}

	public ItmnEvento(int numSeq, Date data, ItmnEquipamento idEquipamento, ItmnAlarme idAlarme) {
		super();
		this.numSeq = numSeq;
		this.data = data;
		this.idEquipamento = idEquipamento;
		this.idAlarme = idAlarme;
	}
	
	public void setAll(int numSeq, Date data, ItmnEquipamento idEquipamento, ItmnAlarme idAlarme) {
		this.numSeq = numSeq;
		this.data = data;
		this.idEquipamento = idEquipamento;
		this.idAlarme = idAlarme;
	}
	
	
	
	public int getNumSeq() {
		return numSeq;
	}
	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ItmnEquipamento getIdEquipamento() {
		return idEquipamento;
	}
	public void setIdEquipamento(ItmnEquipamento idEquipamento) {
		this.idEquipamento = idEquipamento;
	}
	public ItmnAlarme getIdAlarme() {
		return idAlarme;
	}
	public void setIdAlarme(ItmnAlarme idAlarme) {
		this.idAlarme = idAlarme;
	}
	
	
}
