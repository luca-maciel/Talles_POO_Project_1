package controle.estoque.entitites;

import java.time.LocalDate;

public abstract class Movimentacao {
    protected int id;
    protected Produto produto;
    protected int quantidade;
    protected LocalDate data;
    protected Funcionario responsavel;

    public abstract String getTipoMovimentacao();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null)
            throw new IllegalArgumentException("Produto não pode ser nulo");
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0)
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
}


