package com.trybe.simuladordepix;

/**
 * Classe de Erro Caso valor não seja positivo.
 */
public class ErroValorNaoPositivo extends ErroDePix {
  ErroValorNaoPositivo() {
    super("O valor do Pix não pode ser menor nem igual a zero.");
  }
}
