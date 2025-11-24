package controle.estoque.services;

import controle.estoque.entitites.Movimentacao;
import controle.estoque.repositories.MovimentacaoRepository;
import java.util.List;

public class RelatorioService {
    private MovimentacaoRepository movRepo;

    public RelatorioService(MovimentacaoRepository repo) {
        this.movRepo = repo;
    }

    public void listarMovimentacoes() {
        List<Movimentacao> lista = movRepo.listar();

        System.out.println("\n MOVIMENTAÇÕES");
        for (Movimentacao m : lista) {
            System.out.println(m);
        }
    }
}