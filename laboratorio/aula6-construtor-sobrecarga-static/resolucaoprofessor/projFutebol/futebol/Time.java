package futebol;

public class Time {

	Jogador[] jogadores = new Jogador[11];

	public void adicionaJogador(Jogador jogador) throws Exception {
		boolean adicionou = false;
		for (int i = 0; i < jogadores.length && !adicionou; i++)
			if (jogadores[i] == null) {
				jogadores[i] = jogador;
				adicionou = true;
			}
		if (!adicionou)
			throw new Exception("Nao adicionou jogador! Nao havia vaga!");
	}
	
	public void adicionaJogador(String nome, String ni) throws Exception {
		adicionaJogador(new Jogador(nome, ni));
	}
	
	private int encontraIndiceJogadorPorNI(String ni) {
		for (int i = 0; i < jogadores.length; i++)
			if (jogadores[i].getNI().equals(ni))
				return i;
		return -1;
	}
	public boolean removeJogador(String ni) {
		int indiceJogador = encontraIndiceJogadorPorNI(ni);
		if (indiceJogador < 0) return false;
		
		//this.jogadores[indiceJogador] = null;
		for (int i = indiceJogador; i < jogadores.length - 1; i++)
			this.jogadores[i] = this.jogadores[i+1];
		
		return true;
	}
	
	public void imprimeEscalacao() {
		for (Jogador elemento : jogadores)
			if (elemento != null)
				System.out.println(elemento.getNI() + " " + elemento.getNome());
	}
}