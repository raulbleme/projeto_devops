package br.com.projeto.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projeto.model.CarregarEventos;

public interface CarregarEventosDAO extends CrudRepository<CarregarEventos, Integer>{
	
	@Query(value="SELECT data_evt FROM itmn_evento WHERE data_evt >= :inicio AND data_evt <= :fim", nativeQuery=true)
	ArrayList<CarregarEventos> getByPeriodo(@Param("inicio") Date inicio, @Param("fim") Date fim);
}
