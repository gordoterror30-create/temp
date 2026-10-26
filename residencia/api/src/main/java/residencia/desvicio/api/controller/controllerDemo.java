package residencia.desvicio.api.controller;

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import residencia.desvicio.api.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class controllerDemo {

    @PostMapping
    public ResponseEntity<Usuario> criar(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuario);
    }
=======
public class controllerDemo {

//    classe vazia por enquanto
>>>>>>> 303f59a6a5fec6ebf770f070c94e481651eb31d7
}
