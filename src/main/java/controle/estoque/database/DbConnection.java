package controle.estoque.database;

import controle.estoque.exceptions.DbConnectionErrorException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/teste";
    private static final String USER = "postgres";
    private static final String PASSWORD = "7695";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new DbConnectionErrorException("Erro ao conectar ao banco");
        }
    }
}