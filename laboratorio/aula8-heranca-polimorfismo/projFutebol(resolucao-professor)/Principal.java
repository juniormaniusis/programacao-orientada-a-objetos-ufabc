import java.util.Scanner;
import copadomundo.*;

public class Principal {

	public static void lerJogadores(Time time, int numJogadores) throws Exception {
		for (int i = 0; i < numJogadores; i++)
				time.adicionaJogador(leJogador());
	}
	
	public static Jogador leJogador() throws Exception {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do jogador:");
		String nome = leitor.next();
		
		System.out.println("Digite o numero da camisa:");
		int numeroCamisa = leitor.nextInt();
		
		System.out.println("Digite o tipo (A: atacante, D: lateral direito, E: lateral esquerdo, G: goleiro):");
		char tipo = leitor.next().charAt(0);
		Jogador novoJogador = null;
		switch (tipo) {
			case 'A': novoJogador = new Atacante(nome, numeroCamisa); break;
			case 'D': novoJogador = new Lateral(nome, numeroCamisa, "direito"); break;
			case 'E': novoJogador = new Lateral(nome, numeroCamisa, "esquerdo"); break;
			case 'G': novoJogador = new Goleiro(nome, numeroCamisa); break;
		}
		return novoJogador;
	}

	public static void main(String[] args) {
	
		try {
			/*
			Testes
			
			Time selecao = new Time();
			
			Atacante a1 = new Atacante("ABC", 9);
			Atacante a2 = new Atacante("DEF", 7);
			
			Lateral l1 = new Lateral("HIJ", 6, "direito");
			Lateral l2 = new Lateral("KLM", 16, "esquerdo");
			Goleiro g1 = new Goleiro("OPQ", 8);
			
			selecao.adicionaJogador(a1);
			selecao.imprimir();
			selecao.adicionaJogador(a2);
			selecao.imprimir();
			selecao.adicionaJogador(l1);
			selecao.imprimir();
			
			selecao.substituirJogador(l1, l2);
			selecao.imprimir();
			selecao.substituirJogador(l2, g1);
			selecao.imprimir();*/
			
			Time abc = new Time();
			System.out.println("TIME ABC");
			lerJogadores(abc, 3);
			
			System.out.println("\nTIME DEF");
			Time def = new Time();
			lerJogadores(def, 3);
			
			abc.imprimir();
			def.imprimir();
			
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o numero do jogador que vai sair:");
			int numeroSair = leitor.nextInt();
			Jogador novoJogador = leJogador();
			abc.substituirJogador(numeroSair, novoJogador);
			
			abc.imprimir();
			def.imprimir();
			
				
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	
	}

}