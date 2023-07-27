# Java Pix Simulator

## Sobre
Projeto desenvolvido em Java, com o objetivo de simular um processo de transferência bancária via Pix, com foco no tratamento de erros (chave pix em branco, valor transferido menor ou igual a zero, etc).

Os erros são tratados, e as seguintes mensagem são retornadas:
    Sucesso: Pix realizado com sucesso.
    Valor menor ou igual a zero: O valor do Pix não pode ser menor nem igual a zero.
    Chave em branco: A chave Pix não pode estar em branco.
    Saldo insuficiente: Seu saldo é insuficiente.
    Chave Pix não encontrada: Chave Pix não encontrada.
    Erro interno: Erro interno.
    Qualquer exceção derivada de IOException: Erro de conexão.

## Arquivos
Os seguintes arquivos foram desenvolvidos por mim:

- pasta `/src/main/java/com/trybe/simuladordepix/` seguintes arquivos:
- `ControladorDePix.java`;
- `ErroChaveEmBranco.java`;
- `ErroChaveNaoEncontrada.java`;
- `ErroInterno.java`;
- `ErroSaldoInsuficiente.java`;
- `ErroValorNaoPositivo.java`;
- `ProcessadorDePix.java`;

A Trybe forneceu a configuração inicial do projeto e demais arquivos não listados.

## Tecnologias
As seguintes tecnologias foram aplicadas por mim nesse projeto:
- Java;
- Java Exceptions;

## Como executar a aplicação em sua máquina

1. Clone o repositório, e entre na pasta do repositório que você acabou de clonar.
2. Instale as depêndencias do projeto com o comando `mvn install`
3. Rode e teste a aplicação através da Classe Principal!;
