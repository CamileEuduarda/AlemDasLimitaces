package alemdaslimitacoes.ifba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alemdaslimitacoes.ifba.model.Endereco;
import alemdaslimitacoes.ifba.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repositorio;

	public Endereco inserir(Endereco endereco) {
		return repositorio.save(endereco);
	}

	public void deletarPorId(int id) {
		repositorio.deleteById(id);
	}

	public List<Endereco> listar() {
		return repositorio.findAll();
	}

	public Endereco atualizar(Endereco endereco) {
		return repositorio.save(endereco);
	}

	public Optional<Endereco> localizarPorId(int id) {
		return repositorio.findById(id);
	}
}