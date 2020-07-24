package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.ItmnAlarmeDAO;
import br.com.projeto.dao.ItmnEventoDAO;
import br.com.projeto.model.CarregarAlarmes;
import br.com.projeto.model.CarregarEventos;
import br.com.projeto.model.Intervalo;
import br.com.projeto.model.ItmnAlarme;
import br.com.projeto.model.ItmnEvento;

@CrossOrigin("*")
@RestController
public class ItmnEventoController {

	@Autowired
	private ItmnEventoDAO dao;
	
	@Autowired
	private ItmnAlarmeDAO dao_alarmes;

	@GetMapping("/eventos")
	public ResponseEntity<ArrayList<ItmnEvento>> exibirTodosEventos() {

		ArrayList<ItmnEvento> lista = (ArrayList<ItmnEvento>) dao.findAll();
		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

	@PostMapping("/relatorioeventos")
	public ResponseEntity<ArrayList<CarregarEventos>> getByPeriodo(@RequestBody Intervalo intervalo) {
		ArrayList<ItmnEvento> evento = (ArrayList<ItmnEvento>) dao.getByPeriodo(intervalo.getInicio(),
				intervalo.getFim());
		ArrayList<CarregarEventos> lista = new ArrayList<CarregarEventos>();

		for (int cont = 0; cont < evento.size(); cont++) {
			CarregarEventos eventos = new CarregarEventos(evento.get(cont).getData(),
					evento.get(cont).getIdAlarme().getNome(), evento.get(cont).getIdEquipamento().getHostname());
			lista.add(eventos);
		}

		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}
	
	@PostMapping("/relatorioalarmes")
	public ResponseEntity<ArrayList<CarregarAlarmes>> alarmesIntervalo(@RequestBody Intervalo intervalo){
		ArrayList<ItmnAlarme> lista_alarmes = (ArrayList<ItmnAlarme>) dao_alarmes.findAll();
		ArrayList<CarregarAlarmes> saida = new ArrayList<CarregarAlarmes>();
		CarregarAlarmes objeto = null;
		
		for(ItmnAlarme a : lista_alarmes) {
			objeto = new CarregarAlarmes();
			objeto.setNome(a.getNome());
			objeto.setQtde(dao.getByAlarme(intervalo.getInicio(), intervalo.getFim(), a.getId()));
			saida.add(objeto);
		}
		
		if (saida.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(saida);
		}
	}
	
}