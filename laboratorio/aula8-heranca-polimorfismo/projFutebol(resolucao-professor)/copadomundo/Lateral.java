package copadomundo;

public class Lateral extends Jogador {

	private String lado;
	
	public Lateral(String nome, int numero, String lado) {
		super(nome, numero);
		this.lado = lado;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Lateral " + lado + ": " + super.getNome() + " " + super.getNumero());
	}

}