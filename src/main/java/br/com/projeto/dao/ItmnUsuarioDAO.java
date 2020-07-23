package br.com.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnUsuario;

public interface ItmnUsuarioDAO extends CrudRepository<ItmnUsuario, Integer>{
	
	ItmnUsuario findByRacfAndSenha(String racf, String senha);
}
