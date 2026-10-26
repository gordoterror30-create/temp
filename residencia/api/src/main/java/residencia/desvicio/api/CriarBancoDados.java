package residencia.desvicio.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CriarBancoDados {

    @EventListener(ApplicationReadyEvent.class)
    public void criarBanco() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "admin";

        try (Connection conexao = DriverManager.getConnection(
                url, usuario, senha);
             Statement comando = conexao.createStatement()) {

            ResultSet resultado = comando.executeQuery(
                    "SELECT 1 FROM pg_database WHERE datname = 'desvicio'");

            if (!resultado.next()) {
                comando.executeUpdate("CREATE DATABASE desvicio");
                System.out.println("Banco desvicio criado!");
            } else {
                System.out.println("Banco desvicio já existe.");
            }
        }
    }
}