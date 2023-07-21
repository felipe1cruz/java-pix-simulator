package com.trybe.simuladordepix;

/**
 * Classe de erro caso saldo seja insuficiente.
 */
public class ErroSaldoInsufiiente extends ErroDePix {

  ErroSaldoInsufiiente() {
    super("O Saldo é insuficiente!");
  }
}
