
package alemdaslimitacoes.ifba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import alemdaslimitacoes.ifba.model.Estudante;
import alemdaslimitacoes.ifba.service.EstudanteService;

@Controller
public class EstudanteController {

	@Autowired
	private EstudanteService service;

	@GetMapping("/estudante/{id}")
	public Optional<Estudante> localizarPorId(@PathVariable int id) {
		return service.localizarPorId(id);
	}

	@PostMapping("/estudante")
	public Estudante adicionarEstudante(@RequestBody Estudante estudante) {
		return service.adicionarEstudante(estudante);
	}

	@GetMapping("/estudantes")
	public List<Estudante> listarEstudantes() {
		return service.listarEstudantes();
	}

	@PutMapping("/estudante")
	public Estudante atualizarEstudante(@RequestBody Estudante estudante) {
		return service.atualizarEstudante(estudante);
	}

	@DeleteMapping("/estudante/{id}")
	public void deletarEstudante(@PathVariable int id) {
		service.deletarEstudante(id);
	}
}