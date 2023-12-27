public class Gato extends Mamifero {

  @Override
  public void emitirSom() {
      System.out.println("miau miau ...");
  }

  @Override
  public void movimentar() {
      System.out.println(this.nome + " está andando");
  }


  @Override
  public void comer() {
      System.out.println(this.nome + " está comendo ração de peixe");
  }

  public void atacar() {
      System.out.println(this.nome + "miaaaaau....");
  }



  public void atacar(int tipo) {
      if(tipo==1){
        System.out.println(this.nome + " Atacando com dentes e patas");
      }else{
        System.out.println(this.nome + " miaaau....");
      }
  }

}