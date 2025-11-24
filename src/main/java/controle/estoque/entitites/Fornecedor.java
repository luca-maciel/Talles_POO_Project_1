package controle.estoque.entitites;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.ArrayList;

public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private String endereco;
    private ArrayList<EntradaEstoque> fornecimentos = new ArrayList<>();

    public Fornecedor (){
    }

    public Fornecedor(int id, String nome, String cnpj, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public void registrarFornecimento(EntradaEstoque entrada) {
        this.fornecimentos.add(entrada);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID inválido");
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}"))
            throw new IllegalArgumentException("CNPJ inválido");
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}