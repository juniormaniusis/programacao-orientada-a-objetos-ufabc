public class Principal {
  public static void main(String[] args) {
    Acao acao = new Acao("Petrobras", 32.24);

    Corretora corretora1 = new Corretora("Corretora1");
    Corretora corretora2 = new Corretora("Corretora2.0");

    acao.attach(corretora1);
    acao.attach(corretora2);

    acao.setState(24.2);
    acao.setState(2.99);
    acao.setState(104.89);

    
  }
}
