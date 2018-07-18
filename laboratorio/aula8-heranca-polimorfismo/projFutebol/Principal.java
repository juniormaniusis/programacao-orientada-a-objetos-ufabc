import copadomundo.*;
public class Principal {
  public static void main(String args[]){
    Jogador j1 = new  Lateral(1, "direito");
    j1.imprimirPosicao();
    Jogador j2 = new Goleiro(0);
    j2.imprimirPosicao();
    Jogador j3 = new Lateral(3, "esquerda");
    j3.imprimirPosicao();
    Jogador j4 = new Atacante(10);
    j4.imprimirPosicao();
  }
}
