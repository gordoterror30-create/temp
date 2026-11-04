
package residencia.desvicio.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import residencia.desvicio.api.model.Usuario;
import residencia.desvicio.api.model.UsuarioResposta;
import residencia.desvicio.api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public ResponseEntity<UsuarioResposta> criar(@Valid @RequestBody Usuario usuario) {

        Usuario usuarioCriado = usuarioRepository.save(usuario);

        UsuarioResposta resposta = new UsuarioResposta(
                usuarioCriado.getId_user(),
                usuarioCriado.getNome(),
                usuarioCriado.getEmail()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResposta> buscarPorId(@PathVariable Long id) {

        return usuarioRepository.findById(id)
                .map(usuario -> new UsuarioResposta(
                        usuario.getId_user(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResposta>> buscarPorNome(
            @RequestParam String nome) {

        List<UsuarioResposta> usuarios = usuarioRepository
                .findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(usuario -> new UsuarioResposta(
                        usuario.getId_user(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .toList();

        return ResponseEntity.ok(usuarios);
    }
}
