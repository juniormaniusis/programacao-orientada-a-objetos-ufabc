import aliens.DiscoVoador;
public class Principal{
  public static void main(String[] args){
    DiscoVoador disco1 = new DiscoVoador();
    disco1.setCor("rosa");
    disco1.irParaFrente(100);
    System.out.println("cor = "+disco1.getCor()+" posicao = "
    +disco1.getPosicao());
    
  }
}
