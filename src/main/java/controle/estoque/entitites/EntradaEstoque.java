package controle.estoque.entitites;

public class EntradaEstoque extends Movimentacao {
    private Fornecedor fornecedor;
    //private String notaFiscal;

    public EntradaEstoque (){}

    public EntradaEstoque(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void registrarEntrada (){
        this.produto.aumentarEstoque(this.quantidade);
    }

    @Override
    public String getTipoMovimentacao() {
        return "Entrada.";
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
