package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.ItmnEventoDAO;
import br.com.projeto.model.ItmnEvento;

@CrossOrigin("*")
@RestController
public class ItmnEventoController {

	@Autowired
	private ItmnEventoDAO dao;
	
	@GetMapping("/eventos")
	public ResponseEntity<ArrayList<ItmnEvento>> exibirTodosEventos(){
		ArrayList<ItmnEvento> lista =  (ArrayList<ItmnEvento>) dao.findAll();		
		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

}