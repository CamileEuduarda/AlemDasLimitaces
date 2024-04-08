package alemdaslimitacoes.ifba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alemdaslimitacoes.ifba.model.Frequencia;
import alemdaslimitacoes.ifba.repository.FrequenciaRepository;

@Service
public class FrequenciaService {

	@Autowired
	private FrequenciaRepository repositorio;

	public Frequencia add(Frequencia frequencia) {
		return repositorio.save(frequencia);
	}

	public void deletarFrequencia(int id) {
		repositorio.deleteById(id);
	}

	public List<Frequencia> listarFrequencias() {
		return repositorio.findAll();
	}

	public Frequencia atualizarFrequencia(Frequencia frequencia) {
		return repositorio.save(frequencia);
	}

	public Optional<Frequencia> localizarPorId(int id) {
		return repositorio.findById(id);
	}
}
