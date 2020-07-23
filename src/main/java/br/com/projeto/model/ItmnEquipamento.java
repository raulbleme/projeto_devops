package br.com.projeto.model;

public class ItmnEquipamento {

	private int id;
	private String hostname;
	private String ip;
	
	public ItmnEquipamento() {
		super();
	}
	
	public ItmnEquipamento(int id, String hostname, String ip) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
	}
	
	public void setAll(int id, String hostname, String ip) {
		this.id = id;
		this.hostname = hostname;
		this.ip = ip;
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
	
	
}
