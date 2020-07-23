package br.com.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnAlarme;

public interface ItmnAlarmeDAO extends CrudRepository<ItmnAlarme, Integer>{
	
}
