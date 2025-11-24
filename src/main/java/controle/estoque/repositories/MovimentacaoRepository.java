package controle.estoque.repositories;

import controle.estoque.entitites.Movimentacao;
import controle.estoque.utils.Serializador;
import java.util.ArrayList;

public class MovimentacaoRepository {
    private final String ARQUIVO = "movimentacoes.dat";
    private ArrayList<Movimentacao> lista;

    public MovimentacaoRepository() {
        lista = Serializador.carregar(ARQUIVO);
        if (lista == null) lista = new ArrayList<>();
    }

    public ArrayList<Movimentacao> getTodos() {
        return lista;
    }

    public void salvarDados() {
        Serializador.salvar(lista, ARQUIVO);
    }

    public void adicionar(Movimentacao m) {
        lista.add(m);
        salvarDados();
    }

    public ArrayList<Movimentacao> listar() {
        return lista;
    }
}