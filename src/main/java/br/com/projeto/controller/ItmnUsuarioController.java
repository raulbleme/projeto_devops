package br.com.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dao.ItmnUsuarioDAO;
import br.com.projeto.model.ItmnUsuario;

@CrossOrigin("*")
@RestController
public class ItmnUsuarioController {

	@Autowired
	private ItmnUsuarioDAO dao;
	
	@PostMapping("/loginracf")
	public ResponseEntity<ItmnUsuario> efetuarLoginRacf(@RequestBody ItmnUsuario usuario){
		ItmnUsuario objeto = dao.findByRacfAndSenha(usuario.getRacf(), usuario.getSenha());
		if(objeto == null) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(objeto);
		}
	}
	
	@PostMapping("/loginemail")
	public ResponseEntity<ItmnUsuario> efetuarLoginEmail(@RequestBody ItmnUsuario usuario){
		ItmnUsuario objeto = dao.findByRacfAndSenha(usuario.getEmail(), usuario.getSenha());
		if(objeto == null) {
			return ResponseEntity.status(403).build();
		}
		else {
			return ResponseEntity.ok(objeto);
		}
	}
		
	@GetMapping("/usuarios")
	public ResponseEntity<ArrayList<ItmnUsuario>> exibirTodosUsuarios(){
		ArrayList<ItmnUsuario> lista =  (ArrayList<ItmnUsuario>) dao.findAll();		
		if (lista.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(lista);
		}
	}

}
