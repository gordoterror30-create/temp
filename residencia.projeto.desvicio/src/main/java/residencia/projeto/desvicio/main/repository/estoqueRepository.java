package residencia.projeto.desvicio.main.repository;

import residencia.projeto.desvicio.main.model.produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class estoqueRepository {

//    private List<produto> produtos = List.of (
//            new produto(1,"garrafa de agua", 10),
//            new produto(2, "tomate angolano", 230),
//            new produto(3,"anao chines", 2),
//            new produto(4,"cavalo marinho", 15),
//            new produto(5,"xinforinfola", 8)
//    );

    public List<produto> mostrarTudo() {
        return produtos;
   }

    private List<produto> produtos= new ArrayList<>();
    private Long id = 1L;

    public List<produto> listar() {
        return produtos;
    }

    public boolean delete(Long id) {
        produto p = buscar(id);
        produtos.remove(p);
        return true;
    }

    public produto buscar (Long id) {
        for (produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }

        }
        return null;
    }


}
