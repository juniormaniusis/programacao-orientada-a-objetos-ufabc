package geometria;
public abstract class  FiguraPlana {

  private String tipo;

  public FiguraPlana(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  public abstract double getArea();
  public abstract double getPerimetro();

  @Override
  public String toString() {
    return "["+getTipo()+"][A = " + getArea() + "][P = " + getPerimetro()+"]";
  }

}
