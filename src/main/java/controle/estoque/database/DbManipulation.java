package controle.estoque.database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbManipulation {
    static void getClientes(){
        try {
            Connection conn = DbConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes;");

            // (opcional) apenas para evitar warning e mostrar algo:
            while (rs.next()) {
                System.out.println("Cliente: " + rs.getString(1));
            }

        } catch(SQLException e){
            System.err.println(e);
        }
    }
}
