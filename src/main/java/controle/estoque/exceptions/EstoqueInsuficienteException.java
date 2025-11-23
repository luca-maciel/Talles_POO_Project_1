package controle.estoque.exceptions;

public class EstoqueInsuficienteException extends  RuntimeException {
    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}