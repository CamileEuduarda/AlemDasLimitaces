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

import alemdaslimitacoes.ifba.model.Frequencia;
import alemdaslimitacoes.ifba.service.FrequenciaService;

@Controller
public class FrequenciaController {

	@Autowired
	private FrequenciaService service;

	@GetMapping("/Frequência/{id}")
	public Optional<Frequencia> localizarPorId(@PathVariable int id) {
		return service.localizarPorId(id);
	}

	@PostMapping("/Frequência")
	public Frequencia adicionarFrequencia(@RequestBody Frequencia frequencia) {
		return service.add(frequencia);
	}

	@GetMapping("/Frequência")
	public List<Frequencia> listarFrequencias() {
		return service.listarFrequencias();
	}

	@PutMapping("/Frequência")
	public Frequencia atualizarFrequencia(@RequestBody Frequencia frequencia) {
		return service.atualizarFrequencia(frequencia);
	}

	@DeleteMapping("/Frequência/{id}")
	public void deletarFrequencia(@PathVariable int id) {
		service.deletarFrequencia(id);
	}
}