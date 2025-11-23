package controle.estoque.entitites;

import java.time.LocalDate;

public abstract class Movimentacao {
    protected int id;
    protected Produto produto;
    protected int quantidade;
    protected LocalDate data;
    protected Funcionario responsavel;

    public abstract String getTipoMovimentacao();
}
