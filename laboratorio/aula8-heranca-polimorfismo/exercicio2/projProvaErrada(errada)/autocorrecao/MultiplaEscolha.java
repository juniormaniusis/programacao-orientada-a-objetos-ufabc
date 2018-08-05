package autocorrecao;

public class MultiplaEscolha extends Pergunta {

	private Alternativa[] alternativas;

	public MultiplaEscolha(String enunciado) {
		this.alternativas = new Alternativa[2];
		super(enunciado);
	}
	
	public MultiplaEscolha(String enunciado, int numAlternativas) {
		this.alternativas = new Alternativa[numAlternativas];
	}

	public void adicionaAlternativa(String novaAlternativa) {
		adicionaAlternativa(new Alternativa(novaAlternativa));
	}
	
	public void adicionaAlternativa(Alternativa novaAlternativa) throws Exception {
		boolean conseguiuAdicionar = false;
		
		for (int i = 0; i < alternativas.length && !conseguiuAdicionar; i++)
			if (alternativas[i] == null) {
				alternativas[i] = novaAlternativa;
				conseguiuAdicionar = true;
			}
			
		if (conseguiuAdicionar)
			throw new Exception("Nao adicionou alternativa.");
	}
	
	@Override
	public void imprimirPerrgunta() {
		System.out.println("Enunciado: " + this.enunciado);
		for (Alternativa elemento: this.alternativas)
			System.out.println("- " + elemento.getTexto());
	}
	
}