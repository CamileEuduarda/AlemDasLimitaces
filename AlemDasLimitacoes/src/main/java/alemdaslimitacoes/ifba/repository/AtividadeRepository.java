package alemdaslimitacoes.ifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Atividades;


@Repository
public interface AtividadeRepository extends JpaRepository<Atividades, Long> {
	    
}
