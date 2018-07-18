package aulas;

public class Pratica extends Aula {

	public Pratica(String tipo){
		super(tipo);
	}
	@Override
	public String getTipo() {
		return "Pratica";
	}
}
