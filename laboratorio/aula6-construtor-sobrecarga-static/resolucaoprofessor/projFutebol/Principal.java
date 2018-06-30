import futebol.*;

public class Principal {

	public static void main(String[] main) {
		try {
			Time time = new Time();
			time.adicionaJogador("Jogador A", "123.345.567-99");
			time.adicionaJogador("Jogador B", "567.345.567-99");
			time.adicionaJogador(new Jogador("Jogador C", new int[]{5, 7, 8, 3, 4, 5, 3, 4, 2, 9, 9}));

			System.out.println(time.removeJogador("567.345.567-99") ? "Jogador removido" : "Jogador nao foi removido");
			time.imprimeEscalacao();
			
			time.adicionaJogador("Jogador D", "578.A45.472-97");
			time.imprimeEscalacao();
		} catch (Exception e) {
			System.out.println("Erro :" + e.toString());
		}
	}

}