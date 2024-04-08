package alemdaslimitacoes.ifba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import alemdaslimitacoes.ifba.model.Turma;
import alemdaslimitacoes.ifba.service.TurmaService;

@Controller
public class TurmaController {

	@Autowired
	private TurmaService service;

	@PostMapping("/turma")
	public Turma add(@RequestBody Turma turma) {
		return service.inserir(turma);
	}

	@GetMapping("/turma")
	public List<Turma> list() {
		return service.listar();
	}

	@GetMapping("/turma/{id}")
	public Optional<Turma> localizarPorId(@PathVariable int id) {
		return service.localizarPorId(id);
	}

	@PutMapping("/turma/{id}")
	public Turma atualizar(@PathVariable int id, @RequestBody Turma turma) {
		turma.setId(id);
		return service.atualizar(turma);
	}

	@DeleteMapping("/turma/{id}")
	public void deletar(@PathVariable int id) {
		service.deletarPorId(id);
	}
}