package controle.estoque.entitites;

import java.util.ArrayList;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String descricao;
    private Categoria categoria;
    private Fornecedor fornecedor;
    //private ArrayList<>

    public Produto (){}

    public Produto(int id, String nome, double preco, int quantidadeEstoque, String descricao, Categoria categoria, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.descricao = descricao;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public void temEstoque (){
    }

    public void aumentarEstoque (){
    }

    public void abaterEstoque (){
    }

    //public void calcularValorTotalEstoque (){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
