package controle.estoque.exceptions;

public class DbConnectionErrorException extends RuntimeException{
    public DbConnectionErrorException(String message){
        super(message);
    }
}
