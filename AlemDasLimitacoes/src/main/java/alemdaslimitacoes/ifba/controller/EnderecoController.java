package alemdaslimitacoes.ifba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import alemdaslimitacoes.ifba.model.Endereco;
import alemdaslimitacoes.ifba.service.EnderecoService;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService service;

	@GetMapping("/{id}")
	public Optional<Endereco> localizarPorId(int id) {
		return service.localizarPorId(id);
	}

	@PostMapping
	public Endereco add(@RequestBody Endereco endereco) {
		return service.inserir(endereco);
	}

	@GetMapping
	public List<Endereco> list() {
		return service.listar();
	}

	@PutMapping
	public Endereco atualizar(@RequestBody Endereco endereco) {
		return service.atualizar(endereco);
	}

	public void deletar(@PathVariable int id) {
		service.deletarPorId(id);
	}
}