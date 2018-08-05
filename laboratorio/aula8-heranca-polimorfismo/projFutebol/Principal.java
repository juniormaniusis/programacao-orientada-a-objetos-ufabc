import copadomundo.*;

import java.util.Scanner;

public class Principal {
  public static void main(String args[]){

    System.out.println("_____TIME ABC_____");
    TimeDeFutebol ABC = new TimeDeFutebol(3);
    ABC.lerTime();
    ABC.imprimir();

    System.out.println("_____TIME DEF_____");
    TimeDeFutebol DEF = new TimeDeFutebol(3);
    DEF.lerTime();
    DEF.imprimir();

    System.out.println("_____ESCALAÇÂO_____");

    System.out.println("_____TIME ABC_____");
    ABC.imprimir();

    System.out.println("_____TIME DEF_____");
    DEF.imprimir();

    //deveria ser criado algum método para isso, porém, estamos apenas realizando
    //alguns testes rápidos, então considero aceitável
    System.out.println("_____SUBSTITUIÇÃO_____");
    System.out.println("Digite o número de um jogador do time ABC: ");
    int subs = (new Scanner(System.in)).nextInt();

    System.out.println("Digite o número de um jogador que estrará no time ABC: ");
    int numCamisa = (new Scanner(System.in)).nextInt();
    System.out.println("Digite a posição do jogador que entrará no time: ");
    System.out.println("(LD) Lateral Direito");
    System.out.println("(LE) Lateral Esquerdo");
    System.out.println("(AT) Atacante");
    System.out.println("(GO) Goleiro");
    String posicao = (new Scanner(System.in)).next();

    Jogador novoJogador = null;

    switch(posicao) {
        case "LD":
            novoJogador = new Lateral(numCamisa, "direita");
        break;
        case "LE":
            novoJogador = new Lateral(numCamisa, "esquerda");
        break;
        case "AT":
            novoJogador = new Atacante(numCamisa);
        break;
        case "GO":
            novoJogador = new Goleiro(numCamisa);
        break;
    }
    ABC.substituicao(novoJogador, subs);
    System.out.println("_____NOVA ESCALAÇÂO_____");

    System.out.println("_____TIME ABC_____");
    ABC.imprimir();

    /*
    TimeDeFutebol time = new TimeDeFutebol(11);
    for (int i = 0; i < 11; i++){
      time.adicionaJogador("AT", i+1);
    }
    time.adicionaJogador("GO", -1);
    time.imprimir();
    System.out.println(time.verificaTime());
    */
  }



}
