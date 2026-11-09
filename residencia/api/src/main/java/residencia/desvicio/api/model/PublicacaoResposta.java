package residencia.desvicio.api.model;

import java.sql.Timestamp;

public class PublicacaoResposta {
    private Long id_publicacao;
    private String texto;
    private Timestamp data_publicacao;
    private UsuarioResposta autor;

    public PublicacaoResposta(Long id_publicacao, String texto,
                              Timestamp data_publicacao, UsuarioResposta autor) {
        this.id_publicacao = id_publicacao;
        this.texto = texto;
        this.data_publicacao = data_publicacao;
        this.autor = autor;
    }

    public Long getId_publicacao() {
        return id_publicacao;
    }

    public String getTexto() {
        return texto;
    }

    public Timestamp getData_publicacao() {
        return data_publicacao;
    }

    public UsuarioResposta getAutor() {
        return autor;
    }
}