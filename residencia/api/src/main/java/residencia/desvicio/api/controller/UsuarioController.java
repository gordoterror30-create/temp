package residencia.desvicio.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import residencia.desvicio.api.model.UsuarioResposta;
import residencia.desvicio.api.service.UsuarioService;

import residencia.desvicio.api.model.Usuario;

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

        UsuarioResposta resposta = new UsuarioResposta( //EVITA MOSTRAR A SENHA
                usuarioCriado.getId_user(),
                usuarioCriado.getNome(),
                usuarioCriado.getEmail()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }
}