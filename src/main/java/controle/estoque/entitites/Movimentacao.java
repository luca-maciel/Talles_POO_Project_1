package controle.estoque.entitites;

import java.time.LocalDate;

public abstract class Movimentacao {
    protected int id;
    protected Produto produto;
    protected int quantidade;
    protected LocalDate data;
    protected Funcionario responsavel;

    public LocalDate getData() {
        return data;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    public abstract String getTipoMovimentacao();
}
