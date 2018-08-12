import java.util.Scanner;
public class Principal {
  public static void main(String[] args) {

    NotificaPalavra notificador = new NotificaPalavra();

    Observer contaPalavras = new ObserverContaPalavra();
    Observer contaPares = new ObserverContaPalavrasPares();
    Observer contaMaiusculas = new ObserverContaMaiusculas();

    notificador.attach(contaPalavras);
    notificador.attach(contaPares);
    notificador.attach(contaMaiusculas);

    Scanner teclado = new Scanner(System.in);
    boolean continuar = true;

    do {
      //le a frase do teclado
      System.out.println("Digite a frase: ");
      String frase = teclado.next();

      //processa a frase e imprime os totais
      notificador.processaFrase(frase);
      notificador.imprimirTotais();

      //verifica se é para continuar lendo frases
      System.out.println("Deseja continuar? (s/n)");
      String cont = teclado.next();

      if (cont.charAt(0) == 's') {
        continuar = true;
      } else {
        continuar = false;
      }


    }while(continuar);

  }
}
