package residencia.desvicio.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import residencia.desvicio.api.model.PublicacaoResposta;
import residencia.desvicio.api.service.PublicacaoService;

import java.util.List;

@RestController
@RequestMapping("/publicacoes")
public class PublicacaoController {

    private final PublicacaoService publicacaoService;

    public PublicacaoController(PublicacaoService publicacaoService) {
        this.publicacaoService = publicacaoService;
    }


    @GetMapping
    public ResponseEntity<List<PublicacaoResposta>> listar() {
        return ResponseEntity.ok(publicacaoService.listar());
    }


    @GetMapping("/{id}")
    public ResponseEntity<PublicacaoResposta> buscarPorId(@PathVariable Long id) {
        return publicacaoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}