package copadomundo;
public class Lateral extends Jogador{

  public Lateral(int numeroCamisa, String EsqOuDir){
    super(numeroCamisa);
    if (EsqOuDir == "esquerda") {
      this.posicao = "lateral esquerda" ;
    } else {
      this.posicao = "lateral direita";
    }
  }


}
