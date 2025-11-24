// Main criado para testar a conexão com o banco

package controle.estoque.database;
import controle.estoque.exceptions.DbConnectionErrorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    // Muda para a URL do banco em questão
    private static final String URL = "jdbc:postgresql://localhost:5432/teste";
    // Muda para o user do banco
    private static final String USER = "postgres";
    // Senha do user do banco
    private static final String PASSWORD = "7695";

    public static Statement getConnection() {
        try {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                Statement st = conn.createStatement();
                return st;
            }
        }
        catch (SQLException e) {
            throw new DbConnectionErrorException("Erro ao conectar ao banco");
        }
    }
}
