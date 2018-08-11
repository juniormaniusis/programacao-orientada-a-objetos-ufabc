import java.util.*;
public class Acao {
  private String codigo;
  private double valor;

  private List<AcaoObserver> interessados = new ArrayList<AcaoObserver>();

  public Acao(String codigo, double valor) {
    this.codigo = codigo;
    this.valor = valor;
  }

  public void attach(AcaoObserver interessado) {
    interessados.add(interessado);
  }

  public double getState() {
    return valor;
  }

  public void setState(double valor) {
    this.valor = valor;
    this.notifyObservers();
  }

  public void notifyObservers() {
    for (AcaoObserver observer : interessados) {
      observer.update(codigo, valor);
    }
  }
}
