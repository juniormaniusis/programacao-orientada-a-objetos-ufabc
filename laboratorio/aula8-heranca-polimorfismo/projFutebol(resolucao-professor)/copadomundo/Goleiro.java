package copadomundo;

public class Goleiro extends Jogador {

	public Goleiro(String nome, int numero) {
		super(nome, numero);
	}


	@Override
	public void imprimir() {
		System.out.println("Goleiro: " + super.getNome() + " " + super.getNumero());
	}

}