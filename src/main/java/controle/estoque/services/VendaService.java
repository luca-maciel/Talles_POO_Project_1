package controle.estoque.services;

import controle.estoque.entitites.Produto;
import controle.estoque.exceptions.EstoqueInsuficienteException;
import controle.estoque.repositories.ProdutoRepository;

public class VendaService {
    private ProdutoRepository produtoRepo;

    public VendaService(ProdutoRepository repo) {
        this.produtoRepo = repo;
    }

    public double vender(int id, int qtd) throws EstoqueInsuficienteException {
        Produto p = produtoRepo.buscarId(id);
        if (p == null) return -1;

        if (p.getQuantidadeEstoque() < qtd) {
            throw new EstoqueInsuficienteException("Estoque insuficiente!");
        }

        p.setQuantidadeEstoque(p.getQuantidadeEstoque() - qtd);
        produtoRepo.atualizar();

        return p.getPreco() * qtd;
    }
}