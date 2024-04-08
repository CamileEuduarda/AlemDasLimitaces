package alemdaslimitacoes.ifba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alemdaslimitacoes.ifba.model.Atividades;
import alemdaslimitacoes.ifba.repository.AtividadeRepository;

public class AtividadesService {

	@Service
	public class AtividadeService {

		@Autowired
		private AtividadeRepository atividadesRepository;

		public Atividades adicionarAtividade(Atividades atividade) {
			return atividadesRepository.save(atividade);
		}

		public Optional<Atividades> localizarPorId(Long id) {
			return atividadesRepository.findById(id);
		}

		public List<Atividades> listarAtividades() {
			return atividadesRepository.findAll();
		}

		public Atividades atualizarAtividade(Atividades atividade) {
			return atividadesRepository.save(atividade);
		}

		public void deletarAtividade(Long id) {
			atividadesRepository.deleteById(id);
		}
	}

}
