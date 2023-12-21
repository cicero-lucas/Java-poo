public class Controle implements Icontrole {
  private boolean ligado;
  private int volume;
  private int canal;
  private boolean menu;

  public Controle() {
    this.ligado = false;
    this.volume = 10;
    this.canal = 8;
    this.menu = false;
  }
  
  public boolean isLigado() {
  	return ligado;
  }
  public void setLigado(final boolean ligado) {
  	this.ligado = ligado;
  }
  public int getVolume() {
  	return volume;
  }
  public void setVolume(final int volume) {
  	this.volume = volume;
  }
  public int getCanal() {
  	return canal;
  }
  public void setCanal(final int canal) {
  	this.canal = canal;
  }
  public boolean isMenu() {
  	return menu;
  }
  public void setMenu(final boolean menu) {
  	this.menu = menu;
  }

  @Override
  public void ligar() {
    if(this.isLigado() == false) {
      this.setLigado(true);
      System.out.println("TV ligada");
    }else{
      this.setLigado(false);
      System.out.println("TV desligada");
    }
  }

  @Override
  public void desligar() {
    if(this.isLigado() == true) {
      this.setLigado(false);
      System.out.println("TV desligada");
    }else{
      this.setLigado(true);
      System.out.println("TV ligada");
    }
  }

  @Override
  public void abrirMenu() {
    if(this.isLigado()==true){
      if(this.isMenu() == false) {
        this.setMenu(true);
        System.out.println("---------------------");
        System.out.println("----- M E N U ----");
        System.out.println("----Volumer: " + this.getVolume());
        System.out.println("----Tela: " + this.getCanal());
        System.out.println("-----Legenda----------------");
        System.out.println("------Sistema "+this.isLigado());
      }else{
        this.setMenu(false);
        System.out.println("menu fechado");
      }
      
    }
    
  }

  @Override
  public void volumeMais() {
    if(this.isLigado()==true){
      
      if(this.getVolume()<20){
        this.setVolume(this.getVolume()+1);
        String l = "| ";
        String result = l.repeat(this.getVolume());
        System.out.println (result);
        }else{
          String l = "| ";
          String result = l.repeat(this.getVolume());
          System.out.println("Volume:" + result);
        }
    }
  }

  @Override
  public void volumeMenos() {
    if(this.isLigado()==true){
      if(this.getVolume()>0){
        this.setVolume(this.getVolume()-1);
        String l = "| ";
        String result = l.repeat(this.getVolume());
        System.out.println("Volume: "+result);
      }else{
        String l = "| ";
        String result = l.repeat(this.getVolume());
        System.out.println("Volume: "+result);
      }
    }
  }

  @Override
  public void fecharMenu() {
    if(this.isLigado()==true){
      if(this.isMenu()==true){
        this.setMenu(false);
        System.out.println("menu fechado");
      }
    }
  }

  @Override
  public void canalMais() {
    if(this.isLigado()==true){

      if(this.getCanal()<10){
        this.setCanal(this.getCanal()+1);;
        System.out.println("Canal:"+ this.getCanal());
      }else{
        System.out.println("Canal" +this.getCanal());
      }
    }
  }

  @Override
  public void canalMenos() {
      if(this.isLigado()==true){

        if(this.getCanal()<10){
          this.setCanal(this.getCanal()-1);;
          System.out.println("Canal:"+ this.getCanal());
        }else{
          System.out.println("Canal" +this.getCanal());
        }
      }
  }

  @Override

  public void mutar(){
    if(this.isLigado()==true){
      if(this.getVolume()>=1){
        this.setVolume(0);
      }else{
        this.setVolume(this.getVolume());
      }
    }
  }

  


}
