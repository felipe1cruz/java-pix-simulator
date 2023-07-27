package com.trybe.simuladordepix;

/**
 * Classe de erro genérico caso um erro desconhecido aconteça.
 */
public class ErroInterno extends ErroDePix {

  ErroInterno() {
    super("Erro interno.");
  }
}
