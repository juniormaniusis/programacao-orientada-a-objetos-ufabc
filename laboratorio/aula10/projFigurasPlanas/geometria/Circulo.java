package geometria;
public class Circulo extends FiguraPlana{
  private double raio;

  public Circulo(int raio) {
    super("Circulo");
    this.raio = raio;
  }

  @Override
  public double getPerimetro() {
    return 2*Math.PI*raio;
  }

  @Override
  public double getArea() {
    return Math.PI * raio * raio;
  }

}
