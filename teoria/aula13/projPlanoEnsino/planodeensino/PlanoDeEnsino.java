package planodeensino;

public class PlanoDeEnsino {
	//atributos
	private Aula[] aulas;
	private int qtdAulas;
	//construtor
	public PlanoDeEnsino(int qtdLimiteAulas) {
		this.qtdAulas = 0;
		this.aulas = new Aula[qtdLimiteAulas];
	}
	
	//metodos
	public int getQtdAulas() {
		return this.qtdAulas;
	}
	public int getLimiteAulas() {
		return this.aulas.length;
	}

	public void adicionarAula(Aula novaAula) throws Exception{
		//verifica se é possível adionar aula
		if (this.getQtdAulas() < this.getLimiteAulas()) {
			aulas[qtdAulas] = novaAula;
			qtdAulas++;
			return;
		} else {
			throw new MuitasAulas(novaAula, this.getLimiteAulas());
		}
	}

	public String getFormula() {
		String formula = "";
		boolean primeiro = true;
		for (int i = 0; i < this.getQtdAulas(); i++) {
			if (aulas[i] instanceof Prova){
				if (primeiro) {
					formula += aulas[i].getDescricao() + " x " + ((Prova) aulas[i]).getPeso();
					primeiro = false;
				}
				else{
					formula += " + " + aulas[i].getDescricao() + " x " + ((Prova) aulas[i]).getPeso();
				}
			}
		}
			return formula;
	}

	public void imprimir() {
		for (int i = 0; i < this.getQtdAulas(); i++) {
			System.out.println("["+aulas[i].getTipo()+"] "
				 +aulas[i].getDescricao());
		}
	}

}