package controle.estoque.repositories;

import controle.estoque.entitites.Produto;
import controle.estoque.utils.Serializador;

import javax.lang.model.element.ModuleElement;
import java.util.ArrayList;

public class ProdutoRepository {

    private final String ARQUIVO = "produtos.dat";
    private ArrayList<Produto> produtos;

    public ProdutoRepository() {
        produtos = Serializador.carregar(ARQUIVO);
        if (produtos == null) produtos = new ArrayList<>();
    }

    public void salvarDados() {
        Serializador.salvar(produtos, ARQUIVO);
    }

    public void adicionar(Produto p) {
        produtos.add(p);
        salvarDados();
    }

    public ArrayList<Produto> getTodos() {
        return produtos;
    }

    public Produto buscarId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void atualizar() {
        salvarDados();
    }
}
