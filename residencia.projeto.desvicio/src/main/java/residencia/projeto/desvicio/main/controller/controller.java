package residencia.projeto.desvicio.main.controller;

import residencia.projeto.desvicio.main.model.produto;
import residencia.projeto.desvicio.main.service.estoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estoque")

public class controller {

    public estoqueService service;

    public controller(estoqueService service) {
        this.service = service;
    }

    @GetMapping
    public List<produto> mostrarTudo() {
        return service.mostrarTudo();
    }


}
