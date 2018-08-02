package estrutura;

public class PilhaCheiaException extends PilhaException {

	private Object elemento = null;
	private int limitePilha;
	
	public PilhaCheiaException(Object elemento, int limitePilha) {
		super("Erro, pilha cheia");
		this.elemento = elemento;
		this.limitePilha = limitePilha;
	}
	
	public Object getItem(){
		return this.elemento;
	}
	
	public int getLimite(){
		return this.limitePilha;
	}
	
}
