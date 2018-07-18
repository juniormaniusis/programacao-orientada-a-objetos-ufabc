package copadomundo;

public class Jogador {

	private String nome;
	private int numero;
	
	public Jogador(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimir() {
		System.out.println(nome + " " + numero);
	}

}