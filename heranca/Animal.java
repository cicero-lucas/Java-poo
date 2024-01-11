public abstract class Animal {
  
  private String tipo;
  private int idade;
  private float peso;
  private String sexo;

  public String getTipo() {
      return tipo;
  }

  public void setTipo(String tipo) {
      this.tipo = tipo;
  }

  public int getIdade() {
      return idade;
  }

  public void setIdade(int idade) {
      this.idade = idade;
  }

  public float getPeso() {
      return peso;
  }

  public void setPeso(float peso) {
      this.peso = peso;
  }

  public String getSexo() {
      return sexo;
  }

  public void setSexo(String sexo) {
      this.sexo = sexo;
  }

  public abstract void emitirSom();
  public abstract void movimentar();
  public abstract void comer();
}

