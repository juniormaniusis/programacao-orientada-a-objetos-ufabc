package viking;
import estrutura.*;
public class Navio extends PilhaAprimorada implements AutoCloseable{

  public Navio(int capacidade){
    super(capacidade);
  }

  public void embarcar(Viking viking) {
    empilha(viking);
  }

  public void desembarcar() {

    ((Viking) super.desempilha()).close();

  }

  @Override
  public void close() {
    while(!estaVazia()){
      desembarcar();
    }
  }
}
