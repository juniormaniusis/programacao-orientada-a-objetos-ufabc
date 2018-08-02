package estrutura;
public class FilaRecurso extends FilaAprimorada implements AutoCloseable {
	
	public FilaRecurso(int numMax) {
		super(numMax);
	}
	public void close() {
		while(!estaVazia()) {
			System.out.println(desenfileira());
		}

		return;
	}
}