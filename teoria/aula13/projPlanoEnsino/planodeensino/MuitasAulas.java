package planodeensino;
public class MuitasAulas extends Exception {

	public MuitasAulas() {
		super("O limite de aulas para este plano foi ultrapassado!");
	}

	public MuitasAulas(Aula aula, int qtdMaxima) {
		super("\nNão foi possivel adicionar a aula: "+ 
			aula.getDescricao()+"\nO limite é de: "+qtdMaxima);

	}
}