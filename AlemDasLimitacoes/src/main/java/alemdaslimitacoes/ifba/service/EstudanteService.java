package alemdaslimitacoes.ifba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alemdaslimitacoes.ifba.model.Estudante;
import alemdaslimitacoes.ifba.repository.EstudanteRepository;

@Service
public class EstudanteService {

	@Autowired
	private EstudanteRepository repositorio;

	public Estudante adicionarEstudante(Estudante estudante) {
		return repositorio.save(estudante);
	}

	public void deletarEstudante(int id) {
		repositorio.deleteById(id);
	}

	public List<Estudante> listarEstudantes() {
		return repositorio.findAll();
	}

	public Estudante atualizarEstudante(Estudante estudante) {
		return repositorio.save(estudante);
	}

	public Optional<Estudante> localizarPorId(int id) {
		return repositorio.findById(id);
	}
}