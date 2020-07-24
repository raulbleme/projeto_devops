package br.com.projeto.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projeto.model.ItmnEvento;

public interface ItmnEventoDAO extends CrudRepository<ItmnEvento, Integer>{
	
	@Query(value="SELECT * FROM itmn_evento WHERE data_evt >= :inicio AND data_evt <= :fim ORDER BY data_evt", nativeQuery=true)
	ArrayList<ItmnEvento> getByPeriodo(@Param("inicio") Date inicio, @Param("fim") Date fim);
	
	@Query(value="SELECT count(id_alarme_id_alarme) as total FROM itmn_evento WHERE data_evt >= :inicio AND data_evt <= :fim AND id_alarme_id_alarme = :id_alarme", nativeQuery=true)
	long getByAlarme(@Param("inicio") Date inicio, @Param("fim") Date fim, @Param("id_alarme") int id_alarme);
}
