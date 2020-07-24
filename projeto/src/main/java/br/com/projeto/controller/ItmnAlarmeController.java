package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.ItmnAlarmeDAO;
import br.com.projeto.model.ItmnAlarme;

@CrossOrigin("*")
@RestController
public class ItmnAlarmeController {

	@Autowired
	private ItmnAlarmeDAO dao;
	
	@GetMapping("/alarmes")
	public ResponseEntity<ArrayList<ItmnAlarme>> exibirTodosAlarmes(){
		ArrayList<ItmnAlarme> lista =  (ArrayList<ItmnAlarme>) dao.findAll();		
		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

}
