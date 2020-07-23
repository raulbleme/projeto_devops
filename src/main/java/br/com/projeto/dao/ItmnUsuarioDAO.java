package br.com.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnUsuario;

public interface ItmnUsuarioDAO extends CrudRepository<ItmnUsuario, Integer>{
	
	ItmnUsuario findByEmailAndSenha(String email, String senha);
	ItmnUsuario findByRacfAndSenha(String racf, String senha);
}
