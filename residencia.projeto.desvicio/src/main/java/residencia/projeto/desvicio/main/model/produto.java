package residencia.projeto.desvicio.main.model;

public class produto {

    private long id;
    private String nome;
    private int quantidade;

    public produto (long id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;


    }


    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
