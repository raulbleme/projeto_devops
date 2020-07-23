package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.ItmnEquipamentoDAO;
import br.com.projeto.model.ItmnEquipamento;

@CrossOrigin("*")
@RestController
public class ItmnEquipamentoController {

	@Autowired
	private ItmnEquipamentoDAO dao;
	
	@GetMapping("/equipamentos")
	public ResponseEntity<ArrayList<ItmnEquipamento>> exibirTodosEquipamentos(){
		ArrayList<ItmnEquipamento> lista = (ArrayList<ItmnEquipamento>) dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(500).build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}
}
