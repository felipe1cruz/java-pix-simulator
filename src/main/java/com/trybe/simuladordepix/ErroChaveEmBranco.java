package com.trybe.simuladordepix;

/**
 * Classe de erro caso a chave esteja em branco.
 */
public class ErroChaveEmBranco extends ErroDePix {
  ErroChaveEmBranco() {
    super("A chave Pix não pode estar em branco.");
  }
}
