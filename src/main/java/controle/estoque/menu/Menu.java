package controle.estoque.menu;

import controle.estoque.entitites.Produto;
import controle.estoque.exceptions.EstoqueInsuficienteException;
import controle.estoque.repositories.MovimentacaoRepository;
import controle.estoque.repositories.ProdutoRepository;
import controle.estoque.services.EstoqueService;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);
    private final ProdutoRepository produtoRepo = new ProdutoRepository();
    private final MovimentacaoRepository movRepo = new MovimentacaoRepository();
    private final EstoqueService estoqueService = new EstoqueService(produtoRepo, movRepo);

    public void iniciar() {
        int opc;

        do {
            System.out.println("\n1 - Cadastrar Produto");
            System.out.println("2 - Entrada Estoque");
            System.out.println("3 - Saída Estoque");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Listar Movimentações");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
    case 1 -> cadastrarProduto();
    case 2 -> entrada();
    case 3 -> saida();
    case 4 -> listarProdutos();
    case 5 -> listarMovimentacoes();
    case 0 -> System.out.println("Encerrando...");
    default -> System.out.println("Opção Inválida");
            }
        } while (opc != 0);
    }

    private void cadastrarProduto() {
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        double preco = Double.parseDouble(sc.nextLine());

        System.out.println("Quantidade Inicial: ");
        int qtd = Integer.parseInt(sc.nextLine());

        Produto p = new Produto();
        p.setNome(nome);
        p.setPreco(preco);
        p.setQuantidadeEstoque(qtd);

        produtoRepo.adicionar(p);

        System.out.println("Produto Cadastrado!");
    }

    private void listarProdutos() {
        System.out.println("\n PRODUTOS CADASTRADOS");
        for (Produto p : produtoRepo.getTodos()) {
            System.out.println("ID: " + p.getId()
                    + " Nome: " + p.getNome()
                    + " Estoque: " + p.getQuantidadeEstoque());
        }
    }

    private void entrada() {
        System.out.println("ID do produto: ");
        int id = Integer.parseInt(sc.nextLine());

        Produto p = produtoRepo.buscarId(id);
        if (p == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println("Quantidade a adicionar: ");
        int qtd = Integer.parseInt(sc.nextLine());

        estoqueService.entradaEstoque(p, qtd);

        System.out.println("Entrada Registrada!");
    }

    private void saida() {
        System.out.println("ID do produto: ");
        int id = Integer.parseInt(sc.nextLine());

        Produto p = produtoRepo.buscarId(id);
        if (p == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println("Quantidade a retirar: ");
        int qtd = Integer.parseInt(sc.nextLine());

        try {
            estoqueService.saidaEstoque(p, qtd);
            System.out.println("Saída registrada!");
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    private void listarMovimentacoes() {
        System.out.println("\n MOVIMENTAÇÕES");
        movRepo.getTodos().forEach( m ->
                System.out.println(m.getTipoMovimentacao() +
                        " Prod: " + m.getProduto().getNome() +
                        " Qtd: " + m.getQuantidade() +
                        " Data: " + m.getData())
        );
    }
}
