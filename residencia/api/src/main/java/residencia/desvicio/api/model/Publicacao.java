package residencia.desvicio.api.repository;

import residencia.desvicio.api.model.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacaoRepository extends JpaRepository<Publicacao, Long> {

}