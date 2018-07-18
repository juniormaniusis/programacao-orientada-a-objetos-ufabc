package aulas;

public class PlanoDeAulas extends PlanoFacil, PlanoDificil {

	private Aula[] listaDeAulas;
	private String nomeDisciplina;
	
	public PlanoDeAulas(String nomeDisciplina, int nAulas) {
		this.listaDeAulas = new Aula[nAulas];
		nomeDisciplina = nomeDisciplina;
	}
	
	public void adicionarAula(Aula novaAula) {
		int indiceAdicionar = -1;
		for (int i = 0; i < listaDeAulas.length && indiceAdicionar == -1; i++)
			if (listaDeAulas[i] == null)
				indiceAdicionar = i;
		
		if (indiceAdicionar == -1)
			throw Exception("Lista aulas esta cheia!");
			
		listaDeAulas[indiceAdicionar] = novaAula;
	}
	
	public void imprimirPlano() {
		System.out.println("Plano da disciplina: " + nomeDisciplina);
		for (int i = 0; i < listaDeAulas.length; i++)
			System.out.println("- [" + listaDeAulas[i].getTipo() + "] " + listaDeAulas[i].getDescricao());
	}
	
	String getFormulaAvaliacao() {
		String formula = "";
		for (int i = 0; i < listaDeAulas.length; i++)
			if (listaDeAulas[i] != null && listaDeAulas[i] instanceof Avaliacao) {
				if (!formula.equals(""))
					formula += " + ";
				formula += ((Avaliacao)listaDeAulas[i]).getPeso() + " x " + listaDeAulas[i].getDescricao();
			}
		return formula;
	}
	
	@Override
	public void cancelarProvas() {
		for (int i = 0; i < listaDeAulas.length; i++)
			if (listaDeAulas[i] != null && listaDeAulas[i] instanceof Prova)
				listaDeAulas[i] = null;
	}
	
	@Override
	public void adicionarProvaSurpresa() throws Exception {
		adicionarAula(new Prova(0.8));
	}
	
	public void adicionarOutraProvaSurpresa(double peso) throws Exception {
		adicionarAula(new Prova(peso));
	}
	
	private void mostrarEstadoVetorAulas() {
		for (int i = 0; i < listaDeAulas.length; i++)
			System.out.print(listaDeAulas[i] == null ? "0" : "1");
		System.out.println();
	}

}