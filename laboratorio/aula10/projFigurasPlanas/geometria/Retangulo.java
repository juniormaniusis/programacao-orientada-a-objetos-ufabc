package geometria;

public abstract class Retangulo extends Poligono{

  public Retangulo(String tipo, double lado1, double lado2){
    super(tipo, new double[] {lado1, lado2});
  }

  @Override
  public double getArea() {
    return getLado(0) * getLado(1);
  }


}
