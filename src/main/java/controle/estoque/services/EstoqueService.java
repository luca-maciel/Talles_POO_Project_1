package controle.estoque.services;

import controle.estoque.entitites.*;
import controle.estoque.exceptions.EstoqueInsuficienteException;
import controle.estoque.repositories.MovimentacaoRepository;
import controle.estoque.repositories.ProdutoRepository;
import java.time.LocalDate;

public class EstoqueService {
    private ProdutoRepository produtoRepo;
    private MovimentacaoRepository movRepo;

    public EstoqueService(ProdutoRepository pr, MovimentacaoRepository mr) {
        this.produtoRepo = pr;
        this.movRepo = mr;
    }

    public void entradaEstoque(Produto p, int qtd) {
        p.setQuantidadeEstoque(p.getQuantidadeEstoque() + qtd);

        EntradaEstoque mov = new EntradaEstoque();
        mov.setProduto(p);
        mov.setQuantidade(qtd);
        mov.setData(LocalDate.now());

        movRepo.adicionar(mov);
        produtoRepo.atualizar();
    }

    public void saidaEstoque(Produto p, int qtd) throws EstoqueInsuficienteException {
        if (p.getQuantidadeEstoque() < qtd) {
            throw new EstoqueInsuficienteException("Quantidade insuficiente no estoque!");
        }
        p.setQuantidadeEstoque(p.getQuantidadeEstoque() - qtd);

        SaidaEstoque mov = new SaidaEstoque();
        mov.setProduto(p);
        mov.setQuantidade(qtd);
        mov.setData(LocalDate.now());

        movRepo.adicionar(mov);
        produtoRepo.atualizar();
    }
}