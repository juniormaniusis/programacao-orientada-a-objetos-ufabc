package loteria;
public class NumeroAleatorio{
  public int getNumeroAleatorio() {
    return (int) Math.round(Math.random() * 10);
  }
}
