package controle.estoque.entitites;

import java.time.LocalDateTime;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private LocalDateTime dataCadastro;

}