public class Tutor {
  
  private String nome;
  private Mamifero animal;

  public Tutor(String nome, Mamifero animal){
    this.nome=nome;
    this.animal=animal;

  }

  public void informar(){
    System.out.println("------------------------");
    System.out.println("Nome: "+ this.nome);
    System.out.println("Animal: "+ this.animal.getNome());
    System.out.println("Animal: "+ this.animal.getIdade());

  }

  
  public void usarAtaqueAnimal(Mamifero animal) {
    this.animal.atacar();
  }
  
}

