package com.trybe.simuladordepix;

/**
 * Classe de erro caso o saldo seja insuficiente.
 */
public class ErroSaldoInsuficiente extends ErroDePix {
  ErroSaldoInsuficiente() {
    super("Seu saldo é insuficiente.");
  }

}
