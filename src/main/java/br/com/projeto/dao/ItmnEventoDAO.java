package br.com.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.model.ItmnEvento;

public interface ItmnEventoDAO extends CrudRepository<ItmnEvento, Integer>{
	
	//@Query(value="SELECT data_evt, itmn_alarme.nome, itmn_equipamento.hostname FROM itmn_evento "
	//		+ "INNER JOIN itmn_equipamento ON itmn_evento.id_equip = itmn_equipamento.id_equip "
	//		+ "INNER JOIN itmn_alarme AS a ON itmn_evento.id_alarme = itmn_alarme.id_alarme "
	//		+ "WHERE data_evt >= :inicio AND data_evt <= :fim "
	//		+ "ORDER BY 1", nativeQuery=true)
	//ArrayList<ItmnEvento> getByPeriodo(@Param("inicio") Date inicio, @Param("fim") Date fim);
	
}
