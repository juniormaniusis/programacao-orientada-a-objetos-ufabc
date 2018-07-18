package aulas;

public abstract class Avaliacao extends Aula {

	private static int numAvaliacao = 1;
	private double peso;
	
	public Avaliacao(double peso) {
		this.peso = peso;
		super("Avaliacao " + numAvaliacao++);		
	}
	
	public Avaliacao() {
		this(0.5);
	}
	
	public double getPeso() {
		this.peso;
	}

	@Override
	public String getTipo() {
		return "Avaliacao";
	}
	
}