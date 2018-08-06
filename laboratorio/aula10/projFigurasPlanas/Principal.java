import geometria.*;

public class Principal {

  public static void main(String[] args) {
      FiguraPlana[] figuras = new FiguraPlana[3];

      figuras[0] = new Quadrado(5);
      figuras[1] = new Circulo(1);
      figuras[2] = new Triangulo(3, 4, 5);

      for (FiguraPlana fp : figuras) {
        System.out.println(fp);
      }

  }


}
