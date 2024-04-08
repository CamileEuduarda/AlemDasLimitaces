package alemdaslimitacoes.ifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Avaliacao;


@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>{
		
}