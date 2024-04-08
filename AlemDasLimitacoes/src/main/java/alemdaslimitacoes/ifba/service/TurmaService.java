package alemdaslimitacoes.ifba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alemdaslimitacoes.ifba.model.Turma;
import alemdaslimitacoes.ifba.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository repositorio;

	public Turma inserir(Turma turma) {
		return repositorio.save(turma);
	}

	public void deletarPorId(int id) {
		repositorio.deleteById(id);
	}

	public List<Turma> listar() {
		return repositorio.findAll();
	}

	public Turma atualizar(Turma turma) {
		return repositorio.save(turma);
	}

	public Optional<Turma> localizarPorId(int id) {
		return repositorio.findById(id);
	}
}
