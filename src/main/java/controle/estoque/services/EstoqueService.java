package controle.estoque.services;

import controle.estoque.entitites.Produto;
import controle.estoque.entitites.movimentacoes.EntradaEstoque;
import controle.estoque.entitites.movimentacoes.SaidaEstoque;
import controle.estoque.exceptions.EstoqueInsuficienteException;
import controle.estoque.repositories.MovimentacaoRepository;
import controle.estoque.repositories.ProdutoRepository;

import java.time.LocalDate;

public class EstoqueService {

    private ProdutoRepository produtoRepo;
    private MovimentacaoRepository movRepo;

    public EstoqueService(ProdutoRepository produtoRepo, MovimentacaoRepository movRepo) {
        this.produtoRepo = produtoRepo;
        this.movRepo = movRepo;
    }

    public void entradaEstoque(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior que zero.");
        }

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidade);

        EntradaEstoque entrada = new EntradaEstoque();
        entrada.setProduto(produto);
        entrada.setQuantidade(quantidade);
        entrada.setData(LocalDate.now());

        movRepo.adicionar(entrada);
        produtoRepo.salvarDados();
    }

    public void saidaEstoque(Produto produto, int quantidade) {
        if (quantidade <= 0)
            throw new IllegalArgumentException("Quantidade inválida");

        if (produto.getQuantidadeEstoque() < quantidade)
            throw new EstoqueInsuficienteException("Estoque insuficiente");

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);

        SaidaEstoque saida = new SaidaEstoque();
        saida.setProduto(produto);
        saida.setQuantidade(quantidade);
        saida.setData(LocalDate.now());

        movRepo.adicionar(saida);
        produtoRepo.salvarDados();
    }
}