package geometria;

public class Quadrado extends Retangulo {

  public Quadrado(double lado) {
    super("Quadrado", lado, lado);
  }

  @Override
  public double getPerimetro() {
    return 4*getLado(0);
  }


}
