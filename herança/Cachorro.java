public class Cachorro extends Mamifero {

  @Override
  public void emitirSom() {
      System.out.println("Au Au");
  }

  @Override
  public void movimentar() {
      System.out.println(this.nome + " está andando");
  }


  @Override
  public void comer() {
      System.out.println(this.nome + " está comendo ração");
  }

  public void atacar() {
      System.out.println(this.nome + "latindo");
  }



  public void atacar(int tipo) {
      if(tipo==1){
        System.out.println(this.nome + " Atacando com dentes");
      }else{
        System.out.println(this.nome + " au au au");
      }
  }

}