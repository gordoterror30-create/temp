package residencia.desvicio.api.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Usuario {


    private int id_user;
    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    private String nome;
    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 6, max = 50, message = "A senha deve ter entre 6 e 50 caracteres.")
    private String senha;
    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "O email informado é inválido.")
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

