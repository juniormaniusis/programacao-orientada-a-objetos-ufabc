package planodeensino;
public abstract class Aula {
	private String tipo;
	private String descricao;

	//construtor
	public Aula(String tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}

	//métodos
	public String getTipo() {
		return this.tipo;
	}

	public String getDescricao() {
		return this.descricao;
	}
}