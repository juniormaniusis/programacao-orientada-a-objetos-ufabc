package geometria;

public abstract class Poligono extends FiguraPlana {
  private double[] lados;

  public Poligono(String tipo, double[] lados) {
    super(tipo);
    this.lados = lados;
  }

  public double getLado(int numLado) {
    if (numLado > lados.length || numLado < 0) {
      return 0;
    }
    return lados[numLado];
  }

  @Override
  public double getPerimetro() {
    double perimetro = 0;
    for (int i = 0; i < lados.length; i++) {
      perimetro += getLado(i);
    }
    return perimetro;
  }


}
