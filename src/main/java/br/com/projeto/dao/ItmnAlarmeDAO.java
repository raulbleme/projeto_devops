package br.com.projeto.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnAlarme;

public interface ItmnAlarmeDAO extends CrudRepository<ItmnAlarme, Integer>{
	
	@Query(value="SELECT nome FROM itmn_alarme", nativeQuery=true)
	ArrayList<ItmnAlarme> getByNome(String nome);
}
