package copadomundo;

import java.util.Scanner;


public class TimeDeFutebol {
    private Jogador[] time;
    private int numeroDeJogadores;

    public TimeDeFutebol(int numeroDeJogadores) {
        time = new Jogador[numeroDeJogadores];
    }

    private void ordenaTime() {
        //como o time tem no máximo 11 jogadores, é viável a utilização do bubble sort
        boolean trocou = true;
        while(trocou){
            trocou = false;
            for (int i = 0; i < numeroDeJogadores-1; i++) {
                if (time[i].getCamisa() > time[i+1].getCamisa()){
                    Jogador auxiliar = time[i];
                    time[i] = time[i+1];
                    time[i+1] = auxiliar;
                    trocou = true;
                }
            }
        }
    }

    public void adicionaJogador(Jogador novoJogador) {
        //verifica se pode adicionar
        if (numeroDeJogadores < time.length ) {
            time[numeroDeJogadores] = novoJogador;
            numeroDeJogadores++;
        }
        ordenaTime();
    }

    public void substituicao(Jogador novoJogador, Jogador jogadorAtual) {
        //encontrar a posição de onde o jogadorAtual está
        for (int i = 0; i < numeroDeJogadores; i++) {
            if (time[i].getCamisa() == jogadorAtual.getCamisa()) {
                time[i] = novoJogador;
                ordenaTime();
                return;
            }
        }
        //NÃO ENCONTROU, LANCAR EXCEPTION?
    }
    public void substituicao(Jogador novoJogador, int numCamisaJogadorAtual) {
      for (int i = 0; i < numeroDeJogadores; i++) {
          if (time[i].getCamisa() == numCamisaJogadorAtual) {
            time[i] = novoJogador;
            ordenaTime();
            return;
          }
    }
    public void imprimir() {
        for (Jogador j : time) {
            if (j != null) {
                j.imprimirPosicao();
            }
        }
    }

    public void adicionaJogador(String posicao, int numCamisa) {

        switch(posicao) {
            case "LD":
                adicionaJogador(new Lateral(numCamisa, "direita"));
            break;
            case "LE":
                adicionaJogador(new Lateral(numCamisa, "esquerda"));
            break;
            case "AT":
                adicionaJogador(new Atacante(numCamisa));
            break;
            case "GO":
                adicionaJogador(new Goleiro(numCamisa));
            break;
        }
    }

    public void lerTime() {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < time.length; i++) {

            System.out.println("Digite o número da camisa do jogador: ");
            int numCamisa = teclado.nextInt();

            System.out.println("Escolha a posição do jogador de cammisa " + numCamisa);
            System.out.println("(LD) Lateral Direito");
            System.out.println("(LE) Lateral Esquerdo");
            System.out.println("(AT) Atacante");
            System.out.println("(GO) Goleiro");
            System.out.println("Digite a sigla da posição: ");
            String posicao = teclado.next();

            adicionaJogador(posicao, numCamisa);
        }
    }
}
