
package residencia.desvicio.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name = "publicacao")
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacao")
    private Long id_publicacao;

    @NotBlank(message = "O texto da publicação é obrigatório.")
    @Size(max = 1000, message = "A publicação deve ter no máximo 1000 caracteres.")
    @Column(name = "texto", nullable = false, length = 1000)
    private String texto;

    @Column(name = "data_publicacao")
    private Timestamp data_publicacao;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Usuario usuario; //FK

    public Publicacao() {
    }

    public Publicacao(String texto, Timestamp data_publicacao, Usuario usuario) {
        this.texto = texto;
        this.data_publicacao = data_publicacao;
        this.usuario = usuario;
    }

    public Long getId_publicacao() {
        return id_publicacao;
    }

    public void setId_publicacao(Long id_publicacao) {
        this.id_publicacao = id_publicacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Timestamp getData_publicacao() {
        return data_publicacao;
    }

    public void setData_publicacao(Timestamp data_publicacao) {
        this.data_publicacao = data_publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}