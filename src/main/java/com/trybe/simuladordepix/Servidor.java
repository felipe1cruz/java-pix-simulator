package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe servidor.
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
