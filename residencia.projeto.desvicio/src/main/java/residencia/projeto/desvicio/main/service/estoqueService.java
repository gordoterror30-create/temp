package residencia.projeto.desvicio.main.service;

import residencia.projeto.desvicio.main.model.produto;
import residencia.projeto.desvicio.main.repository.estoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class estoqueService {
    private estoqueRepository repository;

    public estoqueService(estoqueRepository repository) {
        this.repository = repository;
    }

    public List<produto> mostrarTudo() {
        return repository.mostrarTudo();
    }
}
