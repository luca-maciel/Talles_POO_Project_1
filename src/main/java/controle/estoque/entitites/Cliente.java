package controle.estoque.entitites;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<SaidaEstoque> compras = new ArrayList<>();

    public void adicionarCompra(SaidaEstoque venda){
        this.compras.add(venda);
        }
    }


