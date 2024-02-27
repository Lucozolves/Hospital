package projeto.hospital;

class Conta {
  String nome;
  String senha;
  String idade;

  Conta(String nome, String senha, String idade){
      this.nome = nome;
      this.senha = senha;
      this.idade = idade;
  }

  public String getNome() {
      return nome;
  }

  public String getSenha() {
      return senha;
  }

  public String getIdade() {
      return idade;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public void setIdade(String idade) {
      this.idade = idade;
  }
}
