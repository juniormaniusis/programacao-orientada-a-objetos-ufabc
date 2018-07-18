package autocorrecao;

class VerdadeiroFalso extends Pergunta {

	public VerdadeiroFalso(String enunciado) {
		super(enunciado);
	}
	
	@Override
	public void imprimirPergunta() {
		System.out.println("Enunciado: " + this.enunciado);
		System.out.println("[ ] V ou F");
	}
}