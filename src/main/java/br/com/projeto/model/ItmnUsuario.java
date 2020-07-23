package br.com.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class ItmnUsuario {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email", length=255)
	private String email;
	
	@Column(name="racf", length=7)
	private String racf;
	
	@Column(name="senha", length=255)
	private String senha;
		
	public ItmnUsuario() {
		super();
	}
	
	public ItmnUsuario(String email, String racf, String senha) {
		super();
		this.email = email;
		this.racf = racf;
		this.senha = senha;
	}
	
	public String getAll() {
		return
				"E-mail: " + email + "\n" +
				"RACF: " + racf + "\n" +
				"Senha: " + senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
