package planodeensino;

public class Prova extends Aula implements Avaliacao {
	
	private double peso;
	
	//construtor
	public Prova(String descricao, double peso) {
		super("Prova", descricao);
		this.peso = peso;
	}

	@Override
	public double getPeso() {
		return this.peso;
	}
}