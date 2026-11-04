
package residencia.desvicio.api.service;

import org.springframework.stereotype.Service;
import residencia.desvicio.api.model.Usuario;
import residencia.desvicio.api.model.UsuarioResposta;
import residencia.desvicio.api.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioResposta> buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .map(usuario -> new UsuarioResposta(
                        usuario.getId_user(),
                        usuario.getNome(),
                        usuario.getEmail()
                ));
    }

    public List<UsuarioResposta> buscarPorNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(usuario -> new UsuarioResposta(
                        usuario.getId_user(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .toList();
    }
}
