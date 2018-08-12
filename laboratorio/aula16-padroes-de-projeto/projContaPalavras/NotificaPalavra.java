import java.util.ArrayList;

public class NotificaPalavra {


  public NotificaPalavra(){
    System.out.println("Notificador criado.");
  }
  private ArrayList<Observer> observadores = new ArrayList<Observer>();
  private int numObservers;

  public void processaFrase(String frase) {
      for (String palavra : frase.split(" ")){
        for (Observer observador : observadores) {
          observador.update(palavra);
        }
      }
  }

  public void attach(Observer o) {
    observadores.add(o);
    numObservers++;
  }

  public ArrayList<Observer> getObservers() {
    return this.observadores;
  }

  public void imprimirTotais() {
    for (Observer o : observadores) {
      System.out.println(o.getClass() + " = " + o.palavrasContadas());
    }
  }
}
