
public class Corretora implements AcaoObserver {
  private String nome;

  public Corretora(String nome) {
    this.nome = nome;
  }

  @Override
  public void update(String codigo, double valor) {
    System.out.println(this.nome + " A ação " + codigo + "alterou p/ " + valor );
  }

}
