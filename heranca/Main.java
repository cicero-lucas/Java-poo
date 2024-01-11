class Main {
  public static void main(String[] args) {
    
    Cachorro c = new Cachorro("ralf",4);
    
    Gato g = new Gato("gato",10);

    Tutor t = new Tutor("teo",g);
    t.atacar();
    
    t.informar();
  }

}
