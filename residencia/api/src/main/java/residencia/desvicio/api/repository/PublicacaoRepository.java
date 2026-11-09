package residencia.desvicio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import residencia.desvicio.api.model.Publicacao;

public interface PublicacaoRepository extends JpaRepository<Publicacao, Long> {
}