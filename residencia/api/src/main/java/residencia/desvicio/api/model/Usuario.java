package residencia.desvicio.api.model;

public class Usuario {


    private int id_user;
    private String nome;
    private String senha;
    private String email;


    public Usuario(int id_user, String nome, String senha, String email) {
        this.id_user = id_user;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }


    public int getId_user() {
        return id_user;
    }


    public void setId_user(int id_user) {
        this.id_user = id_user;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}

