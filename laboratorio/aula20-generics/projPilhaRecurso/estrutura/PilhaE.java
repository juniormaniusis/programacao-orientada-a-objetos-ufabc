package estrutura;

public class PilhaE implements AutoCloseable {

	private int topo;
	private Object[] itens;
	
	public PilhaE(int tamanhoMax) {
		this.itens = new Object[tamanhoMax];
		this.topo = -1;
	}
	
	public void empilha(Object novoItem) {
		if (getTopo() == getTamanhoMax() - 1)
			throw new PilhaCheiaException(getTamanhoMax(), novoItem);
		
		itens[++topo] = novoItem;
	}
	
	public Object desempilha() {
		// verificar pilha vazia
		if (getTopo() == -1)
			throw new PilhaVaziaException();
		
		Object item = itens[topo];
		itens[topo--] = null;
		return item;
	}
	
	int getTopo() {
		return this.topo;
	}
	
	int getTamanhoMax() {
		if (itens != null)
			return this.itens.length;
		else
			return -1;
	}
	
	
	
	@Override
	public void close() {
		int qtdItens = 0;
		while (getTopo() != -1) { //enquanto não estiver vazia
			this.desempilha();
			qtdItens++;
		}
		System.out.println("Pilha esvaziada! Tinha " + qtdItens + "Itens");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
