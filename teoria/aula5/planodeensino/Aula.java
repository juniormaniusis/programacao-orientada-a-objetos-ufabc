public class Aula{
  private String titulo;

  //contrutores
  public Aula(String titulo) {
    this.setTitulo(titulo);
  }

  //getters e setters
  public String getTitulo(){
    return this.titulo;
  }
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  public String toString(){
    return ("["+this.getTitulo()+"]");
  }
  
}
