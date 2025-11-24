package controle.estoque.entitites;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private boolean ativo;
    private ArrayList<SaidaEstoque> vendasFeitas = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String cargo, double salario, LocalDate dataAdmissao, boolean ativo) {
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.ativo = ativo;
    }


    public void registrarVenda (SaidaEstoque venda){
        this.vendasFeitas.add(venda);

    }

    public double calcularTotalVendas(){
        double total = 0;
        for (SaidaEstoque venda : vendasFeitas){
            total += venda.getValorTotal();
        }
        return total;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}