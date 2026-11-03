package residencia.desvicio.api.model;

public class UsuarioResposta { //DTO PARA DADOS DO USER
    private Long id_user;
    private String nome;
    private String email;

    public UsuarioResposta(Long id_user, String nome, String email) {
        this.id_user = id_user;
        this.nome = nome;
        this.email = email;
    }

    public Long getId_user() {
        return id_user;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}