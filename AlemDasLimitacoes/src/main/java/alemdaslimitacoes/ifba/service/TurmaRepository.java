package alemdaslimitacoes.ifba.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Frequencia;

@Repository
public interface TurmaRepository extends JpaRepository<Frequencia, Integer> {

}
