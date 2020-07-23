package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.CarregarEventosDAO;
import br.com.projeto.model.CarregarEventos;
import br.com.projeto.model.Intervalo;

@CrossOrigin("*")
@RestController
public class CarregarEventosController {

	@Autowired
	private CarregarEventosDAO dao;
	
	@PostMapping("/carregareventos")
	public ResponseEntity<ArrayList<CarregarEventos>> getByPeriodo(@RequestBody Intervalo intervalo){
		ArrayList<CarregarEventos> lista =  (ArrayList<CarregarEventos>) dao.getByPeriodo(intervalo.getInicio(), intervalo.getFim());		
		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

}
