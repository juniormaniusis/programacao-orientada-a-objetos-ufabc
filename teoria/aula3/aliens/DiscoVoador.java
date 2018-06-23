package aliens;
public class DiscoVoador{
  private int posicaoInicial = 0;
  private String cor;
  //getters and setters
  public String getCor() {
    return this.cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public int getPosicao() {
    return this.posicaoInicial;
  }
  public void irParaFrente(int metros) {
    //existe uma limitação que só pode mover-se
    //200 metros por vez.
    if ((metros > 0) && (metros < 200) ){
      System.out.printf("Avançou %d metros \n", metros);
      posicaoInicial += metros;
    }else{
      System.out.println("Não foi possível locomover-se!");
    }
  }

}
