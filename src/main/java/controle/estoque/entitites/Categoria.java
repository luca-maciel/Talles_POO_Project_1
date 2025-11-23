package controle.estoque.entitites;

import java.util.ArrayList;

public class Categoria {
    private int id;
    private String nome;
    private String descricao;
    //private ArrayList<>

    public Categoria (){}

    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarProduto(){
    }

    public void removerProduto (){
    }

    //public ArrayList<Produto> listarProdutos(ArrayList<Produto>){}

    public void contarProdutos (){
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
