package estrutura;
public class FilaAprimorada extends FilaSimples {
	//novo_fim  == inicio ? -> fila cheia, nao pode enfileirar
	//inicio == fim? ->fila vazia, nao pode desinfileirar

	//construtor
	public FilaAprimorada(int tamanhoMax) {
		super(tamanhoMax);
	}

	//metodos
	boolean estaCheia() {
		return (getFim() + 1) % getTamanhoMax() == getInicio();
	}

	boolean estaVazia() {
		return getInicio() == getFim();
	}
	
	
	@Override
	public void enfileira(Object novoItem) {
		if (estaCheia()) {
			throw new FilaCheiaException(novoItem, getTamanhoMax());
		}
		super.enfileira(novoItem);
	}

	@Override
	public Object desenfileira() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return super.desenfileira();
	}
}