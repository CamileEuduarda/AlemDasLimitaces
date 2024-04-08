package alemdaslimitacoes.ifba.service;

import alemdaslimitacoes.ifba.model.Avaliacao;
import alemdaslimitacoes.ifba.repository.AvaliacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository repositorio;

	public Avaliacao adicionarAvaliacao(Avaliacao avaliacao) {
		return repositorio.save(avaliacao);
	}

	public void deletarAvaliacao(Integer id) {
		repositorio.deleteById(id);
	}

	public List<Avaliacao> listarAvaliacoes() {
		return repositorio.findAll();
	}

	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		return repositorio.save(avaliacao);
	}

	public Optional<Avaliacao> localizarPorId(Integer id) {
		return repositorio.findById(id);
	}
}