import viking.*;
import estrutura.*;


public class Principal {
  public static void main(String[] args) {
    System.out.println("____NAVIO______");
    Viking vLider = new Lider();
    Viking vTimoneiro = new Timoneiro();




    try(Navio navio = new Navio(20);) {
      navio.embarcar(vTimoneiro);
      for (int i = 0; i < 18 ;i++ ) {
        navio.embarcar(new Remador());
      }
      navio.embarcar(new Lider());
    } catch(Exception e) {
      System.out.println("Erro: " + e);
    }


  }
}
