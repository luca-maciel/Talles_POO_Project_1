package controle.estoque.entitites;
import controle.estoque.exceptions.EstoqueInsuficienteException;
import java.time.LocalDate;


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


   public void abaterEstoque (int quantidadeAbater){
        if (this.quantidade >= quantidadeAbater){
            this.quantidade -= quantidadeAbater;
        } else {
            throw new RuntimeException("Estoque insuficiente");
        }
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
        if (!formaPagamento.equalsIgnoreCase("pix") &&
                !formaPagamento.equalsIgnoreCase("crédito") &&
                !formaPagamento.equalsIgnoreCase("débito") &&
                !formaPagamento.equalsIgnoreCase("dinheiro"))
            throw new IllegalArgumentException("Forma de pagamento inválida");

        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal <= 0)
            throw new IllegalArgumentException("Valor total inválido");
        this.valorTotal = valorTotal;
    }
}
