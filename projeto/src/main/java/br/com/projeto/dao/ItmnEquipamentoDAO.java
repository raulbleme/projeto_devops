package br.com.projeto.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnEquipamento;

public interface ItmnEquipamentoDAO extends CrudRepository<ItmnEquipamento, Integer>{

	@Query(value="SELECT hostname FROM itmn_equipamento", nativeQuery=true)
	ArrayList<ItmnEquipamento> getByHostname(String hostname);
}
