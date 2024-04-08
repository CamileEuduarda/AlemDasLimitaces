package alemdaslimitacoes.ifba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alemdaslimitacoes.ifba.model.Estudante;


@Repository
public interface EstudanteRepository extends JpaRepository<Estudante,Integer> {
}

