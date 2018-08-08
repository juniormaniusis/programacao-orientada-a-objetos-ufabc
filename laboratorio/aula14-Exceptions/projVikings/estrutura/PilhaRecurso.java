package estrutura;
public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable  {
	//DESEMPILHA OS ELEMENTOS AUTOMATICAMENTE
	@Override
	public void close() {
		while(!estaVazia()) {
			desempilha();
		}
	}

	public PilhaRecurso(int num) {
		super(num);
	}

}
