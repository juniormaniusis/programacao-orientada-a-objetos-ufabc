package universidade;
public class Pessoa{
  private String cpf;
  private String nome;

  public String getNome(){
    return this.nome;
  }
  public String getCpf(){
    return this.cpf;
  }

  public void setNome(String s){
    this.nome = s;
  }
  public void setCpf(String s){
    this.cpf = s;
  }

  public void print(){
    System.out.println(this.getNome());
    System.out.println(this.getCpf());
  }
}
