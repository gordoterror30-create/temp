
package residencia.desvicio.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import residencia.desvicio.api.model.Usuario;
import residencia.desvicio.api.model.UsuarioResposta;
import residencia.desvicio.api.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioResposta> criar(@Valid @RequestBody Usuario usuario) {

        Usuario usuarioCriado = usuarioService.cadastrar(usuario);

        UsuarioResposta resposta = new UsuarioResposta(
                usuarioCriado.getId_user(),
                usuarioCriado.getNome(),
                usuarioCriado.getEmail()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResposta> buscarPorId(@PathVariable Long id) {

        return usuarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResposta>> buscarPorNome(
            @RequestParam String nome) {

        List<UsuarioResposta> usuarios = usuarioService.buscarPorNome(nome);

        return ResponseEntity.ok(usuarios);
    }
}
