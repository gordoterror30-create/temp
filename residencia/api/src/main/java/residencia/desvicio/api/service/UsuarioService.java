package residencia.desvicio.api.service;

import org.springframework.stereotype.Service;
import residencia.desvicio.api.model.Usuario;
import residencia.desvicio.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}