package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe processador de pix.
 */
public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio sem envolver as interações
   * do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação entre o aplicativo e
   *         o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    Conexao conexao = null;
    try {
      if (valor <= 0) {
        throw new ErroValorNaoPositivo();
      }
      if (chave == null || chave.isBlank()) {
        throw new ErroChaveEmBranco();
      }
      conexao = servidor.abrirConexao();
      String resposta = conexao.enviarPix(valor, chave);
      if (!resposta.equals("sucesso")) {
        tratamentoResposta(resposta);
      }
    } finally {
      if (conexao != null) {
        conexao.close();
      }
    }

  }

  /**
   * Método para tratar possíveis erros de pix.
   */
  public void tratamentoResposta(String resposta) throws ErroDePix {
    if ("saldo_insuficiente".equals(resposta)) {
      throw new ErroSaldoInsuficiente();
    }
    if ("chave_pix_nao_encontrada".equals(resposta)) {
      throw new ErroChaveNaoEncontrada();
    } else {
      throw new ErroInterno();
    }
  }
}
