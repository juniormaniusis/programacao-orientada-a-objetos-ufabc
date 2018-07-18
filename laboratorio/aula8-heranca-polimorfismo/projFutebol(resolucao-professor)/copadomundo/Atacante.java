package copadomundo;

public class Atacante extends Jogador {

	public Atacante(String nome, int numero) {
		super(nome, numero);
	}

	@Override
	public void imprimir() {
		System.out.println("Atacante: " + super.getNome() + " " + super.getNumero());
	}

}