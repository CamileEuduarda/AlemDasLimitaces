package alemdaslimitacoes.ifba.controller;

import alemdaslimitacoes.ifba.model.Avaliacao;
import alemdaslimitacoes.ifba.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AvaliacaoController {

	@Autowired
	private AvaliacaoService service;

	@GetMapping("/avaliacao/{id}")
	public Optional<Avaliacao> localizarPorId(@PathVariable Integer id) {
		return service.localizarPorId(id);
	}

	@PostMapping("/avaliacao")
	public Avaliacao adicionarAvaliacao(@RequestBody Avaliacao avaliacao) {
		return service.adicionarAvaliacao(avaliacao);
	}

	@GetMapping("/avaliacoes")
	public List<Avaliacao> listarAvaliacoes() {
		return service.listarAvaliacoes();
	}

	@PutMapping("/avaliacao")
	public Avaliacao atualizarAvaliacao(@RequestBody Avaliacao avaliacao) {
		return service.atualizarAvaliacao(avaliacao);
	}

	@DeleteMapping("/avaliacao/{id}")
	public void deletarAvaliacao(@PathVariable Integer id) {
		service.deletarAvaliacao(id);
	}
}