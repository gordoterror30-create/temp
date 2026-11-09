package residencia.desvicio.api.service;

import org.springframework.stereotype.Service;
import residencia.desvicio.api.model.Publicacao;
import residencia.desvicio.api.model.PublicacaoResposta;
import residencia.desvicio.api.model.UsuarioResposta;
import residencia.desvicio.api.repository.PublicacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacaoService {

    private final PublicacaoRepository publicacaoRepository;

    public PublicacaoService(PublicacaoRepository publicacaoRepository) {
        this.publicacaoRepository = publicacaoRepository;
    }

    public List<PublicacaoResposta> listar() {
        return publicacaoRepository.findAll()
                .stream()
                .map(this::converter)
                .toList();
    }

    public Optional<PublicacaoResposta> buscarPorId(Long id) {
        return publicacaoRepository.findById(id)
                .map(this::converter);
    }

    private PublicacaoResposta converter(Publicacao p) {
        UsuarioResposta autor = new UsuarioResposta(
                p.getUsuario().getId_user(),
                p.getUsuario().getNome(),
                p.getUsuario().getEmail()
        );
        return new PublicacaoResposta(
                p.getId_publicacao(),
                p.getTexto(),
                p.getData_publicacao(),
                autor
        );
    }
}