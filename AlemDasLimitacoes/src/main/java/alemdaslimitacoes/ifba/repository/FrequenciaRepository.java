package alemdaslimitacoes.ifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Frequencia;

@Repository
public interface FrequenciaRepository extends JpaRepository<Frequencia, Integer> {
}