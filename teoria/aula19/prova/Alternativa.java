public class Alternativa implements Cloneable {

  private String texto;

  public Alternativa(String s){
    this.texto = s;
  }

  public void setTexto(String s){
    this.texto = s;
  }
  public String getTexto(){
    return this.texto;
  }

  @Override
  public Alternativa clone() {
    try {
        return (Alternativa) super.clone();
    } catch(Exception e) {
      System.out.println(e);
    }
    return null;
  }
}
