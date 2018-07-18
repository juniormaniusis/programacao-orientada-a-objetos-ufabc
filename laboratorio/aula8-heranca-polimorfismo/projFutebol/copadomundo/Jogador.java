package copadomundo;

public class Jogador {

  private int numeroCamisa;
  protected String posicao;

  public Jogador(int numeroCamisa){
    this.numeroCamisa = numeroCamisa;
    this.posicao = "Jogador.";
  }

  public void  imprimirPosicao() {
    System.out.println(this.posicao +"   "+ this.numeroCamisa);
  }

}
