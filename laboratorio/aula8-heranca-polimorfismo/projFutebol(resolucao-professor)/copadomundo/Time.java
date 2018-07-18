package copadomundo;

public class Time {

	private Jogador[] listaJogadores = new Jogador[11];
	
	public void adicionaJogador(Jogador novoJogador) throws Exception {
		int posicaoParaInserir = 0;
		for (int i = 0; i < listaJogadores.length; i++) {
			if (listaJogadores[i] == null) break;
			if (listaJogadores[i].getNumero() < novoJogador.getNumero()) posicaoParaInserir++;
		}
		if (posicaoParaInserir > listaJogadores.length)
			throw new Exception("Nao ha vagas!");
		
		for (int i = listaJogadores.length-1; i > posicaoParaInserir; i--)
			listaJogadores[i] = listaJogadores[i-1];
		listaJogadores[posicaoParaInserir] = novoJogador;
	}
	
	public void substituirJogador(int jogadorSaindo, Jogador jogadorEntrando) throws Exception {
		boolean achou = false;
		for (int i = 0; i < listaJogadores.length && !achou; i++)
			if (listaJogadores[i] != null && listaJogadores[i].getNumero() == jogadorSaindo) {
				achou = true;
				for (int k = i; k < listaJogadores.length-1; k++)
					listaJogadores[k] = listaJogadores[k+1];
			}
		if (!achou)
			throw new Exception("Jogador nao encontrado!");
		listaJogadores[listaJogadores.length-1] = null;
	
		adicionaJogador(jogadorEntrando);
	}
	
	public void imprimir() {
		System.out.println("-- Escalacao ---");
		for (int i = 0; i < listaJogadores.length; i++)
			if (listaJogadores[i] != null)
				listaJogadores[i].imprimir();
	}

}