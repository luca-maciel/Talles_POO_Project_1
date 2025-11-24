package controle.estoque;

import controle.estoque.entitites.Fornecedor;
import controle.estoque.menu.Menu;
import controle.estoque.repositories.MovimentacaoRepository;
import controle.estoque.repositories.ProdutoRepository;
import controle.estoque.services.EstoqueService;
import controle.estoque.utils.ArquivoUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fornecedor> fornecedores =
                ArquivoUtils.lerFornecedores("fornecedores.csv");

        System.out.println("Fornecedores carregados: " + fornecedores.size());

        ProdutoRepository produtoRepo = new ProdutoRepository();
        MovimentacaoRepository movRepo = new MovimentacaoRepository();
        EstoqueService estoqueService = new EstoqueService(produtoRepo, movRepo);

        Menu menu = new Menu(produtoRepo, movRepo, estoqueService);
        menu.iniciar();
    }
}