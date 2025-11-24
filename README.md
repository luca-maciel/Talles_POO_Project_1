# Controle de Estoque - Loja de Presentes 

### Integrantes do Grupo
- Gabriela da Silva Rodrigues https://github.com/bagirodrigues
- Gabriele Aparecida Bispo Chalegre https://github.com/gab-ie
- Lucas Ferreira Maciel https://github.com/luca-maciel


### Descrição do Sistema

O sistema é um controle de estoque desenvolvido em Java, aplicando todos os principais conceitos de Programação Orientada a Objetos.
Ele permite:

- Cadastro de produtos
- Entrada e saída de estoque
- Registro de movimentações (histórico)
- Relatórios simples
- Persistência dos dados usando serialização
- Validações com exceptions personalizadas
- Uso de herança, classes abstratas e polimorfismo


O sistema é acessado por meio de um menu interativo, executado no console, onde o usuário escolhe as operações desejadas.


### Como Executar o Sistema

1. Clonar o repositório
git clone https://github.com/luca-maciel/Talles_POO_Project_1 cd projeto-estoque

2. Compilar
javac -d bin src/**/*.java

3. Executar
java -cp bin controle.estoque.Main


### Conceitos Implementados (e onde encontrar)

1. Estruturas Lógicas

Local:

Menu.java (switch-case de opções, loops)

Produto.java, Pessoa.java, Fornecedor.java (validações em setters)

EstoqueService.java (validação de estoque)


2. Construtores

Local:

Todas as entidades possuem construtor vazio e construtor com parâmetros
Exemplos:

Produto.java

Categoria.java

Fornecedor.java

EntradaEstoque.java / SaidaEstoque.java


3. Encapsulamento

Local:

Todos os atributos são privados

Getters/setters implementados corretamente

Setters com validações
Exemplos:

Pessoa.java (validação de nome, email, CPF)

Fornecedor.java (validação de CNPJ)


4. Herança + Classe Abstrata

Local:

Classe abstrata: Movimentacao.java

Filhas:

EntradaEstoque.java

SaidaEstoque.java


Outra hierarquia:

Pessoa.java → Cliente.java / Funcionario.java


5. Polimorfismo + ArrayList + Relacionamento

Local:

MovimentacaoRepository.java

ArrayList<Movimentacao> armazena EntradaEstoque e SaidaEstoque (polimorfismo)


Relacionamentos:

Categoria → Produtos (1:N)

Movimentações ↔ Produtos (N:N)


6. Serialização

Local:

Serializador.java
Usado por:

ProdutoRepository.java

MovimentacaoRepository.java


Permite persistência dos dados entre execuções.


7. Exceptions + Tratamento

Local:

Exceptions personalizadas:

CPFInvalidoException.java

DbConnectionErrorException.java

EstoqueInsuficienteException.java


Tratamento em:

Menu.java

EstoqueService.java
