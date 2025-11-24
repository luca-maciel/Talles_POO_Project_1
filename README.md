# 📊 Controle de Estoque - Loja de Presentes 🎁

### 👯‍♀️ Integrantes do Grupo
- Gabriela da Silva Rodrigues https://github.com/bagirodrigues
- Gabriele Aparecida Bispo Chalegre https://github.com/gab-ie
- Lucas Ferreira Maciel https://github.com/luca-maciel

### Descrição do Sistema

O projeto é um sistema de controle de estoque desenvolvido em Java, utilizando:

Herança
Polimorfismo
Serialização
Exceptions personalizadas
Arquivos .dat
Menu interativo
Organização por camadas (Entities, Repositories, Services, Utils)

O sistema permite:

Cadastrar produtos
Registrar entradas e saídas de estoque
Gerar movimentações
Persistir dados no disco
Listar relatórios
Validar dados (CPF, CNPJ, e-mail etc.)



### Como Executar

1. Clonar o repositório

git clone https://github.com/usuario/projeto-estoque.git
cd projeto-estoque

2. Compilar

javac -d bin src/**/*.java

3. Executar

java -cp bin controle.estoque.Main


### Conceitos Implementados (onde encontrar cada um)

1. Estruturas Lógicas

if/else → validações de CPF, CNPJ, e-mail

switch → Menu

loops → listagens e buscas



2. Construtores

Exemplo: Produto, Categoria, Fornecedor.



3. Encapsulamento

Todos os atributos são privados → getters/setters com validação.



4. Herança + Abstract

Classe abstrata: Pessoa

Filhas: Cliente, Funcionario

Classe abstrata: Movimentacao

Filhas: EntradaEstoque, SaidaEstoque



5. Polimorfismo + ArrayList

ArrayList<Movimentacao> armazena entradas e saídas

Relacionamentos:

Categoria → Produtos (1:N)

Produto → Movimentações (N:N, via service)



6. Serialização

Serializador.java

Produtos e Movimentações são salvos em:

produtos.dat

movimentacoes.dat



7. Exceptions Personalizadas

CPFInvalidoException

DbConnectionErrorException

EstoqueInsuficienteException

