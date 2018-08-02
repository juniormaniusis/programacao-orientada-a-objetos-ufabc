package estrutura;

public class PilhaAprimorada extends PilhaSimples {

	
	public PilhaAprimorada(int tamanhoMax) {
		super(tamanhoMax);
	}
	

	@Override
	public Object desempilha()  {
		if (!estaVazia()){
			return super.desempilha();
		}
		throw new PilhaVaziaException();
		
		
	}
	
	@Override
	public void empilha(Object novoItem)  {
		if (estaCheia()){
			throw new PilhaCheiaException(novoItem, getTamanhoMax());
		}
		super.empilha(novoItem);
		
	}
	
	public boolean estaVazia() {
		if (getTopo() == -1 ){
			return true;
		}
		return false;
	}
	
	public boolean estaCheia() {
		if (getTopo() == getTamanhoMax() - 1){
			return true;
		}
		return false;
	}
	
	
	
}
