package controle.estoque.database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManipulation {
    static void getClientes(){
        try{
            DbConnection.getConnection().executeQuery("SELECT * FROM clientes;");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
}
