package estrutura;
public class FilaCheiaException extends FilaException {
	private Object item;
	private int limite;
	
	//construtor
	public FilaCheiaException(Object item, int limite) {
		super("Erro, a fila está cheia.");
		this.item = item;
		this.limite = limite;
		System.out.println("O elemento: " + getItem() + " não foi adicionado");
		System.out.println("O limite é : " + getLimite());
	}

	//metodos
	public Object getItem() {
		return this.item;
	}

	public int getLimite() {
		return this.limite;
	}
}