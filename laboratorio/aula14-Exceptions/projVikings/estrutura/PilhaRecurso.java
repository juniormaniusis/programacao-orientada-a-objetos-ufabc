package estrutura;
public class PilhaRecurso extends PilhaAprimorada implements AutoCloseable  {

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