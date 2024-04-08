package alemdaslimitacoes.ifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}