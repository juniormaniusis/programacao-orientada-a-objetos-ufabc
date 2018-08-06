package geometria;

public class Triangulo extends Poligono {

  public Triangulo(double a, double b, double c) {
    super("Triangulo", new double[]{a, b, c});
    System.out.println(getLado(0));
    System.out.println(getLado(1));
    System.out.println(getLado(2));
  }


  @Override
  public double getArea() {
    //formula de heron
    double p;

    p = (getLado(0) + getLado(1) + getLado(2))/2;
    double area = 0;
    area = p*(p-getLado(0))*((p-getLado(1)))*((p-getLado(2)));

    area = Math.sqrt(area);

    return area;
  }
}
