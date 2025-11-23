package controle.estoque.entitites;

public class SaidaEstoque extends Movimentacao {
    private Cliente cliente;
    private String formaPagamento;
    private double valorTotal;

    public SaidaEstoque (){}

    public SaidaEstoque(Cliente cliente, String formaPagamento, double valorTotal) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public void registrarSaida(){
    }

    @Override
    public String getTipoMovimentacao() {
        return "Saída";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
