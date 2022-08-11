package com.trybe.gerarpessoausuaria;


/** Classe Usuario. */
public class Usuario extends Pessoa {
  
  Usuario(String nome, String sobrenome) {
    super.nome = nome;
    super.sobrenome = sobrenome;        
  }

  /** Método para pegar o nome e sobrenome do usuário. */
  public String getUsuario() {
    if (nome == null || sobrenome == null) {
      return "Usuário inválido";

    } else if (nome.length() == 0 || sobrenome.length() == 0) {
      return "Usuário inválido";
    }
    
    return nome + "." + sobrenome;
  }
}
